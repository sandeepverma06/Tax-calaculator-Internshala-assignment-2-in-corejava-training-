package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    System.out.println("Tax Calaculator App");
	    System.out.println("---Welcome---");
	    Scanner scanner  = new Scanner(System.in);
	    System.out.println("Enter total person count: ");
	    int personcount = scanner.nextInt();
	    scanner.nextLine();
	    String[] name = new String[personcount];
	    Long[] income = new Long[personcount];

	    for (int i = 0;i<personcount;i++){
		    System.out.println("Enter name " + (i+1) +" :");
		    name[i] = scanner.next();
		    System.out.println("Enter "+ name[i] + "'s Annual income: ");
		    income[i] = scanner.nextLong();
		    scanner.nextLine();
	    }

	    for (int i =0;i<personcount;i++){
		    calaculateTax(name[i],income[i]);
	    }

    }

	public static void calaculateTax(String name, Long income) {
    	long tax;
		if (income>300000){
    		tax  = (long)((20/100.0)*income);
    	}else if (income>100000 && income<300000){
    		tax = (long)((10/100.0)*income);
	    }else{
    		tax =  0L;
	    }
		System.out.println(name +" : \u20B9"+tax);
	}


}

