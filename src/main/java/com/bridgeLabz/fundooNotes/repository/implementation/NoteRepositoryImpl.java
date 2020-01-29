package com.bridgeLabz.fundooNotes.repository.implementation;

import java.util.List;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bridgeLabz.fundooNotes.model.Note;
import com.bridgeLabz.fundooNotes.repository.INoteRepository;

/**
 * This class implements {@link INoteRepository} and defines the implementation
 * functionality of adding available methods in the interface which uses The
 * EntityManager and the EntityManagerFactory provide an unwrap method which
 * returns the corresponding classes of the JPA implementation.
 * 
 * @author Duragasankar Mishra
 * @created 2020-01-27
 * @version 1.0
 */
@Repository
@SuppressWarnings("rawtypes")
public class NoteRepositoryImpl implements INoteRepository {

	@Autowired
	private EntityManager entityManager;

	/**
	 * The EntityManager and the EntityManagerFactory provide an unwrap method which
	 * returns the corresponding classes of the JPA implementation then access the
	 * save functionality and after successfully saving the data in the database
	 * returns the data which is saved in the database.
	 */
	@Override
	@Transactional
	public Note saveOrUpdate(Note newNote) {
		Session session = entityManager.unwrap(Session.class);
		session.saveOrUpdate(newNote);
		return newNote;
	}

	/**
	 * The EntityManager and the EntityManagerFactory provide an unwrap method which
	 * returns the corresponding classes of the JPA implementation and by using HQL
	 * customized query from current session and fetching operation is carried out
	 * which returns the unique {@link Note} from data from database.
	 */
	@Override
	@Transactional
	public Note getNote(long noteId) {
		Session session = entityManager.unwrap(Session.class);
		Query query = session.createQuery(" FROM Note WHERE noteId=:id");
		query.setParameter("id", noteId);
		return (Note) query.uniqueResult();
	}

	/**
	 * The EntityManager and the EntityManagerFactory provide an unwrap method which
	 * returns the corresponding classes of the JPA implementation and by using HQL
	 * customized query from current session and fetching operation is carried out
	 * which returns boolean value after deleting the data from database.
	 */
	@Override
	@Transactional
	public boolean isDeletedNote(long noteId) {
		Session session = entityManager.unwrap(Session.class);
		Query query = session.createQuery("DELETE FROM Note WHERE noteId=:id");
		query.setParameter("id", noteId);
		query.executeUpdate();
		return true;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Note> getAllNotes(long userId) {
		Session session = entityManager.unwrap(Session.class);
		return session.createQuery("FROM Note WHERE user_id=:id and is_trashed=false and is_archived=false")
				.setParameter("id", userId).getResultList();

	}

}
