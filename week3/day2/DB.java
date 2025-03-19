package week3.day2;

public class DB implements DatabaseConnection {

	@Override
	public void connect() {
		System.out.println("Connected");
		
	}

	@Override
	public void disconnect() {
		System.out.println("Disconnected");
		
	}

	@Override
	public void executeUpdate() {
		System.out.println("Updated");
		
	}
	
	public static void main(String[] args) {
		DB d = new DB();
		d.connect();
		d.disconnect();
		d.executeUpdate();
	}
	

}
