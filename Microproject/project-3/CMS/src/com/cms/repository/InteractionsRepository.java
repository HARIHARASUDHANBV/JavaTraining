package com.cms.repository;

/**
 * @author HARIHARASUDHAN B V
 * @version 1.0
 * Represents the Data-Access_Object for the Interactions table
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import com.cms.modal.Interactions;
import com.cms.util.DBUtility;

public class InteractionsRepository implements InteractionsInterface {
	public boolean doInsertInteractions(Interactions interaction) {
		boolean flag = false;
		String str = "insert into Interactions values(?,?,?,?,?,?,?,?)";
		try (Connection conn = DBUtility.getDBConnection(); PreparedStatement ps = conn.prepareStatement(str)) {
			ps.setInt(1, interaction.getInteraction_Id());
			ps.setInt(2, interaction.getCustomer_Id());
			ps.setString(3, interaction.getInteraction_Date());
			ps.setString(4, interaction.getInteraction_Type());
			ps.setString(5, interaction.getDescription());
			ps.setBoolean(6, interaction.isFollow_Up_Required());
			ps.setString(7, interaction.getFollow_Up_Date());
			ps.setString(8, interaction.getInteraction_Result());

			int n = ps.executeUpdate();
			if (n == 1) {
				flag = true;
			}
		} catch (SQLException e) {
			System.out.println("Insert Query not Executed" + " " + e);
		}
		return flag;
	}

	public boolean doDeleteInteraction(int id) {
		boolean flag = false;
		String str = "DELETE FROM Interactions WHERE interaction_id = ?";
		try (Connection connection = DBUtility.getDBConnection();
				PreparedStatement ps = connection.prepareStatement(str)) {

			ps.setInt(1, id);
			int n = ps.executeUpdate();
			if (n == 1) {
				flag = true;
			}
		} catch (SQLException e) {
			System.out.println("Delete Query not Executed" + " " + e);
		}
		return flag;
	}

	public boolean doUpdateInteraction(Interactions interaction) {
		boolean flag = false;
		String str = "UPDATE Interactions SET interaction_type = ?, WHERE interaction_id = ?";
		try (Connection connection = DBUtility.getDBConnection();
				PreparedStatement ps = connection.prepareStatement(str)) {

			ps.setString(1, interaction.getInteraction_Type());
			ps.setInt(2, interaction.getInteraction_Id());

			int n = ps.executeUpdate();
			if (n == 1) {
				flag = true;
			}

		} catch (SQLException e) {
			System.out.println("Update Query is not executed" + " " + e);
		}
		return flag;
	}

	public Interactions getInteractions(int id) {
		Interactions interaction = null;

		try {
			Connection conn = DBUtility.getDBConnection();
			String str = "select * from Interactions where interaction_id=?";
			PreparedStatement ps = conn.prepareStatement(str);
			ps.setInt(1, id);
			ResultSet resultSet = ps.executeQuery();

			while (resultSet.next()) {
				interaction = new Interactions();
				interaction.setInteraction_Id(resultSet.getInt("interaction_id"));
				interaction.setCustomer_Id(resultSet.getInt("customer_id"));
				interaction.setInteraction_Date(resultSet.getString("interaction_date"));
				interaction.setInteraction_Type(resultSet.getString("interaction_type"));
				interaction.setDescription(resultSet.getString("description"));
				interaction.setFollow_Up_Required(resultSet.getBoolean("follow_up_required"));
				interaction.setFollow_Up_Date(resultSet.getString("follow_up_date"));
				interaction.setInteraction_Result(resultSet.getString("interaction_result"));

			}

		} catch (SQLException e) {
			System.out.println("Find Query not executed" + " " + e);
		}
		return interaction;
	}

	public List<Interactions> getAllInteractions() {
		List<Interactions> list = new LinkedList<Interactions>();
		String query = "SELECT * FROM Interactions";
		try (Connection connection = DBUtility.getDBConnection();
				PreparedStatement statement = connection.prepareStatement(query);
				ResultSet resultSet = statement.executeQuery()) {

			while (resultSet.next()) {
				Interactions interaction = new Interactions();
				interaction.setInteraction_Id(resultSet.getInt("interaction_id"));
				interaction.setCustomer_Id(resultSet.getInt("customer_id"));
				interaction.setInteraction_Date(resultSet.getString("interaction_date"));
				interaction.setInteraction_Type(resultSet.getString("interaction_type"));
				interaction.setDescription(resultSet.getString("description"));
				interaction.setFollow_Up_Required(resultSet.getBoolean("follow_up_required"));
				interaction.setFollow_Up_Date(resultSet.getString("follow_up_date"));
				interaction.setInteraction_Result(resultSet.getString("interaction_result"));

				list.add(interaction);
			}
		} catch (SQLException e) {
			System.out.println("FindAll Query not executed" + " " + e);
		}
		return list;
	}
}
