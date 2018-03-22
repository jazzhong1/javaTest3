package ncs.test13;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Inventory {
	
	private String productName;
	private Date putDate;
	private Date getDate;
	private int putAmount;
	private int getAmount;
	private int inventortyAmount;
	
	
	
	public Inventory() {
		// TODO Auto-generated constructor stub
	}
	
	public Inventory(String productName,Date putDate, int putAmount) {
		this.productName=productName;
		this.putDate=putDate;
		this.putAmount=putAmount;
	}
	
	@Override
	public String toString() {
		
		
		SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy년 MM월 dd일 입고");
		String str1=dateFormat.format(this.getPutDate());
		String str2=null;
		
		if(this.getGetDate()!=null){
		SimpleDateFormat dateFormat2=new SimpleDateFormat("yyyy년 MM월 dd일 출고");
		str2=dateFormat2.format(this.getGetDate());
		}
		
		String result=this.getProductName()+", "+str1+","+this.getPutAmount()+"개,"
													+str2+","+this.getGetAmount()+"개,재고 "
													+this.getInventortyAmount()+"개";
		return result;
	}
	
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public Date getPutDate() {
		return putDate;
	}
	public void setPutDate(Date putDate) {
		this.putDate = putDate;
	}
	public Date getGetDate() {
		return getDate;
	}
	public void setGetDate(Date getDate) {
		this.getDate = getDate;
	}
	public int getPutAmount() {
		return putAmount;
	}
	public void setPutAmount(int putAmount) {
		this.putAmount = putAmount;
	}
	public int getGetAmount() {
		return getAmount;
	}
	public void setGetAmount(int getAmount) throws AmountNotEnough {
		
		if(this.getPutAmount()<getAmount){
			throw new AmountNotEnough("현재재고부족");
		}
		else{
			this.getAmount =getAmount;
		}
	}
	public int getInventortyAmount() {
		return inventortyAmount=this.getPutAmount()-this.getAmount;
	}
	public void setInventortyAmount(int inventortyAmount) {
		
		this.inventortyAmount = inventortyAmount;
	}
	
	

}
