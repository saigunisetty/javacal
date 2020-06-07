
package com.ravi.cal.RaviCalculator;

public class Calculator {

	public long first;
	public long second;
	
	public Calculator(long first, long second){
		this.first = first;
		this.second=second;
	}
	
	public long getFirst() {
		return first;
	}

	public long getSecond() {
		return second;
	}

	public long addFucn(long first, long second){
		
		return first+second;
	}
	
	public long subFucn(long first, long second){
		
		return second-first;
	}
	
	public long mulFucn(long first, long second){
		
		return first*second;
	}
	
	
	public static void main(String[] args) {

		long first = Long.parseLong(args[0]);
		long second = Long.parseLong(args[1]);
		
		Calculator cal = new Calculator(first, second);
		
		String output = String.format("\n*** Your Results ***\n\nFirst: %d\nSecond: %d\n\nSum : %d\nDifference : %d\nProduct : %d\n\n", cal.first, cal.second, cal.addFucn(first, second), cal.subFucn(first, second), cal.mulFucn(first, second));
	    System.out.println("CALCULATOR DISPLAY");
	    System.out.println(output);
	}
	
}import java.util.Scanner;

public class Calculator  {
	
	private long first;
	private long second;
	
	public long getFirst() {
		return first;
	}

	public void setFirst(long first) {
		this.first = first;
	}

	public long getSecond() {
		return second;
	}

	public void setSecond(long second) {
		this.second = second;
	}

	public long addFucn(long first, long second){
		
		return first+second;
	}
	
	public long subFucn(long first, long second){
		
		return second-first;
	}
	
	public long mulFucn(long first, long second){
		
		return first*second;
	}
	
	public static void main(String[] args) {
		
		Calculator cc = new Calculator();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first numeric value ");
		long first = sc.nextLong();
		cc.setFirst(first);
		
		System.out.println("Enter the second numeric value ");
		long second = sc.nextLong();
		cc.setSecond(second);
		
		System.out.println("The sum of two numbers is: "+cc.addFucn(first, second));
		System.out.println("The difference of two numbers is: "+cc.subFucn(first, second));
		System.out.println("The multiples of two numbers is: "+cc.mulFucn(first, second));
		
	}
	 

}


