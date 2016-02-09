/*
Implement a method to perform basic string compression using the counts of repeated
 characters. For example, the string aabcccccaaa would become a2blc5a3. If the 
 "compressed" string would not become smaller than the original string, your 
 method should return the original string.
*/

public class Chapter1_5 {
	public static void main(String[] args) {
		String str = "aabcccccaaa";
		new Chapter1_5().compressString(str);
	}

	public void compressString(String str) {
		StringBuffer sb = new StringBuffer();
		int i = 0;
		while(i < str.length()) {
			int count = 0;
			char c = str.charAt(i);
			while(i < str.length() && str.charAt(i) == c) {
				count++;
				i++;
			}
			sb.append(c);
			sb.append(count);
		}

		String rst = sb.toString();
		if (rst.length() >= str.length()) {
			System.out.println(str);
		} else {
			System.out.println(rst);
		}
	}
}