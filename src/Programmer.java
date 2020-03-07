
public class Programmer extends Calisanlar {
	
	private String diller;
	
	public Programmer(String ad, String soyad, int id,String diller) {
		super(ad, soyad, id);
		this.diller = diller;
	}
	
	public void formatAt(String isletimSistemi) {
		System.out.println(getAd() + " " + isletimSistemi + " ni yukluyor");
	}

	@Override
	public void bilgileriGoster() {
		super.bilgileriGoster();
		System.out.println("Diller:" + diller);
	}
	
	
}
