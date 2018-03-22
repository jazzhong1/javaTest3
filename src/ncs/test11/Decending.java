package ncs.test11;

import java.util.Comparator;

public class Decending implements Comparator<Integer> {

	@Override
	public int compare(Integer ar1, Integer ar2) {

		if (ar1 > ar2) {
			return -1;
		} 
		else if (ar1 < ar2) {
			return 1;
		}
		else {
			return 0;
		}
	}

}
