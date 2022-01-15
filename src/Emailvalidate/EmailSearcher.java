package Emailvalidate;
public class EmailSearcher {
	String[] emails =  { 
			"manasa.madal46@gmail.com" ,
			"madalamanasa146@yahoo.com" ,
			"manu05@hotmail.com",
			"example@yahoo.com", 
			"example@google.com",
			"user@domain.com", 
			"user@domain.co.in", 
			"user.name1@domain.com", 
			"user_name1@domain.com", 
			"user@yahoo.corporate.in"
	};

public boolean SearchEmail(String emailToSearch) {

		for (String email : emails) {
			if (email.contentEquals(emailToSearch)) {
				return true;
			}
		}
		return false;
	}
}

