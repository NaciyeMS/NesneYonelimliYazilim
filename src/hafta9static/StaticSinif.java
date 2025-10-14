package hafta9static;

public class StaticSinif {
	public static int buzDolabı=100; 
	//static evdeki tüm nesneler için ortak
	public int disFircasi=1;
	//non static evdeki tüm nesnelerin kendisine ait
    public static void staticMetod() {
    	System.out.println("bu static bir metottur");
    }
    public void nonStaticMetod() {
    	System.out.println("bu static olmayan bir metottur");
    }
}
