package org.joea.insertsort;

public class InsertSortMain {

	public static void main(String[] args) {
		int[] array = new int[10];
		for (int i = 0; i < array.length; i++) {
			array[i] = (int)(Math.random() * 100);
		}
		InsertSort arr = new InsertSort();

		arr.insert(array);
		System.out.println("原始数据：");
		arr.display();
		arr.insertSort();
		
	}

}
