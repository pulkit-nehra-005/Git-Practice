package basics;
//Encapsulation
//to avoid breaking of others code we make relevant changes in setter and getter methods.
class second{
	Integer id = 5;
	
	public Integer getId() {
		
		return id;
	}
	public Integer setId(Integer id) {
		
		return id;
	}

}

public class first {
	public static void main(String[] args) {
		System.out.println("Hello World");
		second sd = new second();
//		value after getting the second
		int val = sd.getId();
		System.out.println("Given Value is: "+val);
		int setval = sd.setId(3);
		System.out.println("Value after setting is: "+setval);
	}	
}



