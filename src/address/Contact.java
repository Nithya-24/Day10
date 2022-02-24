package address;

import java.util.HashMap;


	public class Contact {

	String firstName, lastName, phoneNumber, email, address, toString;

	/**
	 * Default constructor used for testing. This must be inserted here since we
	 * have a custom constructor and java no longer creates a default
	 * constructor when you have a custom constructor. You must initialize your
	 * objects here.
	 */

	public Contact() {
		firstName = lastName = phoneNumber = email = address = toString = null;
		this.customField = new HashMap<String,String>();
	}

	public Contact(String firstName, String lastName, String phoneNumber,
			String email, String address) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.address = address;
		this.customField = new HashMap<String,String>();
	}

	
	public String getFirstName() {
		return firstName;
	}

	
	public void setFirstName(String firstName) {
		this.firstName = firstName;

	}

	
	public String getLastName() {
		return lastName;
	}

	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public HashMap<String, String> getCustomFields() {
//			if(customField == null)
//				customField = new HashMap<String,String>();			
			return customField;
	}

	public void setCustomField(String fieldName, String fieldValue) {
//		if(customField == null)
//			customField = new HashMap<String,String>();
		customField.put(fieldName, fieldValue);
	}

	/**
	 * Provides a string representation of a contact. Use your string parsing
	 * knowledge to make the string look like what's required by the contact
	 * tests.
	 * 
	 * @return a string representation of a contact
	 */
	public String toString() {

		toString = "First Name: " + firstName + "\nLast Name: " + lastName
				+ "\nPhone Number: " + phoneNumber + "\nEmail Address: "
				+ email + "Address: " + address;
		if (customField.size() == 0)
			return toString;
		else {
			for (String key : customField.keySet())
				toString = toString + "\n" + key + ": " + customField.get(key);
			return toString;
		}

	}

	//Declares a new HashMap so that "customField" can be stored
	private HashMap<String, String> customField;

}
