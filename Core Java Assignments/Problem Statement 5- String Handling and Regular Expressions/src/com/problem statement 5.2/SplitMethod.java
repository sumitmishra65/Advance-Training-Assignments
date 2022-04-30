package com.splitmethod;

public class SplitMethod {
public static void main(String[] args) {
			
		String txt= (" 53  +  25  -  (  243  /  12  ) ");
		String[] w=txt.split("\\\s");
		
		for(String w1:w){  
			System.out.println(w1); 
			//System.out.println(" ");
		}
	}

	}
