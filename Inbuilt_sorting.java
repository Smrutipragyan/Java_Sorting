import java.util.*;
public class Inbuilt_sorting {

	public static void print(Integer arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer arr[]= { 2,3,1,4,5};
		    //Arrays.sort(arr);
		    //Arrays.sort(arr,0,2);
		Arrays.sort(arr,Collections.reverseOrder()); //Collections.reverseOrder will work on only Array Objects but not on normal arrays
		    print(arr);
	}

}
