package haftaa10Inheritance;
/*
 * bir child da bir sınıfın parent ı olabilir. */
/*
ÖRNEK
* Animal Sınıfı 	Mammal Sınıfı extends Animal      Dog extends Mammal
* --------------	---------------------			  -------------------
* eat()		===>	eat()===>							eat()
* drink()	===>	drink()	===>						drink()
* 					feedwithMilk() ===>					feedwithMilk()
* 							
* 
* 
* */
public class Dog extends Mammal {
	public void bark() {
		System.out.println("köpekler havlar");
	}
}
