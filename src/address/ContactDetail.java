package address;

import java.util.ArrayList;
import java.util.List;

	public class ContactDetail {
	    private final List<Contact> contactList = new ArrayList<>();


	    public void addNewContact() {
	        Contact contact = new Contact();

	        contact.setFirstName(ScannerUtil.getString("Enter First name: "));
	        contact.setLastName(ScannerUtil.getString("Enter Last name: "));
	        contact.setAddress(ScannerUtil.getString("Enter Address: "));
	        contact.setCity(ScannerUtil.getString("Enter City: "));
	        contact.setState(ScannerUtil.getString("Enter State: "));
	        contact.setZip(ScannerUtil.getInt("Enter Zip code: "));
	        contact.setPhoneNumber(ScannerUtil.getLong("Enter Phone number: "));
	        contact.setEmail(ScannerUtil.getString("Enter Email: "));
	       

	        contactList.add(contact);

	    }

	}