package org.joea.mergesort;

/**
 * 归并排序
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
	 * 对数组进行归并排序
	 * 
	 * @param temp
	 * @param lowerBound
	 * @param upperBound
	 */

	private void recMergeSort(int[] temp, int lowerBound, int upperBound) {
		// 数组为长度为1直接返回
		if (lowerBound == upperBound) {
			return;
		} else {
			// 取得数组的中间位置
			int mid = (lowerBound + upperBound) / 2;

			// 将左边数组递归排序
			recMergeSort(temp, lowerBound, mid);
			// 将右边数组递归排序
			recMergeSort(temp, mid + 1, upperBound);
			// 合并排序好的数组
			merge(temp, lowerBound, mid + 1, upperBound);
		}
	}

	/**
	 * 合并已经排好序的数组
	 * 
	 * @param temp
	 *            待排数组
	 * @param lowPtr
	 *            待排数组其实下标
	 * @param midPtr
	 *            待排数组中间下标
	 * @param upperBound
	 *            待排数组末尾下标
	 */
	private void merge(int[] temp, int lowPtr, int midPtr, int upperBound) {
		int j = 0;
		int lowerBound = lowPtr;
		//右边数组的其实下标
		int mid = midPtr - 1;
		int n = upperBound - lowerBound + 1;

		// 从左往右一次比较两个数组中的数据
		while (lowPtr <= mid && midPtr <= upperBound) {
			if (arr[lowPtr] < arr[midPtr]) {
				temp[j++] = arr[lowPtr++];
			} else {
				temp[j++] = arr[midPtr++];
			}
		}
		// 将剩余的数据放入临时数组中
		while (lowPtr <= mid) {
			temp[j++] = arr[lowPtr++];
		}
		// 将剩余的数据放入临时数组中
		while (midPtr <= upperBound) {
			temp[j++] = arr[midPtr++];
		}
		// 将临时数组中的数据拷贝到数组中
		for (j = 0; j < n; j++) {
			arr[lowerBound + j] = temp[j];
		}
	}
}
