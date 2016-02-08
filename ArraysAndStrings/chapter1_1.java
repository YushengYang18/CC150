//Implement an algorithm to determine if a string has all unique characters. 
//What if you cannot use additional data structures?

public class chapter1_1 {
	public static void main(String[] args) {
		chapter1_1 test = new chapter1_1();
		String s = "abcdeffg";
		boolean rst = test.uniqueString(s);
		System.out.println(rst);
	}


	public boolean uniqueString(String str) {
		if(str.length() > 256) {
			return false;
		}

		boolean[] charRec = new boolean[256];
		for(int i = 0; i < str.length(); i++) {
			int val = str.charAt(i);
			if(charRec[val]) {
				return false;
			}

			charRec[val] = true;
		}
		return true;
	}
}