package com.github.implementation;

import java.util.Scanner;

public class FairRations {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int B[] = new int[N];
        int oddcount = 0;
        for(int B_i=0; B_i < N; B_i++){
            B[B_i] = in.nextInt();
            if(B[B_i]%2!=0){
            	oddcount++;
            }
        }
        if(oddcount%2!=0){
        	System.out.println("NO");
        }else{
        	int count = 0;
        	int first = 0;
        	int total = 0;
        	for(int i=0;i<N;i++){
        		if(B[i]%2!=0){
        			count++;
        			if(count == 1)
        				first = i;
        		}
        		if(count == 2){
        			total = total+((i-first)*2);
        			count = 0;
        		}
        	}
        	System.out.println(total);
        }
    }
}