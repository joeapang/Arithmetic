package org.joea.mergesort;

/**
 * �鲢����
 * 
 * @author Joea
 * 
 */

public class MergeSort {

	private int[] arr;

	public MergeSort() {
	}

	public void insert(int[] arr) {
		this.arr = arr;
	}

	public void display() {
		for (int i : arr) {
			System.out.print(i + "  ");
		}
		System.out.println();
	}

	public void mergeSort() {
		int[] temp = new int[arr.length];
		recMergeSort(temp, 0, arr.length - 1);
	}

	/**
	 * ��������й鲢����
	 * 
	 * @param temp
	 * @param lowerBound
	 * @param upperBound
	 */

	private void recMergeSort(int[] temp, int lowerBound, int upperBound) {
		// ����Ϊ����Ϊ1ֱ�ӷ���
		if (lowerBound == upperBound) {
			return;
		} else {
			// ȡ��������м�λ��
			int mid = (lowerBound + upperBound) / 2;

			// ���������ݹ�����
			recMergeSort(temp, lowerBound, mid);
			// ���ұ�����ݹ�����
			recMergeSort(temp, mid + 1, upperBound);
			// �ϲ�����õ�����
			merge(temp, lowerBound, mid + 1, upperBound);
		}
	}

	/**
	 * �ϲ��Ѿ��ź��������
	 * 
	 * @param temp
	 *            ��������
	 * @param lowPtr
	 *            ����������ʵ�±�
	 * @param midPtr
	 *            ���������м��±�
	 * @param upperBound
	 *            ��������ĩβ�±�
	 */
	private void merge(int[] temp, int lowPtr, int midPtr, int upperBound) {
		int j = 0;
		int lowerBound = lowPtr;
		//�ұ��������ʵ�±�
		int mid = midPtr - 1;
		int n = upperBound - lowerBound + 1;

		// ��������һ�αȽ����������е�����
		while (lowPtr <= mid && midPtr <= upperBound) {
			if (arr[lowPtr] < arr[midPtr]) {
				temp[j++] = arr[lowPtr++];
			} else {
				temp[j++] = arr[midPtr++];
			}
		}
		// ��ʣ������ݷ�����ʱ������
		while (lowPtr <= mid) {
			temp[j++] = arr[lowPtr++];
		}
		// ��ʣ������ݷ�����ʱ������
		while (midPtr <= upperBound) {
			temp[j++] = arr[midPtr++];
		}
		// ����ʱ�����е����ݿ�����������
		for (j = 0; j < n; j++) {
			arr[lowerBound + j] = temp[j];
		}
	}
}
