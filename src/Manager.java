
public class Manager extends Calisanlar{
	private int sorumluKisiSayisi;
	public Manager(String ad, String soyad, int id,int sorumluKisiSayisi) {
		super(ad, soyad, id);
		this.sorumluKisiSayisi =sorumluKisiSayisi;
	}
	@Override
	public void bilgileriGoster() {
		super.bilgileriGoster();
		System.out.println("Sorumlu Kisi Sayisi: " + sorumluKisiSayisi);
	}
	
	public void zamYap(int zamMiktari) {
		System.out.println(getAd() + "calisanlara " + zamMiktari + " zam miktari yapildi.");
	}
	

}
