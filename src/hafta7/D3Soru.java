package hafta7;

import java.util.Scanner;

public class D3Soru {
	public static void main(String[] args) {
		Scanner klavye=new Scanner(System.in);
		System.out.println("vize notunuzu girin");
		int v=klavye.nextInt();
		System.out.println("final notunuzu girin");
		int f=klavye.nextInt();
		System.out.println("odev notunuzu girin");
		int o=klavye.nextInt();
		double or=ortalama(v, f, o);
		System.out.println("ortalamanız:"+or);
		System.out.println("Harf notunuz:"+harfNotuHesapla(or));
	}
	public static double ortalama(int v,int f,int o) {
		double ort=(double)v*0.5+(double)f*0.3+(double)o*0.2;
		return ort;
	}
	public static String harfNotuHesapla(double ort) {
		String s = null;
		if(ort>=90)s="AA";
		else if(ort>=85)s="BA";
		else if(ort>=75)s="BB";
		else if(ort>=65)s="CB";
		else if(ort>=55)s="CC";
		else if(ort>=45)s="DC";
		else if(ort>=40)s="DD";
		else if(ort>=0)s="FF";
		
		return s;
		
	}
}
