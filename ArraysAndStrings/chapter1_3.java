//Given two strings, write a method to decide if one is a permutation of the other.

public class chapter1_3 {
	public static void main(String[] args) {
		String str1 = "dog";
		String str2 = "god";
		chapter1_3 test = new chapter1_3();
		boolean rst = test.isPermutation2(str1, str2);
		System.out.println(rst);
	}

	//solution #1
	public boolean isPermutation1(String str1, String str2) {
		if(str1.length() != str2.length()) {
			return false;
		}

		char[] str1Content = str1.toCharArray();
		java.util.Arrays.sort(str1Content);

		char[] str2Content = str2.toCharArray();
		java.util.Arrays.sort(str2Content);

		return (new String(str1Content)).equals(new String(str2Content));

	}

	//solution #2
	public boolean isPermutation2(String str1, String str2) {
		if (str1.length() != str2.length()) {
			return false;
		}

		int[] letters = new int[256];
		char[] str1Content = str1.toCharArray();
		for(char c: str1Content) {
			letters[c]++;
		}

		for(int i = 0; i < str2.length(); i++) {
			int c = str2.charAt(i);
			letters[c]--;
			if(letters[c] < 0) {
				return false;
			}
		}

		return true;
	}
}


















