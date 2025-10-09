package hafta1;

public class De10ArtirmaOperatoru {
	public static void main(String[] args) {
		int x=1;
		int y=x++;
		//önce atama işlemi gerçekleşti
		//sonra artırma işlemi gerçekleşti
		System.out.println("X nin değeri:"+x);
		System.out.println("Y nin değeri:"+y);
		int a=1;
		int b=++a;
		//önce artırma işlemi gerçekleşti
		//sonra atama işlemi gerçekleşti
		System.out.println("A nin değeri:"+a);
		System.out.println("B nin değeri:"+b);
	}
}
