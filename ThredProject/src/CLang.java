
public class CLang implements Language, Runnable {

	@Override
	public void showMessage() {
		System.out.println("C Program is running");
		
	}

	@Override
	public void run() {
		showMessage();
		
	}
	
}
