package org.joea.bubblesort;

public class BubbleSort {

	public static void main(String[] args) {
		int maxSize=200;
		ArrayBub arrayBub=new ArrayBub(maxSize);
		long[] arr={11,33,44,66,77,99,22,55,88};
		arrayBub.insert(arr);
		System.out.println("����ǰ��");
		arrayBub.display();
		
		arrayBub.bubbleSort();
		System.out.println("�����");
		arrayBub.display();
	}
	
	
}
