package week3.day2;

public class CheckBoxButton extends Button {

	public void clickCheckButton() {
		System.out.println("Clicked check button");
	}
	
	public static void main(String[] args) {
		CheckBoxButton c = new CheckBoxButton();
		c.clickCheckButton();
		c.submit();
	}
}
