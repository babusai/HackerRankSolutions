package com.github.implementation;

import java.util.Scanner;

public class MinimumDistances {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int A[] = new int[n];
        Integer min = null;
        for(int A_i=0; A_i < n; A_i++){
            A[A_i] = in.nextInt();
            for(int i=0;i<A_i;i++){
            	if(A[A_i]==A[i] && (min==null || Math.abs(i-A_i)<min)){
            		min = Math.abs(i-A_i);
            	}
            }
        }
        System.out.println(min==null?-1:min);
    }
}
