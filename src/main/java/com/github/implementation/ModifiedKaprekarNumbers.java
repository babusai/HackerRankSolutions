package com.github.implementation;

import java.math.BigInteger;
import java.util.Scanner;

public class ModifiedKaprekarNumbers {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int p = in.nextInt();
		int q = in.nextInt();
		boolean flag = true;
		for(int i=p;i<=q;i++){
			String s = String.valueOf(i);
			int d = s.length();
			BigInteger b = new BigInteger(i+"");
			b = b.multiply(b);
			String sq = String.valueOf(b);
			int sqlength = sq.length();
			int r = Integer.parseInt(sq.substring(sqlength-d, sqlength));
			int l = 0;
			if(sqlength>d)
					l = Integer.parseInt(sq.substring(0, sqlength-d));
			if(l+r==i){
				System.out.print(i+" ");
				flag = false;
			}
			// 65536
		}
		if(flag){
			System.out.println("INVALID RANGE");
		}
	}
}
