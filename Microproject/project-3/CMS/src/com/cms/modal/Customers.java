package com.cms.modal;

/**
 * @author HARIHARASUDHAN B V
 * @version 1.0 Represents the domain-specific data of the Customer table.Promotes Encapsulation.
 */
public class Customers {
	private int customer_Id;
	private String first_Name;
	private String last_Name;
	private String email;
	private String phone_Number;
	private String address;
	private String date_Of_Birth;
	private String registration_Date;
	private String status;
	private String preferred_Contact;
	private Interactions interaction;

	public Customers() {
		super();
	}

	public Customers(int customer_Id, String first_Name, String last_Name, String email, String phone_Number,
			String address, String date_Of_Birth, String registration_Date, String status, String preferred_Contact,
			Interactions interaction) {
		this.customer_Id = customer_Id;
		this.first_Name = first_Name;
		this.last_Name = last_Name;
		this.email = email;
		this.phone_Number = phone_Number;
		this.address = address;
		this.date_Of_Birth = date_Of_Birth;
		this.registration_Date = registration_Date;
		this.status = status;
		this.preferred_Contact = preferred_Contact;
		this.interaction = interaction;
	}

	public int getCustomer_Id() {
		return customer_Id;
	}

	public void setCustomer_Id(int customer_Id) {
		this.customer_Id = customer_Id;
	}

	public String getFirst_Name() {
		return first_Name;
	}

	public void setFirst_Name(String first_Name) {
		this.first_Name = first_Name;
	}

	public String getLast_Name() {
		return last_Name;
	}

	public void setLast_Name(String last_Name) {
		this.last_Name = last_Name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone_Number() {
		return phone_Number;
	}

	public void setPhone_Number(String phone_Number) {
		this.phone_Number = phone_Number;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDate_Of_Birth() {
		return date_Of_Birth;
	}

	public void setDate_Of_Birth(String date_Of_Birth) {
		this.date_Of_Birth = date_Of_Birth;
	}

	public String getRegistration_Date() {
		return registration_Date;
	}

	public void setRegistration_Date(String registration_Date) {
		this.registration_Date = registration_Date;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getPreferred_Contact() {
		return preferred_Contact;
	}

	public void setPreferred_Contact(String preferred_Contact) {
		this.preferred_Contact = preferred_Contact;
	}

	public Interactions getInteraction() {
		return interaction;
	}

	public void setInteraction(Interactions interaction) {
		this.interaction = interaction;
	}

	@Override
	public String toString() {
		return "Customers [customer_Id=" + customer_Id + ", first_Name=" + first_Name + ", last_Name=" + last_Name
				+ ", email=" + email + ", phone_Number=" + phone_Number + ", address=" + address + ", date_Of_Birth="
				+ date_Of_Birth + ", registration_Date=" + registration_Date + ", status=" + status
				+ ", preferred_Contact=" + preferred_Contact + ", interaction=" + interaction + "]";
	}

}
