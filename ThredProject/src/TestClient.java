import java.util.Scanner;

public class TestClient {

	public static void main(String[] args) {
		CLang cl = new CLang();
		JavaLang jl = new JavaLang();
		Thread ct = new Thread(cl);
		Thread jt = new Thread(jl);
		Scanner sc = new Scanner(System.in);
		String choice;
	
		
		
		do {
			System.out.println("Please enter your choice which class has higher priority,enter 'C' or 'Java'");
			choice = sc.next();
		}
		while(choice.compareTo("Java") !=0 && choice.compareTo("C")!=0);
		
		
		if(choice.compareTo("C")==0) {
			ct.setPriority(10);
			jt.setPriority(1);
		} 
			
		else {
			ct.setPriority(1);
			jt.setPriority(10);
		}
			
		
			
		System.out.println(
	            "CLang priority : "
	            + ct.getPriority());	
		System.out.println(
	            "JavaLang priority : "
	            + jt.getPriority());	
		
		ct.start();
		jt.start();
			
	}
}
