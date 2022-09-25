package classesWithAttributes;

public class Main {

	public static void main(String[] args) {
		Product product = new Product(1, "laptop" , "Asus", 5000, 3, "5");
		product.setId(1);
		product.setName("Asus");
		product.setPrice(5000);
		product.setDescription("Laptop");
		
		
		
		ProductManager productManager = new ProductManager();
		productManager.Add(product);
		
		System.out.println(product.getDescription());
		
		
	}

}
