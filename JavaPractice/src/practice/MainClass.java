package practice;

import function.CalculationFunction;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CalculationFunction func = new CalculationFunction();
		
		Calculation cal = new Calculation()	;
	    cal.setA(12);
	   cal.setB(15);
	   
	   Calculation cal2 = new Calculation()	;
	   
	   Calculation cal3 = cal;
	   
	   System.out.println(" cal " + cal);
	   System.out.println(" cal2 "+ cal2);
	   System.out.println(" cal3 "+ cal3);
	   
	  float result1 = func.floatAdd(1.01f, 2.2f);
	 
	   int firstViariable = cal.getA();
	   int secondVariable = cal.getB();
	   
	  int result2 = func.add(firstViariable, secondVariable);
	   
	  System.out.println(" result1 " + result1  + " result2 "+ result2);
	  
	   
		
	}

}
