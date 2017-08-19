package com.github.implementation;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class EqualizeTheArray {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		for(int i=0;i<n;i++){
			Integer key = in.nextInt();
			Integer value = map.get(key);
			if(value == null){
				value=1;
			}else{
				value++;
			}
			map.put(key, value);
		}
		Integer maxValue = null;
		for(Map.Entry<Integer,Integer> entry : map.entrySet()){
			if(maxValue==null || entry.getValue()>maxValue){
				maxValue = entry.getValue();
			}
		}
		System.out.println(n-maxValue);
	}
}
