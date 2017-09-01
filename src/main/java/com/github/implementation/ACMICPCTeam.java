package com.github.implementation;

import java.util.Scanner;

public class ACMICPCTeam {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		String[] arr = new String[n];
		for(int i = 0;i < n;i++){
			arr[i] = in.next();
		}
		int maxCount = 0;
		int currentCount = 0;
		int teamCount = 0;
		for(int i = 0;i < n-1; i++){
			for(int j=i+1;j<n;j++){
				currentCount = 0;
				for(int k=0;k<m;k++){
					if(arr[i].charAt(k)=='1' || arr[j].charAt(k)=='1'){
						currentCount++;
					}
				}
				if(currentCount>maxCount){
					maxCount = currentCount;
					teamCount = 1;
				}else if(currentCount == maxCount){
					teamCount++;
				}
			}
		}
		System.out.println(maxCount);
		System.out.println(teamCount);
	}
}
