package algorithm;

public class binarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr = {10,20,25,35,45,55,60,75,80,90,95};
		int low =0;
		int high = arr.length;
		System.out.println("35는 "+binarySearch(arr,low,high,35)+"번째");
	}
	
	static int binarySearch(int []arr, int low, int high, int key ) {
		int result = 0;
		if (low>high) result= -1;
		
		int mid = (low+high)/2;
		if (key == arr[mid]) {
			result= mid;
		} else if (key<arr[mid]) {
			result = binarySearch(arr,low,mid-1,key);
		} else {
			result =binarySearch(arr,mid+1,high,key);
		}
		
		return result;
		
		
	}

}
