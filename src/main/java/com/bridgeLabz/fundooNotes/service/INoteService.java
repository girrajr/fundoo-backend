package com.bridgeLabz.fundooNotes.service;

import com.bridgeLabz.fundooNotes.model.dto.NoteDTO;

/**
 * This interface has the UnImplemented functionality of registering the user
 * and verifying with the identity.
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
	 * @param noteDto as NoteDto class input parameter
	 * @param token   as String input parameter
	 * @return Boolean
	 */
	public boolean createNote(NoteDTO noteDto, String token);

}
