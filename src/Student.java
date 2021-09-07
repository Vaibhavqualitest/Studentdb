//
//public class Student {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Student1 s1= new Student1("Rakesh", "987898789");
//		s1.enroll("Math ");
//		s1.enroll("English ");
//		s1.enroll("Java");
//		s1.checkBalance();
//		s1.showCourses();
//		s1.payTution(50);
//		System.out.println(s1.toString());
//	}
//
//}
//
//class Student1{
//	private static int id=1000;
//	private String name;
//	private String SSN;
//	private String email;
//	private String userId;
//	private String courses="";
//	private final static int fee=100;
//	private int balance=0;
//	private String phone="";
//	private String city="";
//	private String state="";
//	
//	
//	public Student1(String name, String ssn) {
//		id++;
//		this.name=name;
//		this.SSN=ssn;
//		setUserId();
//		setEmail();
//		
//	}
//	private void setEmail() {
//		email = name+ id + "" +".qualitest.com";
//		System.out.println("Email is: "+ email);
//	}
//	
//	private void setUserId() {
//		int maximum=9000;
//		int minimum=1000;
//		int resid= (int) (Math.random() * (maximum-minimum));
//		userId=id+""+resid+SSN.substring(4);
//		System.out.println("Your user id is: "+userId);
//		System.out.println(resid);
//	}
//	
//	public void enroll(String courses) {
//		this.courses = this.courses+ "\n" + courses;
//		balance=balance+fee;
//		System.out.println("You are enrolled for "+courses+ "course");
//	}
//	
//	public void payTution(int amount) {
//		balance = balance -amount;
//		System.out.println("You have paid rs."+amount+" And your balance rs."+balance);
//	}
//	
//	public void checkBalance() {
//		System.out.println("Your balance: rs. "+ balance);
//	}
//	
//	public void showCourses() {
//		System.out.println(courses);
//	}
//	
//	public String toString() {
//		return ("Name: "+name + "\nCourses: "+courses+"\nBalance: "+balance);
//	}
//	public String getPhone() {
//		return phone;
//	}
//	public void setPhone(String phone) {
//		this.phone = phone;
//	}
//	public String getCity() {
//		return city;
//	}
//	public void setCity(String city) {
//		this.city = city;
//	}
//	public String getState() {
//		return state;
//	}
//	public void setState(String state) {
//		this.state = state;
//	}
//}



// Try-Catch block example
import java.util.*;
//class Student{
//	public static void main(String[] args) {
////		Scanner s=new Scanner(System.in);
////		int n=s.nextInt();
//		 try  
//	        {  
//	        int data=50/0; //may throw exception   
//	        }  
//	            //handling the exception  
//	        catch(Exception e)  
//	        {  
//	            System.out.println("Ethis is the error");  
//	        }  
//	        System.out.println("rest of the code");  
//	    
//		
//		
//	}
//}



// user-defined exceptions
class NegativePaymentException extends Exception {
	public NegativePaymentException() {
		System.out.println("Error is coming ");
	}
}

class Student{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the withdrawal amount: ");
		int value=s.nextInt();
		try {
			if(value<0) {
				throw new NegativePaymentException();
			}
		}
		catch(NegativePaymentException e){
			System.out.println("Negative Payment is invalid.");
			System.out.println(e);
		}
		
	}
}