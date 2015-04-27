package com.joea;

public class SelectSortClass {

	public  int[] _array;

	public SelectSortClass(int[] _array) {
		this._array = _array;
		_Radom();

	}

	//随机生成1到100的10个数
	public  void _Radom() {
		for (int i = 0; i < _array.length; i++) {
			_array[i] = (int) (Math.random() * 100);
		}
		System.out.println("生成的数据：");
		for (int element : _array) {
			
			System.out.printf("%4d", element);
		}
		System.out.println();
	}

	//从大到小排序
	public  void sort(int[] data) {
		int index;
		for (int i = 0; i < _array.length - 1; i++) {
			index = i;
			for (int j = i+1; j < _array.length; j++) {
				if (_array[index] <= _array[j]) {
					index = j;
				}
			}
			//进行数据交换
			swap(index,i);
			System.out.printf("第%d排序：",i+1);
			display();
			System.out.println();
		}
		System.out.println("从大到小：");
		display();
		System.out.println();
	}
	
	private void swap(int index,int i){
		int temp;
		temp = _array[index];
		_array[index] = _array[i];
		_array[i] = temp;
	}
	
	private void display(){
		for (int element : _array) {
			System.out.printf("%4d", element);
		}
	}
}
