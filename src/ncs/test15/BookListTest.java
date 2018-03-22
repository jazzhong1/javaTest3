package ncs.test15;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;


public class BookListTest {
	public static void main(String[] args) {
		
		BookListTest test5=new BookListTest();
	
		ArrayList<Book> list=new ArrayList<Book>();
		
		test5.storeList(list);	//주소값 같이 가르킴
		
		test5.saveFile(list);
		
		List<Book> booksList=test5.loadFile();
		
		test5.printList(booksList);
								//books.dat로부터 객체읽기
		
		
	}

	public void storeList(List<Book> list) {
		
		Book book1=new Book("자바의 정석","남궁성",30000,"도우출판",0.15);
		Book book2=new Book("열혈강의 자바","구정은",29000,"프리렉",0.1);
		Book book3=new Book("객체지향 JAVA8","금영욱",30000,"북스홈",0.1);
		list.add(book1);
		list.add(book2);
		list.add(book3);
	}

	public void saveFile(List<Book> list) {
		
		File file=null;
		FileWriter fw = null;
		
		try {
			file=new File("c:\\books.dat");
			fw=new FileWriter(file);
			
			for (Book b: list) {
				fw.write(b.getTitle()+',');
				fw.write(b.getAuthor()+',');
				fw.write(String.valueOf(b.getPrice())+',');
				fw.write(b.getPublisher()+',');
				fw.write(String.valueOf(b.getDiscountRate())+"\r\n");
				fw.flush();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				fw.close();
				
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		
		
	}
	
	public  List<Book> loadFile() {
		File file=null;
		FileReader fr = null;
		BufferedReader br=null;
		
		try {
			file=new File("c:\\books.dat");
			fr=new FileReader(file);
			br=new BufferedReader(fr);
			
			List<Book> books=new ArrayList<Book>();
			
			while(br.ready()){
				String str=br.readLine();
				StringTokenizer st=new StringTokenizer(str, ",");
				Book book=new Book();
				
				book.setTitle(st.nextToken());
				book.setAuthor(st.nextToken());
				book.setPrice(Integer.parseInt(st.nextToken()));
				book.setPublisher(st.nextToken());
				book.setDiscountRate(Double.parseDouble(st.nextToken()));
				
				books.add(book);
			}
			return books;
		
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				br.close();
				fr.close();
				
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return null;
	}
	
	public void printList(List<Book> list){
		
		for(Book b:list){
			System.out.println(b.toString());
			System.out.println("할인된 가격:"+(int)(b.getPrice()-(b.getPrice()*b.getDiscountRate()))+"원");
		}
		
	}

}
