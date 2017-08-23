package com.github.implementation;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class ManasaAndStones {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for(int i=0;i<t;i++){
			int n = in.nextInt();
			int a = in.nextInt();
			int b = in.nextInt();
			if(n==1){
				System.out.println("0");
				continue;
			}else{
				Set<Integer> set = new TreeSet<Integer>();
				for(int k=0;k<=n-1;k++){
					set.add(k*a+(n-1-k)*b);
				}
				for (Integer integer : set) {
					System.out.print(integer+" ");
				}
			}
			System.out.println();
		}
	}
}
