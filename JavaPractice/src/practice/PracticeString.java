package practice;

public class PracticeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String firstName = "John";
        String lastName = "Mac";
        
        String compareName = "John";
        
        compareName.concat("MIke");
        
        System.out.println("compare " + compareName);
        
        StringBuffer newCompare = new StringBuffer("John");
        newCompare.append("Mike");
		System.out.println(newCompare);
        
       System.out.println(firstName.equals(lastName)); 
	
	   System.out.println(lastName.equals(compareName));
	   
	   System.out.println(compareName.equals(firstName));
	   System.out.println(firstName.equals(newCompare));
	}
	

}
