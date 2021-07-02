package practice;

import java.util.Locale;

public class MainStringupper {

	public static void main(String[] args) {
		
		String s1 = "hello string";
		String turkish = s1.toUpperCase(Locale.forLanguageTag("tr"));
		String english = s1.toUpperCase(Locale.forLanguageTag("en"));
		
		System.out.println(turkish);// will print I with dot on upper side
		System.out.println(english);
		

	}

}
