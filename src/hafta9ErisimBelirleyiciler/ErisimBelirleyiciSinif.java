package hafta9ErisimBelirleyiciler;

public class ErisimBelirleyiciSinif {
public String publicDegisken="kütüphane gibi her yerden ulaşım var";//her yerden erişim
private String privateDegisken="kasa gibi "; //"Sadece tanımlandığı yerden erişim var"
protected String protectedDegisken="aile albümü"; //aileye dahil olan childlar görecek
String defaultDegisken="apartman gibi";

/*AYNI SINIFIN İÇERİSİNDE YUKARIDAKİ 
 * BÜTÜN ERİŞİM BELİRLEYİCİ DEĞİŞKENLERE ULAŞABİLİRİM. 
 * */
public void sinifIciFonksiyon() {
	System.out.println(publicDegisken); //her yerden ulaşılabilir olduğu için ✓  	
	System.out.println(protectedDegisken);//AYNI SINIF İÇİNDE olduğu için ✓  
	System.out.println(defaultDegisken); //AYNI SINIF İÇİNDE olduğu için  ✓  
	System.out.println(privateDegisken); //AYNI SINIF İÇİNDE olduğu için ✓  
}
/*
===========================
ACCESS MODIFIERS
===========================

Modifier   |  Class   |
-----------------------
public     |    ✓     | 
protected  |    ✓     | 
default    |    ✓     |  
private    |    ✓     |  
---------------------------
*/
}
