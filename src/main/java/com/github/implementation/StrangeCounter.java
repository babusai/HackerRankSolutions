package com.github.implementation;

import java.util.Scanner;

public class StrangeCounter {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        long t = in.nextLong();
        int a1 = 3;
        int r = 2;
        int i=1;
        for(;;i++){
        	double value = a1*Math.pow(r, i-1);
        	if(value-2>t){
        		i--;
        		break;
        	}else if(value-2==t){
        		break;
        	}
        }
        long finalresult = (long)(a1*Math.pow(r, i-1)-(t-(a1*Math.pow(r, i-1)-2)));
        System.out.println(finalresult);
	}
}
