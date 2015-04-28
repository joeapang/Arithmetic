package org.joea.quicksort;

/**
 * ��������
 * 
 * @author Joea
 * 
 */
public class QuickSort {

	private int[] arr;

	public void insert(int[] arr) {
		this.arr = arr;
	}

	public void display() {
		for (int element : arr) {
			System.out.print(element +"  ");
		}
		System.out.println();
	}

	/**
	 * �����������������п�������
	 * 
	 * @param arr
	 *            ��Ҫ�������������
	 */
	public void quickSort( int low, int high) {
		if (low < high) {
			// ����������
			int index = partition(arr, low, high);
			// ������������򣨵ݹ飩
			quickSort( low, index - 1);
			// �ұ����������򣨵ݹ飩
			quickSort( index + 1, high);
		}
	}

	/**
	 * ������arr[low...high],����Ϊarr[low...index-1]��arr[index]��arr[index+1... high]��
	 * ʹ��arr[index+1...high]�е�ÿһ��Ԫ�ض����ڵ���arr[index]��
	 * ��arr[low...index-1]�е�ÿһ��Ԫ�ض�С��arr[index]�� ���м����±�indexҲ�ǻ��ֵ�һ���֡�
	 * 
	 * @param arr
	 *            ��Ҫ���ֵ�����
	 * @param low
	 *            ��Ҫ���ֵ�������ʼ�±�
	 * @param high
	 *            ��Ҫ���ֵ�����ĩβ�±�
	 * @return
	 */
	private int partition(int[] arr, int low, int high) {

		// ѡȡ����ĩβλ�õ�Ԫ����Ϊ��Ԫ��Χ����������������
		int key = arr[high];
		// ����������ָ�룬���ȶ�λ�����������ʼ��ַ֮ǰ
		int i = low - 1;

		// �������������鵽�����ڶ���Ԫ�أ�������һ��Ԫ���Ѿ���Ϊ��Ԫ
		for (int j = low; j <= high - 1; j++) {
			// �����Ԫ��С�ڻ������Ԫkey
			if (arr[j] <= key) {
				// ������������ָ������ƶ�һλ
				i++;
				// ����arr[i]��arr[j]
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		// ѭ����ֹʱ��j = high����ʱ�������Ѿ������ֳ����������ϣ�
		// ����С�ڵ���key��Ԫ�صļ��ϣ����д���key��Ԫ�صļ��ϣ�ֻ��һ��Ԫ��key�ļ���
		// ��ʱarr[i+1]��һ������key��ֵ����arr[i+1]>arr[high]
		// ���Խ���arr[i+1]��arr[high]��ʹarr[high]��key���ں��ʵ�λ��
		int temp = arr[i + 1];
		arr[i + 1] = arr[high];
		arr[high] = temp;
		// ����arr[high]=key���ڵ���λ��
		return i + 1;
	}
}