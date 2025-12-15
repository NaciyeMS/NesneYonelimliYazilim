package haftaaaaa14_Exception;

public class Exception0 {
public static void main(String[] args) {
	//compile error
	//System.out.pintln("deneme");//sytanx 

	//runtime error
	int bolen=0;
	
	if(bolen==0)
		System.out.println("bolen sıfır olamaz");
	else
	System.out.println(4/bolen);
	
	
	System.out.println("merhaba");
}
}
