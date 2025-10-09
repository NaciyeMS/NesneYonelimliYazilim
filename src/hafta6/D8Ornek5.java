package hafta6;

public class D8Ornek5 {
public static void main(String[] args) {
	/*5 satırlı 4 sütunlu bir diziye rastgele sayılar
	atayan bir uygulama yaz ve ekranda görsel olarak göster
	 (satır ve sütunlar halinde görünsün)*/
	int [][]dizi= new int[5][4];
    for (int i = 0; i < 5; i++) {
        for (int j = 0; j < 4; j++) {
          dizi[i][j]=(int)(Math.random()*10);  
          System.out.print(dizi[i][j]+"   ");
        }   
        System.out.println();
    }


}
}
