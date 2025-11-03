package haftaa10Inheritance;

public class AnimalRunner {

	public static void main(String[] args) {
		Animal a1= new Animal();
		a1.drink();
		a1.eat();
		Mammal m1=new Mammal();
		m1.drink();        //parent ından aldığı drink fonksiyonu
		m1.eat();          //parent ından aldığı eat fonksiyonu
		m1.feedWithMilk(); //kendine ait olan fonksiyon
		Cat c1= new Cat();
		c1.drink();
		c1.eat();
		c1.feedWithMilk();
		c1.meow();

	}

}
