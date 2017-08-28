package com.github.implementation;

import java.util.Scanner;

public class SherlockAndSquares {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for(int i = 0;i < t;i++){
			int count = 0;
			int a = in.nextInt();
			int b = in.nextInt();
			double squareroot = 0;
			for(int k=a;k<=b;k++){
				squareroot = Math.sqrt(k);
				String[] s = (squareroot+"").split("\\.");
				if(s[1].equals("0")){
					count++;
					break;
				}
			}
			if(squareroot>0 && count==1){
				for(int p=(int)squareroot+1;p*p<=b;p++){
					count++;
				}
			}
			System.out.println(count);
		}
	}
}
