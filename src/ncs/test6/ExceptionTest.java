package ncs.test6;

import java.util.Scanner;

public class ExceptionTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Calculator cal = new Calculator();

		System.out.print("2~5정수형 입력:");
		double result;
		try {
			result = cal.getSum(sc.nextInt());
			System.out.println(result);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		sc.close();
	}
}
