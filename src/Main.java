import java.io.ObjectInputStream.GetField;
import java.util.Scanner;

public class Main {
public static void main (String args[]) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Calisanlar Programina Hosgeldiniz..");
	String islemler = "Islemler..\n"
					+ "1.Yazilimci  islemleri\n"
			        + "2.Manager Islemleri\n"
					+ "Cikis icin q ya basin";
	System.out.println("************************");
	System.out.println(islemler);
	System.out.println("************************");
while(true) {
	System.out.print("Islemi seciniz:");
	String islem = scanner.nextLine();
	
	if(islem.equals("q")) {
		System.out.println("Programdan cikiliyor");
		break;
	}
	else if(islem.equals("1")) {
		Programmer programmer = new Programmer("ferdi", "bulus",2013556402 , "Java/C/C++");		
		String yazilimciIslem="1.Format At\n"
							  + "2. Bilgileri Goster\n"
							  + "Cikis icin q ya basiniz..";
		System.out.println(yazilimciIslem);
		while(true) {
			System.out.print("Islemi seciniz:");
			String y_islem = scanner.nextLine();
			if(y_islem.equals("q")) {
				System.out.println("Yazilimci islemlerinden cikiliyor");
				break;
			}
			else if(y_islem.equals("1")) {
				System.out.print("Isletim Sistemi : ");
				String isletim_sistemi = scanner.nextLine();
				programmer.formatAt(isletim_sistemi);
			}
			else if(y_islem.equals("2")) {
				programmer.bilgileriGoster();
			}
			else {
				System.out.println("Gecersiz islem girdiniz..");
			}
		}
	}
	else if(islem.equals("2")) {
		Manager manager = new Manager("erdi", "bulus", 55568, 10);
		String yoneticiIslemleri = "Yonetici Islemleri\n"
								+ "1. Zam Yap\n"
								+ "2. Bilgileri Goster\n"
								+ "Cikis icin q ya basiniz";
		System.out.println(yoneticiIslemleri);
		
		while(true) {
			System.out.println("Islem seciniz:");
			String y_islem = scanner.nextLine();
			if(y_islem.equals("q")){
				System.out.println("Yonetici Islemlerinden Cikiliyor.");
				break;
			}
			else if(y_islem.equals("1")) {
				System.out.println("ne kadar zam yapilacak:");
				Integer zam_miktari = scanner.nextInt();
				scanner.nextLine();
				manager.zamYap(zam_miktari);
				System.out.println("Zam miktari: " + zam_miktari );
			}
			else if(y_islem.equals("2")) {
				manager.bilgileriGoster();
			}
			else {
				System.out.println("Gecersiz yonetici islemi.");
			}
			
		}
	}
	else {
		System.out.println("Gecersiz islem");
		}
	}
  }
}
