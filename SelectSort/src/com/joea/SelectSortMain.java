package com.joea;

import java.util.Arrays;

public class SelectSortMain {
	
	public static final int ARRAY_MAX_LENGTH = 10;// 定义数组的最大长度
	
	public static void main(String[] args){
		
		int[] _array=new int[ARRAY_MAX_LENGTH];
		SelectSortClass selectsort=new SelectSortClass(_array);
		selectsort.sort(_array);
		Arrays.sort(_array);//Java自带的sort方法是从小到大进行选择排序
		for(int element:_array){
			System.out.printf("%4d", element);
		}
	} 

}
