package week1.day2;

public class CopyElementsOneToAnotherArray {

	public static void main(String[] args) {
		int[] arr = {2,4,6,8,10,12,14,16,18,20};
		int[] copyarr = new int[arr.length];
		
		for (int i=0; i<copyarr.length; i++) {
			copyarr[i] = arr[i];		
		}
		for (int i=0; i<copyarr.length; i++) {
			System.out.print(copyarr[i]+ " ");
		}
	}

}
