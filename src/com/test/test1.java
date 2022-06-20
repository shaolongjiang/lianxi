package com.test;

import java.util.*;
public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		test1 aa=new test1();
		Scanner s=new Scanner(System.in);
		String ss=s.nextLine();
		int a=aa.maxlongth(ss);
		System.out.println(a);
		System.out.println("dvvv");
	}

	public int maxlongth(String s){
	Set<Character> occ=new HashSet<Character>();
	int n=s.length();
	int rk=-1,ans=0;
	for(int i=0;i<n;i++) {
		if(i!=0) {
			occ.remove(s.charAt(i-1));
		}
		while(rk+1<n&&!occ.contains(s.charAt(rk+1))) {
			occ.add(s.charAt(rk+1));
			++rk;
		}
		ans=Math.max(ans, rk-1+1);
	}
		return ans;
	}
}
