package ncs.test11;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class ListTest {
	
	public static void main(String[] args) {
		
		Calendar calendar=Calendar.getInstance();
		Random random=new Random(calendar.getTimeInMillis());	//시드 그냥 하고싶어서
		
		List<Integer> ar=new ArrayList<Integer>();
		
			for (int i = 0; i < 10; i++) {
				int num=(random.nextInt(100))+1;
				ar.add(num);
			}
			System.out.print("정렬전 :");
			display(ar);
			System.out.println();
			
			System.out.print("정렬후 :");
			Collections.sort(ar,new Decending());	//디코딩 리턴값이 들어와서 정렬//
			display(ar);
			
	}
	
	public static void display(List<Integer> ar){
		for (int i = 0; i < ar.size(); i++) {
			System.out.print(ar.get(i)+" ");
		}
	}
}
