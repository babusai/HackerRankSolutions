package com.github.implementation;

import java.util.Scanner;

public class TaumAndBday {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            long b = in.nextLong();
            long w = in.nextLong();
            long x = in.nextLong();
            long y = in.nextLong();
            long z = in.nextLong();
            if(x>y+z){
            	System.out.println((y+z)*b+w*y);
            }else if(y>x+z){
            	System.out.println((x+z)*w+b*x);
            }else{
            	System.out.println(x*b+y*w);
            }
        }
    }
}
