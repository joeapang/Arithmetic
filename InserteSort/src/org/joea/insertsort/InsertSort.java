package org.joea.insertsort;

/**
 * ��������
 * 
 * @author Joea
 * 
 */

public class InsertSort {
	private int[] arr;


	public InsertSort() {
	}
	//��ʼ������
	public void insert(int[] arr){
		this.arr=arr;
	}
	//��ӡ����
	public void display(){
		for (int element : arr) {
			System.out.print(element+" ");
		}
		System.out.println("");
	}
	
	public void insertSort(){
		//�����1�����򣬴ӵ�2����ʼ
		for(int i=1;i<arr.length;i++){
			//�ѵ�i����Ϊ������Ԫ��
			int flag=arr[i];
			//��¼����λ�õ��±�
			int index=i;
			//��i-1��λ�ñ������򲿷֣�Ѱ���ʺϵĲ���λ��
			for(int j=i-1;j>=0;j--){
				//���������Ԫ�ؽ�С�����ϴ��Ԫ�����κ��ƣ�ֱ���������λ��
				if(arr[j]>flag){
					arr[j+1]=arr[j];
					//��¼���ա�λ�õ��±�
					index=j;
				}else{
					//����ҵ�����λ�ã����������ѭ������ʼ������һԪ��
					break;
				}
			}
			//����Ԫ�ز��뵽����λ��
			arr[index]=flag;
		}
		System.out.println("���������ݣ�");
		display();
	}
}
