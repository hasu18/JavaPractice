package javaPracticeTest1;

import javaPracticeTest1.callfunction;


public class MainClassPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//			callfunction calfun=new callfunction();

		String praArray[] = { "name", "1", "2", "james12", "parth234", "12htc" };

//		for (int i = 0; i < praArray.length; i++) {
//			String value = praArray[i];
//			for (int j = 0; j < value.length(); j++) {
//				char[] charArray =value.toCharArray();
//		 boolean valueaa = Character.isDigit(charArray[j]);
//		         if(valueaa) {
//		             System.out.println(charArray[j]);
//		          }
//		         
//			}
//		}
		
//		
		for (int i = 0; i < praArray.length; i++) {
	try {
	String value = praArray[i];
			int a= Integer.valueOf(value);
			System.out.println(a);
		}
	catch(Exception e){
//		e.printStackTrace();
		System.out.println("catch block");
		}
			
//			for (int j = 0; j < value.length(); j++) {
//				boolean flag = 	Character.isDigit(j);
//				if(flag)
//				{
//					System.out.println(flag+ " is a digit.");
//				}
//				else
//				{
//					System.out.println(flag+ " is not a digit.");
//				}
//			}
		}

	}

}
