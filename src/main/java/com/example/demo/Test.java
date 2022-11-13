package com.example.demo;

public class Test {
	
	void testif() 
	{
		int num1=20;
		double num2=0;
		if(num1>=20)
			num2=1.5;
		if(num1<30)
			num2=2;
		System.out.println("num2 "+num2);
	}
	void testif2() 
	{
		int num1=20;
		double num2=0;
		if(num1>=20)
			num2=1.5;
		else if(num1<30)
			num2=2;
		System.out.println("num2 "+num2);
	}
public static void main(String[] args) {
	int l=0x20;
	int x=0xface;
	double d=1.2e3;
	int b=30;
	long a=4000;
	float f=30.25f;
	f=a;
	int c=b++;
	float f1=10.25f;
	double d1=10.25;
	System.out.println(f1+" "+d1);
	System.out.println(f1+" "+d1);
	f1++;
	d1++;
	char ch='a';
	//System.out.println(f1+" "+d1);
	//System.out.println(f1+" "+d1);
	//System.out.println('a'+2.50);
	//System.out.println(10/0.0);
	//System.out.println('a'==97.0);
	//System.out.println(~true);  //CTE
	//float db=130.456f;
	double db=130.456f;
	int x2=(int)db;
	//System.out.println(x2);
	int aa=10;
	int bb=010;
	int cc=0x10;
	//System.out.println(aa+" "+bb+" "+cc);
	
	boolean bl=true;
	if(bl)
		//System.out.println("true");
	if(1<2)
		System.out.println("sec if");
	else
		System.out.println("false");
	
	Test ob=new Test();
	ob.testif();
}
}
