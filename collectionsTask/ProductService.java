package collectionsTask;

import java.util.ArrayList;
import java.util.List;

public class ProductService {
	static List<Product> plist=new ArrayList<>();
	public String addproduct(Product p) {
		plist.add(p);
		return "success";
	}
	public String deleteproduct(Product p) {
		if(plist.contains(p)) {
			plist.remove(p);
		}
		return "success";
	}
	public void updateproduct(Product p) {
		for(Product x:plist) {
			if(x.getId()==p.getId()) {
				x.setName(p.getName());
				x.setQty(p.getQty());
				x.setPrice(p.getPrice());
			}
		}
	}
	public void listproducts() {
		plist.forEach(x->System.out.println(x));
	}
	public Product getprobyid(Integer id) {
		for(Product x:plist) {
			if(x.getId()==id) {
				return x;
			}
		}
		return null;
	}
	public Double getpricebyid(Integer id) {
		for(Product x:plist) {
			if(x.getId()==id) {
				return x.getPrice();
			}
		}
		return 0.0;
	}
}

