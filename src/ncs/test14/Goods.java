package ncs.test14;

public class Goods {
	private String name;
	private int price;
	private int quantity;
	
	public Goods() {
		// TODO Auto-generated constructor stub
	}
	
	public Goods(String name,int price, int quantity) {
		this.name=name;
		this.price=price;
		this.quantity=quantity;
	}
	
	@Override
	public String toString() {
		String result= this.name+","+this.price+" 원,"+this.quantity+" 개";
		return result;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		int pric=this.price*this.getQuantity();
		return pric;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
	
	

}
