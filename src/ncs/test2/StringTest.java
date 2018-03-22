package ncs.test2;


public class StringTest {

	public static void main(String[] args) {
		String str = "1.22,4.12,5.93,8.71,9.34";
		 double data[]= new double[5];
		 double sum = 0;

		 
		 String[] st=str.split(",");
		 
		 int k=0;
		 for (String i:st) {
			 data[k]=Double.parseDouble(i);
			 sum=sum+data[k];
		}
		 
		 System.out.printf("합계:"+"%.3f",sum);
		 System.out.println();
		 System.out.printf("평균:"+"%.3f",sum/data.length);
		 
		 
		 
		 
	}

}
