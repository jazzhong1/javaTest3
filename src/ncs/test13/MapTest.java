package ncs.test13;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;


public class MapTest {
	public static void main(String[] args) {

		Map<String, Inventory> map = new HashMap<String, Inventory>();

		GregorianCalendar pd = new GregorianCalendar(2016, (03)-1, 15);
		Date date = pd.getTime();
		Inventory in1 = new Inventory("삼성 갤럭시 S7", date, 30);
		map.put(in1.getProductName(), in1);

		pd = new GregorianCalendar(2016, (02)-1, 25);
		date = pd.getTime();
		Inventory in2 = new Inventory("LG G5", date, 20);
		map.put(in2.getProductName(), in2);

		pd = new GregorianCalendar(2016, 12, 23);
		date = pd.getTime();
		Inventory in3 = new Inventory("애플 아이패드 PrO", date, 15);
		map.put(in3.getProductName(), in3);

		Inventory[] in = new Inventory[3];
		int k = 0;
		Set<String> keyset = map.keySet();
		Iterator<String> keyIterator = keyset.iterator();
		while (keyIterator.hasNext()) {
			String key = keyIterator.next();
			Inventory iy = map.get(key);
			in[k] = iy;
			k++;

			System.out.println(iy.toString());
		}

		System.out.println("출고 수량 10 적용시 ===========");
		try {
			for (int i = 0; i < in.length; i++) {
				pd = new GregorianCalendar();
				date = pd.getTime();
				in[i].setGetDate(date);
				in[i].setGetAmount(10);	//출고수량 10적용
			}
			for (int i = 0; i < in.length; i++) {
				System.out.println(in[i].toString());
			}
		} catch (AmountNotEnough e) {
			System.out.println(e.getMessage());
		}

	}

}
