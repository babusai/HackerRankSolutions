package com.github.implementation;

import java.util.Scanner;

public class ChocolateFeast {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for(int i = 0;i < t;i++){
			int n = in.nextInt();
			int c = in.nextInt();
			int m = in.nextInt();
			int numberOfChocolates=0;
			int totalNUmberOfChocolates=0;
			if(c<=n){
				totalNUmberOfChocolates = n/c;
				int leftoverwrappers=totalNUmberOfChocolates;
				while(leftoverwrappers!=0 && leftoverwrappers>=m){
					numberOfChocolates=leftoverwrappers/m;
					totalNUmberOfChocolates+=numberOfChocolates;
					leftoverwrappers=leftoverwrappers%m+numberOfChocolates;
				}
			}
			System.out.println(totalNUmberOfChocolates);
		}
	}
}
