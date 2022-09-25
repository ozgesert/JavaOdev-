package switchDemo;

public class Main {

	public static void main(String[] args) {
		char grade = 'f';

		switch (grade) {
		case 'A':
			System.out.println("efso müko ");
			break;
		case 'B':
			System.out.println("çok müko ");
			break;
		case 'c':
			System.out.println("az müko ");
			break;
		case 'd':
			System.out.println("fena değil  ");
			break;
		case 'e':
			System.out.println("kaldın müko ");
			break;
		default:
			System.out.println("geçersiz");
		}
	}
}
