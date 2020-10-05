package com.topic6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
	

	public static void main(String[] args) {
		
		try {
			
			int [] arr = new int [35];
			for(int i = 0; i <= arr.length; i++) {
				arr[i] = i * 2;
			}
			
		} catch(ArrayIndexOutOfBoundsException e ) {
			System.err.println("Exception caught");
		}
		
		System.out.println("Done");
		
		
		try {
		    SimpleDateFormat sdf = new SimpleDateFormat("MM/dd");
		    Date date = sdf.parse("01-10");
		    System.out.println(date);
		} catch (ParseException e) {
		    System.err.println("ParseException caught for the date exception error");
		}
		
		//Multi-Catch and Finally
		
		int res = 0;
		try {
		    int[] arr = new int[2];
		    res = (arr[1] != 0) ? 10 / arr[1] : 10 * arr[2];
		} catch (ArithmeticException | IndexOutOfBoundsException e) {
			e.printStackTrace();
			System.out.println("Multi-Catch and Finally");
	
		}
		
		//try-with-resources
		
		BufferedReader br = null;
		try {
		    int value = 0;
		    //trying to find a file that does not exist in the folder
		    br = new BufferedReader(new FileReader("/file.txt"));
		    while((value = br.read()) != -1) {
		        System.out.println((char)value);
		    }
		} catch (IOException e) {
		    e.printStackTrace();
		} finally {
		    try {
		        if (br != null) br.close();
		    } catch (IOException e) {
		        e.printStackTrace();
		    }
		}
		
		String[] weekends = {"Friday", "Saturday", "Sunday"};
	    assert weekends.length == 1;
	    System.out.println("We have " + weekends.length + " weekend days in a week");
	}

}
