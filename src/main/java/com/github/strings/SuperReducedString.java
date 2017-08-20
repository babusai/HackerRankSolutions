package com.github.strings;

import java.util.Scanner;

public class SuperReducedString {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		StringBuffer sb = new StringBuffer(s);
		boolean removed = false;
		do{
			removed=false;
			for(int i=0;i<s.length()-1;i++){
				if(s.charAt(i)==s.charAt(i+1)){
					sb.delete(i, i+2);
					s = sb.toString();
					removed=true;
					break;
				}
			}
		}while(removed);
		System.out.println(s.isEmpty()?"Empty String":s);
	}
}
