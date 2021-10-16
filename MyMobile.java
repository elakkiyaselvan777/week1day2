package week1.day2;

public class MyMobile {
	public int makecalls() {
		int i = 10;
		int j = 20;
		int k = i+j;
		return k;
	}
	public void sendmsg(int value, String str) {
		System.out.println(value);
		System.out.println(str);
	}
	private void paybill(int amount) {
		System.out.println(amount);
	}
	public static void main(String[] args) {
		MyMobile ref1 = new MyMobile();
		
		int value = ref1.makecalls();
        System.out.println(value);
        
        ref1.sendmsg(10, "hi");
        
        ref1.paybill(100);
    }
}
