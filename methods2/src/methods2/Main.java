package methods2;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		String mesaj  ="hava çok güzel";
		//String yeniMesaj = mesaj.substring(0, 2);
		//System.out.println(yeniMesaj);
		
		String yeniMesaj = sehirVer();
		System.out.println(yeniMesaj);
		int sayi = topla(5,7);
		System.out.println(sayi);
		int toplam = topla2(1,2,3,4,5,6,8);
		System.out.println(toplam);

	}
	
	public static void add() {
		System.out.println("Added !");
	}
	
	public static void delete() {
		System.out.println("Deleted !");
	}
	
	public static void update () {
		System.out.println("Epdated !");
	}
	public static int topla (int sayi1 , int sayi2) {
		return sayi1 + sayi2;
	}
	
	public static int topla2(int... sayilar) { 
		int toplam =0;
		for (int sayi : sayilar) {
			toplam +=sayi;
		}
		return toplam;
	}
	
	public static String sehirVer () {
		return "Ankara";
	}

}
