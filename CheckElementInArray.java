package week1.day2;

public class CheckElementInArray {

	public static void main(String[] args) {
		int[] arr = {24,5,6,7,8,33,54,32,11,29};
		int findelement = 33;
		
		for (int i=0; i<arr.length; i++) {
			if (findelement == arr[i]) {
				System.out.println(arr[i]);
				break;
			}			
		}
	}
}
