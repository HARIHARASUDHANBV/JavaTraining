package com.cms.main;

import java.util.Scanner;

import com.cms.modal.Customers;
import com.cms.modal.Interactions;
import com.cms.service.CustomerService;
import com.cms.service.InteractionsService;
import com.cms.view.CustomersView;
import com.cms.view.InteractionsView;

public class CMSApp {

	public static void main(String[] args) {
		// Composition
		CustomerService customerService = new CustomerService();
		InteractionsService interactionService = new InteractionsService();

		String result = "";
		Interactions i1;
		Customers c1;
		int id;
		String msg = "";
		do {
			int ch = CustomersView.menu();
			switch (ch) {
			case 1:
				c1 = CustomersView.insertCustomersView();
				result = customerService.insertCustomerValidation(c1);
				CustomersView.printResult(result);
				break;

			case 2:
				id = CustomersView.deleteCustomersView();
				result = customerService.deleteCustomerValidation(id);
				CustomersView.printResult(result);
				break;

			case 3:
				c1 = CustomersView.updateCustomersView();
				result = customerService.updateCustomerValidation(c1);
				CustomersView.printResult(result);
				break;

			case 4:
				id = CustomersView.findCustomersView();
				result = customerService.findCustomerValidation(id);
				CustomersView.printResult(result);
				break;

			case 5:
				result = customerService.findAllCustomersValidation();
				CustomersView.printResult(result);
				break;

			case 6:
				i1 = InteractionsView.insertInteractionView();
				result = interactionService.insertinteractionsValidation(i1);
				InteractionsView.printResult(result);
				break;
			case 7:
				id = InteractionsView.deleteInteractionView();
				result = interactionService.deleteInteractionsValidation(id);
				InteractionsView.printResult(result);
				break;
			case 8:
				i1 = InteractionsView.updateInteractionView();
				result = interactionService.updateInteractionsValidation(i1);
				InteractionsView.printResult(result);
				break;
			case 9:
				id = InteractionsView.findInteractionView();
				result = interactionService.getInteractionsValidation(id);
				InteractionsView.printResult(result);
				break;
			case 10:
				result = interactionService.getAllInteractionsValidation();
				InteractionsView.printResult(result);
				break;
			case 11:
				System.exit(0);
				break;
			}
			msg = CustomersView.toContinue();
		} while (msg.equalsIgnoreCase("Yes"));
	}

}
