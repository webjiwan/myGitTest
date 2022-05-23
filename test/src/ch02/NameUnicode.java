package ch02;

public class NameUnicode {

	public static void main(String[] args) {
	
		char name1 = '\uC774';
		char name2 = '\uC9C0';
		char name3 = '\uC644';
		
		System.out.println("=================");
		System.out.print(name1 + " ");
		System.out.print(name2 + " ");
		System.out.println(name3);
	
		
		System.out.println("-----------------");
		
		System.out.println(name1);
		System.out.println(name2);
		System.out.println(name3);
		System.out.println("=================");

	}

}
