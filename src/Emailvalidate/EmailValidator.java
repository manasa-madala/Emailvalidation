package Emailvalidate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class EmailValidator {
final String regex = "^[\\w!#$%&’*+/=?`{|}~^-]+(?:\\.[\\w!#$%&’*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";
final Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
public boolean Validate (String email) {
	Matcher matcher = pattern.matcher(email);

	if (matcher.find()) {
		return true;
	}
	else 
		return false;
}
}
