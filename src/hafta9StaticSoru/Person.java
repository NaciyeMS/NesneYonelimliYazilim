package hafta9StaticSoru;

public class Person {

    // --- Alanlar (Fields) ---
    public String name;      // Kişinin adı
    public int age;          // Kişinin yaşı
    public static int personCount = 0; // Oluşturulan kişi sayısını tutar (class değişkeni)

    // --- Constructor ---
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        personCount++; // Her yeni nesne oluşturulduğunda sayaç artırılır
    }

    // --- Static Method: personCount değerini döndürür ---
    public static int getPersonCount() {
        return personCount;
    }

    // --- Static Method: personCount değerini ekrana yazdırır ---
    public static void printPersonCount() {
        System.out.println("Toplam oluşturulan kişi sayısı: " + personCount);
    }

    // --- Non-static Method: Başka bir kişinin yaşını değiştirir ---
    public void changeAge(Person otherPerson, int newAge) {
        otherPerson.age = newAge;
        System.out.println(otherPerson.name + " adlı kişinin yeni yaşı: " + otherPerson.age);
    }

    // --- Test (main metodu) ---
    public static void main(String[] args) {
        Person p1 = new Person("Ahmet", 25);
        Person p2 = new Person("Ayşe", 30);
        Person p3 = new Person("Mehmet", 28);

        // Toplam kişi sayısını yazdır
        Person.printPersonCount();

        // Yaş değiştirme işlemi
        p1.changeAge(p2, 35);

        // Güncel kişi sayısını ekrana yazdır
        System.out.println("Şu anda toplam kişi sayısı: " + Person.getPersonCount());
}
