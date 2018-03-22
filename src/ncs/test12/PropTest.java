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
		
		//파일경로명:C:\\data.xml 에 했엇음

		Properties prop1 = new Properties();
		Properties prop2 = new Properties();
		Properties prop3 = new Properties();
		Properties prop4 = new Properties();
		Properties prop5 = new Properties();

		Fruit fruit1 = new Fruit("1=apple", 1200, 3);
		Fruit fruit2 = new Fruit("2=banana", 2500, 2);
		Fruit fruit3 = new Fruit("3=grape", 4500, 5);
		Fruit fruit4 = new Fruit("4=orange", 800, 10);
		Fruit fruit5 = new Fruit("5=melon", 5000, 2);

		String str = fruit1.toString();
		prop1.setProperty("1", str);
		str = fruit2.toString();
		prop2.setProperty("2", str);
		str = fruit3.toString();
		prop3.setProperty("3", str);
		str = fruit4.toString();
		prop4.setProperty("4", str);
		str = fruit5.toString();
		prop5.setProperty("5", str);

		ArrayList<Properties> ps = new ArrayList<Properties>();
		ps.add(prop1);
		ps.add(prop2);
		ps.add(prop3);
		ps.add(prop4);
		ps.add(prop5);

		PropTest propTest = new PropTest();

		propTest.fileSave(ps);
		propTest.fileOpen();

	}

	public void fileSave(ArrayList<Properties> ps) {
		File file = null;
		FileWriter fw = null;
		try {
			file = new File("c:\\data.xml"); // 경로 안정해주셔서 집 컴퓨터로 정함
												// 컴파일시 경로에 만들어줘야함

			fw = new FileWriter(file);
			for (int i = 0; i < ps.size(); i++) {
				ps.get(i).store(fw, "frute");

			}

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

	public void fileOpen() {

		Properties properties = new Properties();
		Fruit[] fruits = new Fruit[5];
		File file = null;
		FileReader fr = null;
		BufferedReader br = null;

		try {
			file = new File("c:\\data.xml");
			fr = new FileReader(file);
			br = new BufferedReader(fr);

			properties.load(br);

			int k = 0;
			for (String key : properties.stringPropertyNames()) {
				String value = properties.getProperty(key);

				Fruit fruit = new Fruit();
				StringTokenizer st = new StringTokenizer(value, " ");
				fruit.setName(st.nextToken());
				fruit.setPrice(Integer.parseInt(st.nextToken()));
				fruit.setQuantity(Integer.parseInt(st.nextToken()));
				// fruits.add(fruit);
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
