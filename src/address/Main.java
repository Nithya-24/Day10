package address;

import java.util.Scanner;

public class Main {
	 Scanner input = new Scanner(System.in);

	public int mainMenu() {
        System.out.println("Main Menu: 1.Add Contact");
        System.out.print("Enter your choice: ");
        return input.nextInt();
    }

    public void userSelection() {
        ContactDetail contactDetail = new ContactDetail();
        do {
            int choice = mainMenu();
            if (choice == 1) {
                contactDetail.addNewContact();
                System.out.println("Contact added ");
            } else {
                break;
            }
        } while (true);
    }
	
	public static void main(String[] args) {

		 System.out.println("Welcome to Address Book Program ");
		 /* 
		AddressBook obj = new AddressBook ("abc","XYZ","22 E","qwer", "TN", "626109","987654354","abc@def.com");
        System.out.println(obj.firstName);
        System.out.println(obj.lastName);
        System.out.println(obj.address);
        System.out.println(obj.city);
        System.out.println(obj.state);
        System.out.println(obj.zip);
        System.out.println(obj.phoneNumber);
        System.out.println(obj.email);
		System.out.println(obj.address);
		*/
		Main usermenu = new Main();
		usermenu.userSelection();
	}
	
}
	   

	
