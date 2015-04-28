package org.joea.quicksort;

public class QuickSortMain {
	private static int arr[]=new int[10];
	public static void main(String[] args) {
		
		init(arr);
		QuickSort quickSort=new QuickSort();
		quickSort.insert(arr);
		quickSort.display();
		quickSort.quickSort(0, arr.length-1);
		quickSort.display();
	}
	
	private static void init(int[] arr){
		for(int i=0;i<arr.length;i++){
			arr[i]=(int) (Math.random()*100);
		}
	}
}
