package com.wipro.flowcontrolstatement;

public class Ex9 {
public static void main(String[] args) {
	int age= Integer.parseInt(args[1]);
	if(args[0]=="Female") {
		if(age>=1 && age<=58) {
			System.out.println("Percentage of interest is 8.2%");
		}
		else{
			System.out.println("Percentage of interest is 9.2%");
		}
	}
	else {
		if(age>=1 && age<=58) {
			System.out.println("Percentage of interest is 8.4%");
		}
		else {
			System.out.println("Percentage of interest is 10.5%");
		}
	}
}
}
