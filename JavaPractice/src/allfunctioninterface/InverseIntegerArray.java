package allfunctioninterface;

public class InverseIntegerArray {

	public static void main(String[] args) {
		int k;
		int a[]= {5,8,9,7,4,3};
		 for (int i=0;i<a.length;i++) {
			 for(int j=0;j<a.length;j++) {
				 if(a[i]<a[j]) {
					 k=a[i];
					 a[i]=a[j];
					 a[j]=k;
				 }
			 }
			 
		 }
		
		 for(int h=0; h<a.length;h++) {
			 System.out.print(a[h]+" ");}
	}

}
