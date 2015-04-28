package org.joea.mergesort;

public class MergeSortMain {
	public static void main(String[] args) {

		int[] array = new int[10];
		init(array);
		MergeSort arr=new MergeSort();
		arr.insert(array);
		arr.display();
		arr.mergeSort();
		arr.display();
		
	}
	
	private static void init(int[] array){
		for(int i=0;i<array.length;i++){
			array[i]=(int)(Math.random()*100);
		}
	}
}
