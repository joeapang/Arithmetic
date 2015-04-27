package org.joea.bubblesort;

public class ArrayBub {

	private long[] arr;
	
	ArrayBub(int max){
		arr=new long[max];
	}
	//插入数据
	public void insert(long[] value){
		arr=value;
		
	}
	//打印数据
	public void display(){
		for (long elem : arr) {
			System.out.print(elem+" ");
		}
		System.out.println("");
	}
	
	public void bubbleSort(){
		int out,in;
		//外部进行N-1次循环
		for(out=arr.length;out>1;out--){
			for(in=0;in<out-1;in++){
				//如果前面的数据大，就就换两个数的位置
				if(arr[in]>arr[in+1]){
					swap(in,in+1);
				}

			}
			System.out.printf("第%d次排序后的结果：",arr.length-out+1);
			display();
		}
	}
	//交换数据
	private void swap(int i,int j){
		long temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
}
