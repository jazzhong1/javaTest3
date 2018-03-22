package ncs.test6;


public class Calculator {
	
	public double getSum(int date) throws InvalidException {
		
		double sum=0.0;
		String str="입력값의 오류가 있습니다.";
			
			if(date>=2&&date<=5){
				for (int i = 1; i <=date; i++) {
					sum+=i;
				}
			}
			else{
				throw new InvalidException(str);
			}
			
		return sum;
	}
	

}
