package com.ravi.cal.RaviCalculator;

import java.util.Scanner;

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
		
		return first/second;
	}
}

