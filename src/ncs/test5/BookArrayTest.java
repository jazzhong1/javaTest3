package ncs.test5;

public class BookArrayTest {
	
	public static void main(String[] args) {
		
		Book barray[]=new Book[3];
		
		Book book1=new Book("자바의 정석","남궁성",30000,"도우출판",0.1);
		Book book2=new Book("열혈강의 자바","구정은",29000,"프리렉",0.1);
		Book book3=new Book("객체지향 JAVA8","금영욱",30000,"북스홈",0.1);
		
			barray[0]=book1;
			barray[1]=book2;
			barray[2]=book3;
		
		
		for (int i = 0; i < barray.length; i++) {
			int result=(int) (barray[i].getPrice()*barray[i].getDiscountRate());	//할인금액
			result=barray[i].getPrice()-result;	//가격에서 빼주기
			
			System.out.println(barray[i].getTitle()+","
							+barray[i].getAutor()+","
							+barray[i].getPrice()+","
							+(int)(barray[i].getDiscountRate()*100)+"% 할인");
			
			System.out.println("할인된 가격:"+result);
		}
	}

}
