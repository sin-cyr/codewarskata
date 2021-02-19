package kata.codewars;

import java.util.Arrays;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] myarr = new int[] {2,3,4,5,6,7,1};
		//System.out.println(map(myarr).toString());
		
	}

	
	//given an array return it with each numbers doubled
	//option 1
	public static int[] map(int[] arr) {
		int[] doubledArray = new int[arr.length];
		
		for (int i=0; i<arr.length; i++) {
			doubledArray[i] = arr[i] * 2;
		//	System.out.println(doubledArray[i]);
		}
		return doubledArray;
	}
	//option 2
	public static int[] map2(int[] arr) {

		return Arrays.stream(arr).map(x -> x*2).toArray();
	}
}
