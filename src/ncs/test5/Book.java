package ncs.test5;

public class Book {

	private String title;
	private String autor;
	private int price;
	private String publisher;
	private double discountRate;
	
	

	public Book() {
		// TODO Auto-generated constructor stub
	}

	public Book(String title, String autor, int price, String publisher, double discountRate) {
		this.title = title;
		this.autor = autor;
		this.price = price;
		this.publisher = publisher;
		this.discountRate = discountRate;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getAutor() {
		return autor;
	}
	
	public int getPrice() {
		return price;
	}
	
	public String getPublisher() {
		return publisher;
	}
	
	public double getDiscountRate() {
		return discountRate;
	}
	
	@Override
	public String toString() {
		String result=this.getTitle()+","+this.getAutor()+","+this.getPublisher()+","+
						this.getPrice()+"원,"+(int)(this.getDiscountRate()*100)+"%할인";
		return result;
		
	}

	
	

}
