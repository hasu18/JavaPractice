package practice;

public class MainStringClasssForSlipt {

	public static void main(String[] args) {
		
	
		String s1="java string split method by javatpoint";
		String[] words=s1.split("\\d");//splits the string based on string
		//using java for each loop to print elements of string array
		for(String w:words)
		System.out.println(w);
	}

}
