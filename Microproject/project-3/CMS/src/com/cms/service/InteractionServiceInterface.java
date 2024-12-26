package com.cms.service;

import com.cms.modal.Interactions;

/**
 * @author HARIHARASUDHAN B V
 * @version 1.0 
 * Interface to promote abstraction for the Service layer of
 *          Interactions.
 */
public interface InteractionServiceInterface {
	public String insertinteractionsValidation(Interactions interaction);

	public String deleteInteractionsValidation(int id);

	public String updateInteractionsValidation(Interactions interaction);

	public String getInteractionsValidation(int id);

	public String getAllInteractionsValidation();

}
