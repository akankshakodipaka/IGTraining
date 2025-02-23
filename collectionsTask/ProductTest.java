package collectionsTask;

public class ProductTest {

	public static void main(String[] args) {
		//Scanner sc=new Scanner(System.in);
		Product pro=new Product(10,"akanksha",100,1021425.00);
		ProductService ps=new ProductService();
		ps.addproduct(new Product(10,"ajay",80,1000.00));
		ps.addproduct(new Product(19,"nikhitha",72,29000.00));
		System.out.println(ps.addproduct(pro));
		System.out.println(ps.deleteproduct(pro));
		ps.listproducts();
		System.out.println(ps.getprobyid(10));
		System.out.println(ps.getpricebyid(19));
	}

}
