package com.test;

public class ThisUseCase {

	String name;
	int i;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
ThisUseCase t=new ThisUseCase("liza", 10);
System.out.println(t.name);
System.out.println(t.i);
	}
	public ThisUseCase(String name,int i) {
		this.name=name;
		this.i=i;
		this.m1();
	}
public void m1() {
	System.out.println("m1 method");
}
}
