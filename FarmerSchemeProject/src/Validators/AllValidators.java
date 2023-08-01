package Validators;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AllValidators {

	public static boolean validateEmail(String inputStr) {
		  if(inputStr==null || inputStr=="") {
			  return false;
		  }
			 String emailRegex= "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
				        + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
			 Pattern emailPat=Pattern.compile(emailRegex);
			 Matcher matcher=emailPat.matcher(inputStr);
			
			  
			  return matcher.find();
			  
			  
		 }
	 
	
	
}


