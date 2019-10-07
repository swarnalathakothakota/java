package com.durgasoft.core;
//ctrl+ is to increase font size and ctrl- is to decrease font size
//type sysout and then press ctrl space then it will print System.out.println
class A{
	int i;
	float f = 22.22f;
	char c;
	public A() {
		c='b';
	}
	void m1() {
		System.out.println("m1-A");
	}
}
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome To Eclipse IDE");
		System.out.println();
		System.out.println();
		A a = new A();
		System.out.println(a.hashCode());
		System.out.println(a.toString());
		System.out.println(a.i);
		System.out.println(a);//jvm will return toString value because a is refernce variable
				System.out.println(a.);
	}

}
