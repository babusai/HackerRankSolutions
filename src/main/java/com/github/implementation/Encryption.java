package com.github.implementation;

import java.util.Scanner;

public class Encryption {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String input = in.next();
		int l = input.length();
		double squarerootofl = Math.sqrt(l);
		int floor = (int) Math.floor(squarerootofl);
		int ceil = (int) Math.ceil(squarerootofl);
		int r=0,c=0;
		if(floor==ceil){
			r = c = floor;
		}else if(floor<ceil){
			if(floor*floor>=l){
				r = c = floor;
			}else if(floor*ceil>=l){
				r = floor;
				c = ceil;
			}else{
				r = c = ceil;
			}
		}
		for(int j=0;j<c;j++){
			for(int i=0;i<r;i++){
				if(i*c+j<l)
					System.out.print(input.substring(i*c+j, i*c+j+1));
			}
			System.out.print(" ");
		}
	}
}
