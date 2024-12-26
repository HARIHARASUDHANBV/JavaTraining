package com.cms.view;

/**
 * @author HARIHARASUDHAN B V
 * @version 1.0
 * Represents the view of Interactions schema.
 */

import java.util.Scanner;

import com.cms.modal.Interactions;
/**
 * data-fields
 */
public class InteractionsView {
	static Scanner scan = new Scanner(System.in);
	static int interaction_Id, customer_Id;
	static String interaction_Type, description, interaction_Result, interaction_Date, follow_Up_Date;;
	static boolean follow_Up_Required;
     
	public static void printResult(String result) {
		System.out.println(result);
	}


	public static Interactions insertInteractionView() {

		System.out.print(
				"Enter Interaction_id,Customer ID,Interaction Date (yyyy-MM-dd):,Interaction Type:,Description:Follow-Up Required (true/false):, Follow-Up Date,Interaction Result");
		interaction_Id = scan.nextInt();
		customer_Id = scan.nextInt();
		interaction_Date = scan.next();
		interaction_Type = scan.next();
		description = scan.next();
		follow_Up_Required = scan.nextBoolean();
		follow_Up_Date = scan.next();
		interaction_Result = scan.next();
		return new Interactions(interaction_Id, customer_Id, interaction_Date, interaction_Type, description,
				follow_Up_Required, follow_Up_Date, interaction_Result);
	}

	public static int deleteInteractionView() {
		System.out.println("Enter customer_id");

		return scan.nextInt();
	}

	public static Interactions updateInteractionView() {
		System.out.print(
				"Enter Interaction_id,Customer ID,Interaction Date (yyyy-MM-dd):,Interaction Type:,Description:Follow-Up Required (true/false):, Follow-Up Date,Interaction Result");
		interaction_Id = scan.nextInt();
		customer_Id = scan.nextInt();
		interaction_Date = scan.next();
		interaction_Type = scan.next();
		description = scan.next();
		follow_Up_Required = scan.nextBoolean();
		follow_Up_Date = scan.next();
		interaction_Result = scan.next();
		return new Interactions(interaction_Id, customer_Id, interaction_Date, interaction_Type, description,
				follow_Up_Required, follow_Up_Date, interaction_Result);
	}

	public static int findInteractionView() {
		System.out.println("Enter interaction_id");

		return scan.nextInt();
	}
}
