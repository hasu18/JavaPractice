package allfunctioninterface;

public class MainStringLoop {

	public static void main(String[] args) {

		String name[]= {"name","harsh","jigo","parth","babu"};
		int a[]= {1,2,3,4,5};
		int result=0;
//		for(int i=0;i<5;i++) {
//			System.out.println(name[i]+"  "+a[i]);
//		}
//	
//		for(int j=0;j<a.length;j++) {
//			int b=a[j];
//			result = result + b;
//			
//		}System.out.println(result);
		
		
//		int num1 = 10;
//		int num2 = 11;
//		
//	    for(int i = 0; i <= num1 ; i++) {	
//		
//		System.out.println("num1 "+num1);
//		
//		System.out.println("num 2  "+num2--);
//	    }
		
		
//		for(int i=a.length-1;i>=0;i--) {
//			System.out.println(a[i]);
//		}

	String firstName = "madam";
	String secondName = "parth";
//	for(int i=firstName.length()-1;i>=0;i--) {
//		char fn=firstName.charAt(i);
//		System.out.println(fn);
//		}
//	for (int i =secondName.length()-1;i>=0;i--) {
//		char sn=secondName.charAt(i);
//		System.out.println(sn);
//	}
	int j=secondName.length()-1;

	for (int i=0;i<firstName.length();i++) {
		char h=firstName.charAt(i);
		
//	  System.out.println(" j " + j);	
		
		char b=secondName.charAt(j);
//		System.out.println("putside for loop   "+b+ " equals " +h);

		if(h==b) {
			System.out.println(b+ " equals " +h);
		}
		else {
			System.out.println(b+" not equal "+h);
		}
		j--;
		
		
	}
	}

}
