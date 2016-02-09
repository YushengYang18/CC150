/*
Write a method to replace all spaces in a string with '%20'. You may assume that 
the string has sufficient space at the end of the string to hold the additional 
characters, and that you are given the "true" length of the string. (Note: if 
implementing in Java, please usea character array so that you can perform this 
operation inplace.)
*/

public class Chapter1_4 {
	public static void main(String[] args) {
		char[] str = { 'd', ' ', 'c', ' ', 'f', 'f', ' ', ' ', ' ', ' ', ' ', ' ', ' '};
		new Chapter1_4().replaceSpaces(str, 6);
	}


	public void replaceSpaces(char[] str, int length) {
		int spaceCount = 0;
		for (int i = 0; i < length; i++) {
			if (str[i] == ' ') {
				spaceCount++;
			}
		}

		if (spaceCount == 0) {
			System.out.println(new String(str));
			return;
		}

		int len = length + spaceCount * 2;
		str[len] = '\0';
		for(int i = length-1; i >= 0; i--) {
			if (str[i] == ' ') {
				str[--len] = '0';
				str[--len] = '2';
				str[--len] = '%'; 
			} else {
				str[--len] = str[i];
			}
		}

		System.out.println(new String(str));
	}

}
