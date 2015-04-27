package org.joea.bubblesort;

public class ArrayBub {

	private long[] arr;
	
	ArrayBub(int max){
		arr=new long[max];
	}
	//��������
	public void insert(long[] value){
		arr=value;
		
	}
	//��ӡ����
	public void display(){
		for (long elem : arr) {
			System.out.print(elem+" ");
		}
		System.out.println("");
	}
	
	public void bubbleSort(){
		int out,in;
		//�ⲿ����N-1��ѭ��
		for(out=arr.length;out>1;out--){
			for(in=0;in<out-1;in++){
				//���ǰ������ݴ󣬾;ͻ���������λ��
				if(arr[in]>arr[in+1]){
					swap(in,in+1);
				}

			}
			System.out.printf("��%d�������Ľ����",arr.length-out+1);
			display();
		}
	}
	//��������
	private void swap(int i,int j){
		long temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
}
