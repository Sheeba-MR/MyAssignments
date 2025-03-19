package week3.day2;

public class JavaConnection extends MySqlConnection {

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
		System.out.println("Executed the update");
		
	}
	
	public static void main(String[] args) {
		JavaConnection j = new JavaConnection();
		j.connect();
		j.disconnect();
		j.executeUpdate();
		j.executeQuery();
	}

}
