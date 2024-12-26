package com.cms.repository;

/**
 * @author HARIHARASUDHAN B V
 * @version 1.0
 * Interface to promote abstraction of the Data-Access Object(DAO) of Interactions 
 */
import java.util.List;

import com.cms.modal.Interactions;

public interface InteractionsInterface {
	public boolean doInsertInteractions(Interactions interaction);

	public boolean doDeleteInteraction(int id);

	public boolean doUpdateInteraction(Interactions interaction);

	public Interactions getInteractions(int id);

	public List<Interactions> getAllInteractions();
}
