package algorithm;

public class week5quickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {43,51,76,10,73,82,36,98};
		int low = 0;
		int high = arr.length-1;
		quickSort(arr,low,high);
		printAll(arr);
		
	}
	
	static int partition(int[] A,int low,int high) {
		int i =low+1;
		int j = high;
		int temp;
		while(i<=j) {
			if(A[i]<A[low]) {
				i++;
			} else if(A[j]>A[low]) {
				j--;
			} else {
				temp = A[i];
				A[i] = A[j];
				A[j] = temp;
				i++; j--;
			}
		}
		
		temp = A[low];
		A[low] =A[j];
		A[j] = temp;
		
		
		return j;
		
	}
	
	static void quickSort(int[] A, int low, int high) {
		int s;
		if(low<high) {
			s=partition(A,low,high);
			quickSort(A,low,s-1);
			quickSort(A,s+1,high);
		}
	}
	
	static void printAll(int[] A) {
		for(int i=0; i<A.length; i++) {
			System.out.print(A[i]+" ");
			
		}
	}
	
	

}
