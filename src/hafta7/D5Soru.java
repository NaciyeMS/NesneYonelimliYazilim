package hafta7;

import java.util.Scanner;

public class D5Soru {

	public static void main(String[] args) {
		/*
		P(x) = a + bx + cx2 + dx3 
		•Klavyeden alınan a, b, c, d ve x değerlerini fonksiyona 
		gönderip sonucu ekrana yazan fonksiyonu tasarlayınız. 
		*/
		sayiAl();

	}
	public static void sayiAl() {
		Scanner klavye=new Scanner(System.in);
		System.out.println("P(x) = a + bx + cx2 + dx3 polinomu için");
		System.out.println("a sayısını girin");
		int a=klavye.nextInt();
		System.out.println("b sayısını girin");
		int b=klavye.nextInt();
		System.out.println("c sayısını girin");
		int c=klavye.nextInt();
		System.out.println("d sayısını girin");
		int d=klavye.nextInt();
		System.out.println("x sayısını girin");
		int x=klavye.nextInt();
		System.out.println("Polinom sonucu"+polinom(a,b,c,d,x));
	}
	private static int polinom(int a,int b,int c, int d,int x) {		
		return (a+b*x+c*x*x+d*x*x*x);
	}

}
