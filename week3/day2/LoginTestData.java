package week3.day2;

public class LoginTestData extends TestData_assignment {
	
	public void enterUsername() {
		System.out.println("Enter your username");
	}
	
	public void enterPassword() {
		System.out.println("Enter your password");
	}
	
	public static void main(String[] args) {
		LoginTestData l = new LoginTestData();
		l.enterCredentials();
		l.navigateToHomePage();
		l.enterUsername();
		l.enterPassword();
	}
}
