package ncs.test4;

public class ProductTest {

	public static void main(String[] args) {
		Product product=new Product("갤럭시 s7",563500,3);
		product.information();
		System.out.println("총 구매 가격:"+product.getPrice()*product.getQuantity()+" 원");
	}
}
