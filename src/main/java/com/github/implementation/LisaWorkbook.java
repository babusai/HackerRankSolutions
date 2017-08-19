package com.github.implementation;

import java.util.Scanner;

public class LisaWorkbook {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int n = in.nextInt();
	int k = in.nextInt();
	int a[] = new int[n];
	int lastchapterendpagenumber = 0;
	int numberofspecialproblems=0;
	for(int i=0;i<n;i++){
		a[i]=in.nextInt();
		int numberofpagesrequiredforthecurrentchapter;
		if(a[i]%k==0){
			numberofpagesrequiredforthecurrentchapter=a[i]/k;
		}else{
			numberofpagesrequiredforthecurrentchapter=a[i]/k+1;
		}
		int currentpage=lastchapterendpagenumber;
		for(int itr=1;itr<=numberofpagesrequiredforthecurrentchapter;itr++){
			++currentpage;
			if(itr==numberofpagesrequiredforthecurrentchapter && a[i]%k!=0){
				if(currentpage>=((itr-1)*k)+1 && currentpage<=((itr-1)*k)+a[i]%k){
					numberofspecialproblems++;
				}
			} else if((currentpage>=((itr-1)*k)+1  && currentpage<=itr*k)){
				numberofspecialproblems++;
			}
		}
		lastchapterendpagenumber=currentpage;
	}
	System.out.println(numberofspecialproblems);
}
}
