package org.joea.mergesort;

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

	private void recMergeSort(int[] temp, int lowerBound, int upperBound) {
		if (lowerBound == upperBound) {
			return;
		} else {
			int mid = (lowerBound + upperBound) / 2;
			recMergeSort(temp, lowerBound, mid);
			recMergeSort(temp, mid + 1, upperBound);
			merge(temp, lowerBound, mid + 1, upperBound);
		}
	}

	private void merge(int[] temp, int lowPtr, int highPtr, int upperBound) {
		int j = 0;
		int lowerBound = lowPtr;
		int mid = highPtr - 1;
		int n = upperBound - lowerBound+1;

		while (lowPtr <= mid && highPtr <= upperBound) {
			if (arr[lowPtr] < arr[highPtr]) {
				temp[j++] = arr[lowPtr++];
			} else {
				temp[j++] = arr[highPtr++];
			}
		}

		while (lowPtr <= mid) {
			temp[j++] = arr[lowPtr++];
		}
		while (highPtr <= upperBound) {
			temp[j++] = arr[highPtr++];
		}
		for (j = 0; j < n; j++) {
			arr[lowerBound + j] = temp[j];
		}
	}
}
