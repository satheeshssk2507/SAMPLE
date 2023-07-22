package org.hexa.test.login;

import java.util.Arrays;

//smallest number in array
public class Sample {

	public static void main(String args[]) {
		
	int a[] = {10,15,5,100,12};
	
	int i = Arrays.stream(a).min().getAsInt();
	System.out.println(i);
			}

}

	
	

