package com.bridgeLabz.fundooNotes.service;

import com.bridgeLabz.fundooNotes.model.dto.NoteDTO;

/**
 * This interface has the UnImplemented functionality of registering note,
 * updating status of note, archive, trash, pinning functionality of the user's
 * note after verifying with the identity.
 * 
 * @author Durgasankar Mishra
 * @created 2020-01-22
 * @version 1.0
 */
public interface INoteService {
	/**
	 * UnImplemented functionality of creating a personalized note of a customer
	 * after validating the authorization token.
	 * 
	 * @param noteDto as {@link NoteDTO} input parameter
	 * @param token   as String input parameter
	 * @return Boolean
	 */
	public boolean createNote(NoteDTO noteDto, String token);

	/**
	 * UnImplemented functionality of updating a personalized note of a customer
	 * after validating the authorization token and note id.
	 * 
	 * @param noteDto as {@link NoteDTO} input parameter
	 * @param noteId  as long input parameter
	 * @param token   as String input parameter
	 * @return Boolean
	 */
	public boolean updateNote(NoteDTO noteDto, long noteId, String token);

	/**
	 * UnImplemented functionality of deleting a personalized note of a customer
	 * after validating the authorization token based on note id .
	 * 
	 * @param noteId as long input parameter
	 * @param token  as String input parameter
	 * @return Boolean
	 */
	public boolean deleteNote(long noteId, String token);

	/**
	 * UnImplemented functionality of archiving a personalized note of a customer
	 * after validating the authorization token based on note id .
	 * 
	 * @param noteId as long input parameter
	 * @param token  as String input parameter
	 * @return Boolean
	 */
	public boolean archieveNote(long noteId, String token);

	/**
	 * UnImplemented functionality of pinning a personalized note of a customer
	 * after validating the authorization token based on note id .
	 * 
	 * @param noteId as long input parameter
	 * @param token  as String input parameter
	 * @return Boolean
	 */
	public boolean pinNote(long noteId, String token);

	/**
	 * UnImplemented functionality of adding a personalized note of a customer to
	 * trash after validating the authorization token based on note id .
	 * 
	 * @param noteId as long input parameter
	 * @param token  as String input parameter
	 * @return Boolean
	 */
	public boolean trashNote(long noteId, String token);

}
