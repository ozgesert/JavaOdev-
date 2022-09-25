import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		sayiBulmaca();

	}
	public static void sayiBulmaca() {
		int [] sayilar  = new int [] {1,2,3,4,5,6,7};
		int aranacak = 8;
		boolean varrMi = false;
		
		for (int sayi  : sayilar ) {
			if (sayi == aranacak) {
				varrMi = true ;
				break;
			}
		}
		if (varrMi) {
			mesajVer("Sayi mevcuttur :" + aranacak);
		}
		else {
			mesajVer("Sayi mecvut degildir :" + aranacak );
		}
	} 
	
	public static void mesajVer(String mesaj ) {
		System.out.println(mesaj);
	
	}
	

}
