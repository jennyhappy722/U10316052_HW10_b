//u10316052
import java.util.*;
public class TestBuble {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		//input array lengh
		System.out.println("please input array lengh");
	
		int n=scanner.nextInt();
		//new lengh n array
		int[] number = new int[n];
		U10316052Buble Buble=new U10316052Buble();
		//input inside number
		System.out.println("please input  number");
		for(int i=0;i<=n-1;i++){
			number[i]= scanner.nextInt();
		}
		Buble.bubble_sort(number);
		//print
		for(int i = 0; i < number.length; i++) 
			System.out.print(number[i] + " ");
		System.out.println();
	}
}
