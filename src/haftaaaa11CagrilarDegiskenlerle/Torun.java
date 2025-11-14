package haftaaaa11CagrilarDegiskenlerle;
public class Torun extends Baba {
	int torunCuzdan=100;
	public Torun() {
		super();
		System.out.println("ne arabası ya oyuncak mı?");
	}
	public Torun(String cocukIstek) {
		super("baba ben araba istiyorum");
		System.out.println("ben biraz para biriktireyim"
		+ ".Sen ve dedem de katkı edersiniz değil mi?");
		System.out.println("Kendi cüzdanımda ne var"+this.torunCuzdan);
		System.out.println("Babamın cüzdanında ne var"+super.babaCuzdan);
		System.out.println("Dedemin cüzdanında ne var"+super.dedeCuzdan);
		int toplam=this.torunCuzdan+super.babaCuzdan+super.dedeCuzdan;
		System.out.println("toplam paramız"+toplam);
	}
}
