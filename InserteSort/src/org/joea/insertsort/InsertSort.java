package org.joea.insertsort;

/**
 * 插入排序
 * 
 * @author Joea
 * 
 */

public class InsertSort {
	private int[] arr;


	public InsertSort() {
	}
	//初始化数组
	public void insert(int[] arr){
		this.arr=arr;
	}
	//打印数组
	public void display(){
		for (int element : arr) {
			System.out.print(element+" ");
		}
		System.out.println("");
	}
	
	public void insertSort(){
		//假设第1个有序，从第2个开始
		for(int i=1;i<arr.length;i++){
			//把第i个作为代插入元素
			int flag=arr[i];
			//记录插入位置的下标
			int index=i;
			//从i-1的位置遍历有序部分，寻找适合的插入位置
			for(int j=i-1;j>=0;j--){
				//如果待插入元素较小，将较大的元素依次后移，直到插入合适位置
				if(arr[j]>flag){
					arr[j+1]=arr[j];
					//记录“空”位置的下标
					index=j;
				}else{
					//如果找到合适位置，这跳出这个循环，开始操作下一元素
					break;
				}
			}
			//将该元素插入到合适位置
			arr[index]=flag;
		}
		System.out.println("排序后的数据：");
		display();
	}
}
