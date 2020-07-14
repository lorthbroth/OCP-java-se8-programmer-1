package com.dominic;

/**
 * 
 * @author dominic
 *
 */

import java.util.function.Predicate;

interface Doable{
	default void doIt() {
		System.out.println("Wakanda! forever!");
	}
}

@FunctionalInterface
interface sayable extends Doable{
	void say(String msg); //abstract method
	// It can contain any number of Object class methods.
}

public class Main implements sayable{
	
	public void say(String msg) {
		System.out.println(msg);
	}
	
	public static Predicate<String> hasLengthOf10 = new Predicate<String>() { 
        @Override
        public boolean test(String t) 
        { 
            return t.length() > 10; 
        } 
    }; 
  
    public static void predicate_or() 
    { 
  
        Predicate<String> containsLetterA = p -> p.contains("A"); 
        String containsA = "Dominic"; 
        boolean outcome = hasLengthOf10.or(containsLetterA).test(containsA); 
        System.out.println(outcome); 
    } 
    
    
    static boolean result;
    static Springboot sb = new Springboot();
    static Webdev wd = new Webdev();
    static Springboot sb2 = null;

	public static void main(String[] args) {
		
		AboutMe about = new AboutMe();
		about.setName("Dominic");
		about.setJavaLevel("Aspiring full-stack Developer");
		about.setJavaPercentage(70);
		Main some = new Main();
		some.say("Hello there");
		System.out.println("About me: \nName: " + about.getName() + "\nOccupation: " + about.getJavaLevel() + " I know about: " + about.getJavaPercentage() + "% of Java");
		some.doIt();
		System.out.println("Finding the squareroot of 1764");
		System.out.println("before java 8 implementation class  = " + suareRootWithImpl(1764));
		System.out.println("before java 8 anonymous implementation = " + suareRootWithAnoymsImp(1764));
		System.out.println("before java 8 anonymous implementation = " + squareRootJava8LambdaExpressionWithType(1764));
		System.out.println("java 8 lamdba expresson = " + squareRootJava8LambdaExpression(1764));
		System.out.println("java 8 Block lamdba expresson = " + squareRootJava8BlockLambdaExpression(1764));
		System.out.println("java 8 lamdba expresson as argument = " + squareRootJava8LambdaAsArgument(1764));
		System.out.println(squareRootJava8LambdaAsArgument(1764) + " Is the meaning of life");
		System.out.print("Does Dominic contain an A ?  ");
		predicate_or();
		System.out.println("\n");
		result = sb instanceof Springboot;
		System.out.println("Springboot is part of backend: " + result );
		result = wd instanceof Webdev;
		System.out.println("Node  is part of web development: " + result);
		result = sb2 instanceof Springboot;
		System.out.println("Springboot is part of databases in the backend: " + result);
		
		SingletonEnum s1;
		SingletonEnum s2;
		s1 = SingletonEnum.SINGLEINSTANCE;
		s2 = SingletonEnum.SINGLEINSTANCE;
		if(s1 == s2) {
			System.out.println("References to same Singleton object");
		}
	}
	
	private static double suareRootWithImpl(int in) {
		SquareRootImpl squareRootImpl = new SquareRootImpl();
		return squareRootImpl.findSquareRoot(in);
	}

	private static double suareRootWithAnoymsImp(int in) {

		SquareRoot squareRoot = new SquareRoot() {

			@Override
			public double findSquareRoot(int n) {
				return Math.sqrt(n);
			}
		};

		return squareRoot.findSquareRoot(in);
	}

	private static double squareRootJava8LambdaExpression(int in) {

		SquareRoot squareRoot = (n) -> (Math.sqrt(n));
		return squareRoot.findSquareRoot(in);
	}
	
	private static double squareRootJava8LambdaExpressionWithType(int in) {

		SquareRoot squareRoot = (int n) -> (Math.sqrt(n));
		return squareRoot.findSquareRoot(in);
	}

	
	private static double squareRootJava8BlockLambdaExpression(int in) {

		SquareRoot squareRoot = (n) -> {
			double result = Math.sqrt(n);
			return result;
		};
		
		return squareRoot.findSquareRoot(in);
	}
	
	private static double squareRootJava8LambdaAsArgument(int i) {
		SquareRoot squareRoot = (n) -> (Math.sqrt(n));
		return displayData(squareRoot, i);
		
	}

	private static double displayData(SquareRoot squareRoot, int i) {
		return squareRoot.findSquareRoot(1764);
		
	}

}


class SquareRootImpl implements SquareRoot {

	@Override
	public double findSquareRoot(int n) {
		return Math.sqrt(n);
	}
	
}

