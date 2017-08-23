package com.github.implementation;

import java.util.Scanner;

public class BeautifulTriplets {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int d = in.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++){
			a[i] = in.nextInt();
		}
		int numberoftriplets = 0;
		for(int i=0;i<n-2;i++){
			int count = 0;
			int sequence = a[i];
			for(int j=i+1;j<n;j++){
				if(sequence+d == a[j]){
					++count;
					sequence = a[j];
					if(count==2){
						break;
					}
				}
			}
			if(count==2){
				++numberoftriplets;
			}
		}
		System.out.println(numberoftriplets);
	}
}
