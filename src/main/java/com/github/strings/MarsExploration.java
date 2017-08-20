package com.github.strings;

import java.util.Scanner;

public class MarsExploration {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        String s = in.next();
        int numberofalteredcharacters = 0;
        for(int i=0;i<s.length()/3;i++){
        	if(s.charAt(i*3)!='S'){
        		numberofalteredcharacters++;
        	}
        	if(s.charAt(1+i*3)!='O'){
        		numberofalteredcharacters++;
        	}
        	if(s.charAt(2+i*3)!='S'){
        		numberofalteredcharacters++;
        	}
        }
        System.out.println(numberofalteredcharacters);
	}
}
