package ncs.test12;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Properties;
import java.util.StringTokenizer;

public class PropTest {
	public static void main(String[] args) {
		

		Properties prop1 = new Properties();	//자체가 배열임
												//키값만 넣어주면됨

		Fruit fruit1 = new Fruit("1=apple", 1200, 3);
		Fruit fruit2 = new Fruit("2=banana", 2500, 2);
		Fruit fruit3 = new Fruit("3=grape", 4500, 5);
		Fruit fruit4 = new Fruit("4=orange", 800, 10);
		Fruit fruit5 = new Fruit("5=melon", 5000, 2);

		String str = fruit1.toString();
		prop1.setProperty("1", str);
		str = fruit2.toString();
		prop1.setProperty("2", str);
		str = fruit3.toString();
		prop1.setProperty("3", str);
		str = fruit4.toString();
		prop1.setProperty("4", str);
		str = fruit5.toString();
		prop1.setProperty("5", str);

		

		PropTest propTest = new PropTest();

		propTest.fileSave(prop1);
		propTest.fileOpen(prop1);

	}

	public void fileSave(Properties ps) {
		File file = null;
		FileWriter fw = null;
		try {
			file = new File("data.xml"); // 경로 안정해주셔서 집 컴퓨터로 정함
												// 컴파일시 경로에 만들어줘야함

			fw = new FileWriter(file);
			
				ps.store(fw, "frute");


		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			try {
				fw.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}

	}

	public void fileOpen(Properties ps) {

		Fruit[] fruits = new Fruit[5];
		File file = null;
		FileReader fr = null;
		BufferedReader br = null;

		try {
			file = new File("data.xml");
			fr = new FileReader(file);
			br = new BufferedReader(fr);

			ps.load(br);

			int k = 0;
			for (String key : ps.stringPropertyNames()) {	//키값가져오기
				String value = ps.getProperty(key);

				Fruit fruit = new Fruit();
				StringTokenizer st = new StringTokenizer(value, " ");
				fruit.setName(st.nextToken());
				fruit.setPrice(Integer.parseInt(st.nextToken()));
				fruit.setQuantity(Integer.parseInt(st.nextToken()));
				fruits[k] = fruit;
				k++;
			}

			for (int i = 0; i < fruits.length; i++) {
				System.out.println(
						fruits[i].getName() + ',' + fruits[i].getPrice() + "원," + fruits[i].getQuantity() + "개");
				// toString 써도 되지만 "원","개" 사용하기위해 그냥 이렇게 표기한다.
				//
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				br.close();
				fr.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}

	}
}
