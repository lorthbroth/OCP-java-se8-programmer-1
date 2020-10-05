package com.topic8;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;   
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Topic8 {

	public static void main(String[] args) {
		
		try 
    	{
    		File Obj = new File("FileDemo.txt");
    		if (Obj.createNewFile())	{
		        System.out.println("******File created******");
           		  System.out.println("Name of the file = " + Obj.getName());
              } 
            else{
		       System.out.println("File already exists.");
            }
    } 
    catch (IOException e){
        e.printStackTrace();
    }
		
		try 
		{
			FileWriter FileWriterobj = new FileWriter("FileDemo.txt");
			FileWriterobj.write("Java is alot of fun - Dominic");
			FileWriterobj.close();
			System.out.println("File is Updated.");
		}
	    catch (IOException e) 
		{
			e.printStackTrace();
		}
		
		
		try 
	       {
             File Obj = new File("FileDemo.txt");
             Scanner obj1 = new Scanner(Obj);
             while (obj1.hasNextLine()) 
             {
     		  String obj2 = obj1.nextLine();
    		  System.out.println(obj2);
             }
             obj1.close();
     	}catch (FileNotFoundException e) 
         {
             e.printStackTrace();
         }
		
		File Obj = new File("FileDemo.txt");
		if (Obj.exists()) 
		{
			System.out.println("File name= " + Obj.getName());
			System.out.println("***********************************");
			System.out.println("Absolute path= " + Obj.getAbsolutePath());
			System.out.println("***********************************");
			System.out.println("Writeable= " + Obj.canWrite());
			System.out.println("***********************************");
			System.out.println("Readable= " + Obj.canRead());
			System.out.println("***********************************");
			System.out.println("File size in bytes= " + Obj.length());
		} 
		else 
		{
			System.out.println("file does not exist.");
		}
		
		try{    
            FileOutputStream fout=new FileOutputStream("testout.txt");    
            String s="Another file created by Dominic";    
            byte b[]=s.getBytes();//converting string into byte array    
            fout.write(b);    
            fout.close();    
            System.out.println("successf...");    
           }catch(Exception e){System.out.println(e);}
		
		try {
		      PrintWriter output = new PrintWriter("output.txt");

		      int age = 28;

		      output.printf("I am %d years old.", age);
		      output.close();
		    }
		    catch(Exception e) {
		      e.getStackTrace();
		    }
		
	}

}
