package week1.day2;

public class SumOfEvenOddElements {
	
	public static void main(String[] args) {
		int even = 0;
		int odd = 0;
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
		
		for(int i=0; i<arr.length; i++) {
			if (arr[i]%2 == 0) {
				even = even + arr[i];				
			}else {
				odd = odd +arr[i];
			}
		}
		System.out.println("the sum of even element is: "+ even);
		System.out.println("the sum of odd element is: "+ odd);
	}
}
