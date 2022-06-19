import java.util.Random;
import java.util.Scanner;

public class Employee 
{
	public Employee(String finame, String laname, String dep)
	{
		String email = generateemail(finame, laname, dep);
		char[] pass = generatePassword(8);
		showcred(finame, laname, email, pass);
	}
	public static void main(String[] args)
	{
	    System.out.println("Please enter the department from the following:");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resourse");
		System.out.println("4. Legal");
		Scanner myobj = new Scanner(System.in);
		String department = myobj.nextLine();
		int dep = Integer.parseInt(department); 
		String dept=" ";
		switch(dep)
		{
		case 1:
			dept = "tech";
			break;
		case 2:
			dept = "admin";
			break;
		case 3:
			dept = "hr";
			break;
		case 4:
			dept = "legal";
			break;
		default:
			System.out.println("error");
		}
		
		System.out.println("Please enter first name:");
		Scanner obj1 = new Scanner(System.in);
		String fname = obj1.nextLine();
		System.out.println("Please enter last name:");
		Scanner obj2 = new Scanner(System.in);
		String lname = obj2.nextLine();
		
		OOPLab1 myobj3 = new OOPLab1(fname, lname, dept);
		
}
private static void showcred(String firname, String lasname, String emailid, char[] passw)
{
	System.out.println("Dear " + firname + " your generated credentials are as follows");
	System.out.println("Email ------>" + emailid);
	System.out.println("Password --->" + passw);
}

private static String generateemail(String firname,String lasname, String deptart )
{

	return(firname + lasname + "@" + deptart + ".abc.com");
}

private static char[] generatePassword(int length) 
{
      String capitalCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
      String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
      String specialCharacters = "!@#$";
      String numbers = "1234567890";
      String combinedChars = capitalCaseLetters + lowerCaseLetters + specialCharacters + numbers;
      Random random = new Random();
      char[] password = new char[length];

      password[0] = lowerCaseLetters.charAt(random.nextInt(lowerCaseLetters.length()));
      password[1] = capitalCaseLetters.charAt(random.nextInt(capitalCaseLetters.length()));
      password[2] = specialCharacters.charAt(random.nextInt(specialCharacters.length()));
      password[3] = numbers.charAt(random.nextInt(numbers.length()));
   
      for(int i = 4; i< length ; i++) {
         password[i] = combinedChars.charAt(random.nextInt(combinedChars.length()));
      }
      return password;
}
}
