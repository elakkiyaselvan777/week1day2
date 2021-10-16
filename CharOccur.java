package week1.day2;


public class CharOccur {

	public static void main(String[] args) {
		String str = "welcome to chennai";
		int count = 0;
		
		char[] chararr = str.toCharArray();
		
		for(int i=0; i<chararr.length; i++) {
			if (chararr[i] == 'e') {
				count++;				
			}
		}
		System.out.println(count);

	}

}
