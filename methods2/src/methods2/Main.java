package methods2;

public class Main {

	public static void main(String[] args) {
		String mesaj  ="hava çok güzel";
		//String yeniMesaj = mesaj.substring(0, 2);
		//System.out.println(yeniMesaj);
		
		String yeniMesaj = sehirVer();
		System.out.println(yeniMesaj);
		int sayi = Topla(5,7);
		System.out.println(sayi);

	}
	
	public static void Add() {
		System.out.println("Added !");
	}
	
	public static void Delete() {
		System.out.println("Deleted !");
	}
	
	public static void Update () {
		System.out.println("Epdated !");
	}
	public static int Topla (int sayi1 , int sayi2) {
		return sayi1 + sayi2;
	}
	public static String sehirVer () {
		return "Ankara";
	}

}
