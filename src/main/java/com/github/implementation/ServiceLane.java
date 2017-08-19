package com.github.implementation;

import java.util.Scanner;

public class ServiceLane {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int n = in.nextInt();
	int t = in.nextInt();
	int a[] = new int[n];
	for(int i=0;i<n;i++){
		a[i] = in.nextInt();
	}
	for(int itr=0;itr<t;itr++){
		int i = in.nextInt();
		int j = in.nextInt();
		Integer min=null;
		for(int x=i;x<=j;x++){
			if(min==null || a[x]<min){
				min = a[x];
			}
		}
		if(min>=3){
			System.out.println(3);
		}else if(min>=2){
			System.out.println(2);
		}else if(min>=1){
			System.out.println(1);
		}
	}
}
}
