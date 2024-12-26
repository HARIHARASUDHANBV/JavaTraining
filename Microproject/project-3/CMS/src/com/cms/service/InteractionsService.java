package com.cms.service;

/**
 * @author HARIHARASUDHAN B V
 * @version 1.0
 * Service layer of the Interactions Schema.
 */
import com.cms.modal.Interactions;
import com.cms.repository.InteractionsInterface;
import com.cms.repository.InteractionsRepository;

public class InteractionsService implements InteractionServiceInterface {
	InteractionsInterface interactionRepo = new InteractionsRepository();

	public String insertinteractionsValidation(Interactions interaction) {
		String result;
		if (interaction == null) {
			result = "Interaction Object is null";
		} else if (interaction.getInteraction_Id() == 0 || interaction.getCustomer_Id() == 0
				|| interaction.getInteraction_Date() == null || interaction.getInteraction_Type() == null
				|| interaction.getDescription() == null && interaction.isFollow_Up_Required() == false
				|| interaction.getFollow_Up_Date() == null || interaction.getInteraction_Result() == null) {
			result = "Invalid Interaction data";
		} else {
			boolean flag = interactionRepo.doInsertInteractions(interaction);
			if (flag) {
				result = "Interaction_Object_saved";
			} else {
				result = "Interaction_Object_not_saved";
			}
		}
		return result;
	}

	public String deleteInteractionsValidation(int id) {
		String result = "";
		if (id == 0) {
			result = "Invalid id";
		} else {
			boolean flag = interactionRepo.doDeleteInteraction(id);
			if (flag) {
				result = "Interaction_Object_Deleted";
			} else {
				result = "Interaction_Object_Not_Found";
			}

		}
		return result;
	}

	public String updateInteractionsValidation(Interactions interaction) {
		String result;
		if (interaction == null) {
			result = "Interaction Object is null";
		} else if (interaction.getInteraction_Id() == 0 || interaction.getCustomer_Id() == 0
				|| interaction.getInteraction_Date() == null || interaction.getInteraction_Type() == null
				|| interaction.getDescription() == null && interaction.isFollow_Up_Required() == false
				|| interaction.getFollow_Up_Date() == null || interaction.getInteraction_Result() == null) {
			result = "Invalid Department data";
		} else {
			boolean flag = interactionRepo.doUpdateInteraction(interaction);
			if (flag) {
				result = "Interaction_Object_updated";
			} else {
				result = "Interaction_Object_not_found";
			}
		}
		return result;
	}

	public String getInteractionsValidation(int id) {
		String result = "";
		if (id == 0) {
			result = "Invalid id";
		} else {
			Interactions interaction = interactionRepo.getInteractions(id);
			if (interaction != null) {
				result = interaction.toString();
			} else {
				result = "Interaction_Object_Not_Found";
			}

		}
		return result;
	}

	public String getAllInteractionsValidation() {
		return interactionRepo.getAllInteractions().toString();
	}

}
