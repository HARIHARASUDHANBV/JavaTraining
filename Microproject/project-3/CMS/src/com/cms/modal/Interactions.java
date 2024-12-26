package com.cms.modal;

/**
 * @author HARIHARASUDHAN B V
 * @version 1.0 Domain-specific data of Interactions table.Has referential
 *          Integrity with Customers.
 */
public class Interactions {
	private int interaction_Id;
	private int customer_Id;
	private String interaction_Date;
	private String interaction_Type;
	private String description;
	private boolean follow_Up_Required;
	private String follow_Up_Date;
	private String interaction_Result;

	public Interactions() {
		super();
	}

	public Interactions(int interaction_Id, int customer_Id, String interaction_Date, String interaction_Type,
			String description, boolean follow_Up_Required, String follow_Up_Date, String interaction_Result) {
		this.interaction_Id = interaction_Id;
		this.customer_Id = customer_Id;
		this.interaction_Date = interaction_Date;
		this.interaction_Type = interaction_Type;
		this.description = description;
		this.follow_Up_Required = follow_Up_Required;
		this.follow_Up_Date = follow_Up_Date;
		this.interaction_Result = interaction_Result;
	}

	public int getInteraction_Id() {
		return interaction_Id;
	}

	public void setInteraction_Id(int interaction_Id) {
		this.interaction_Id = interaction_Id;
	}

	public int getCustomer_Id() {
		return customer_Id;
	}

	public void setCustomer_Id(int customer_Id) {
		this.customer_Id = customer_Id;
	}

	public String getInteraction_Date() {
		return interaction_Date;
	}

	public void setInteraction_Date(String interaction_Date) {
		this.interaction_Date = interaction_Date;
	}

	public String getInteraction_Type() {
		return interaction_Type;
	}

	public void setInteraction_Type(String interaction_Type) {
		this.interaction_Type = interaction_Type;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean isFollow_Up_Required() {
		return follow_Up_Required;
	}

	public void setFollow_Up_Required(boolean follow_Up_Required) {
		this.follow_Up_Required = follow_Up_Required;
	}

	public String getFollow_Up_Date() {
		return follow_Up_Date;
	}

	public void setFollow_Up_Date(String follow_Up_Date) {
		this.follow_Up_Date = follow_Up_Date;
	}

	public String getInteraction_Result() {
		return interaction_Result;
	}

	public void setInteraction_Result(String interaction_Result) {
		this.interaction_Result = interaction_Result;
	}

	@Override
	public String toString() {
		return "Interactions [interaction_Id=" + interaction_Id + ", customer_Id=" + customer_Id + ", interaction_Date="
				+ interaction_Date + ", interaction_Type=" + interaction_Type + ", description=" + description
				+ ", follow_Up_Required=" + follow_Up_Required + ", follow_UpDate=" + follow_Up_Date
				+ ", interaction_Result=" + interaction_Result + "]";
	}

}
