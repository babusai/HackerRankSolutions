package com.github.implementation;

import java.util.Scanner;

public class BiggerIsGreater {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for(int i = 0;i < t;i++){
			String input = in.next();
			int n = input.length();
			String result = input;
			boolean flag = false;
			if(n>=2){
				for(int j = n-2; j >= 0; j--){
					char c = result.charAt(j);
					String chunk = result.substring(j+1);
					int index = getIndex(c,chunk);
					if(index==-1){
						result = result.substring(0, j)+sort(result.substring(j));
					}else{
						char[] d = chunk.toCharArray();
						char At = d[index];
						d[index] = c;
						if((result.substring(0,j)+String.valueOf(At)+new String(d)).compareTo(input)>0){
							result = result.substring(0,j)+String.valueOf(At)+new String(d);
							flag = true;
							break;
						}else{
							result = result.substring(0, j)+sort(result.substring(j));
						}
						
					}
					
				}
			}
			System.out.println(flag?result:"no answer");
		}
	}
	static int getIndex(char c,String chunk){
		int index=-1;
		for(int i=0;i<chunk.length();i++){
			if(chunk.charAt(i)>c){
				index = i;
				break;
			}
		}
		return index;
	}
	
	static String sort(String input) {  
			char[] array = input.toCharArray();
	        int n = array.length;  
	        for (int j = 1; j < n; j++) {  
	            char key = array[j];  
	            int i = j-1;  
	            while ( (i > -1) && ( array [i] > key ) ) {  
	                array [i+1] = array [i];  
	                i--;  
	            }  
	            array[i+1] = key;  
	        }  
	        return new String(array);
	    }  
}
