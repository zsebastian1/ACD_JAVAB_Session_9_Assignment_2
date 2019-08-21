package AssignmentSession9;

import java.util.HashSet;

public class Assignment9_2 {

	public static void main(String[] args) {

		HashSet<Integer> hs1 = new HashSet<>();
		
		hs1.add(2);
		hs1.add(11);
		hs1.add(6);
		hs1.add(1);
		hs1.add(8);
		hs1.add(3);
		System.out.println("The set before joined is: " + hs1);
		HashSet<Integer> hs2 = new HashSet<>();
		
		hs2.add(14);
		hs2.add(18);
		hs2.add(19);
		hs2.add(21);
		hs2.add(37);

		hs1.addAll(hs2);
		
		System.out.println("The first set when joined with set 2 is: " + hs1);

	}

}
