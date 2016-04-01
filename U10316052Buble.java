//u10316052
import java.util.*;
public class U10316052Buble {
	//input array
	public static void bubble_sort(int[] arr) {
		int i, j, temp, len = arr.length;
		for (i = 0; i < len - 1; i++)
			for (j = 0; j < len - 1 - i; j++)
				if (arr[j] > arr[j + 1]) {
					//swap
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
	}

}
