package practice;

public class InverseString {

	public static void main(String[] args) {

		String name = "harsh";
		char b[]=new char[name.length()];
		int k[] = new int[name.length()];
		int m;
		for (int i = 0; i < name.length(); i++) {
			char a = name.charAt(i);
			int j = a;
			k[i] = j;
		}
		for (int j = 0; j < k.length; j++) {

			for (int i = 0; i < k.length; i++) {
				if (k[j] < k[i]) {
					m = k[j];
					k[j] = k[i];
					k[i] = m;

				}
			}

		}
		for(int i=0;i<k.length;i++) {
//			System.out.println(k[i]+" ");
			b[i]=(char) k[i];
		}
		for(int i=0;i<k.length;i++) {
System.out.print(b[i]+" ");		}
	}

}
