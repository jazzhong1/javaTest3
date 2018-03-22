package ncs.test14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class GoodsTest {

	public static void main(String[] args) {

		Goods goods = new Goods("안텔 코어 i6", 2229500, 3);

		InputStream is = null;
		InputStreamReader ir = null;
		BufferedReader br = null;

		try {
			is = System.in;
			ir = new InputStreamReader(is);
			br = new BufferedReader(ir);
			
			System.out.println("상품명:");
			goods.setName(br.readLine());
			System.out.println("가격:");
			goods.setPrice(Integer.parseInt(br.readLine()));
			System.out.println("갯수:");
			goods.setQuantity(Integer.parseInt(br.readLine()));

			String str = goods.toString();
			System.out.println(str);

			System.out.println("총 구매 가격:" + goods.getPrice());
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
				ir.close();
				is.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
}
