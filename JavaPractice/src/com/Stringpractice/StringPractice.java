package com.Stringpractice;

public class StringPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "java string9split method1by javatpoint";

		String[] splittedAray = s1.split("\\d");

		for (int i = 0; i < splittedAray.length; i++) {

			System.out.println(" splittedAray " + splittedAray[i]);

		}

	}

}
