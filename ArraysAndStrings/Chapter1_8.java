/*
Assume you have a method is Substring which checks if one word is a substring of another. 
Given two strings,s1 and s2, write code to check If s2 is a rotation of s1 using only one 
call to is Substring (e.g.,"waterbottLe" is a rotation of "erbottLewat").
*/

public class Chapter1_8 {
	public static void main(String[] args) {

	}

	public boolean isRotation(String s1, String s2) {
		int len = s1.length();
		if(len == s2.length() && len > 0) {
			String s1s2 = s1 + s2;
			return isSubstring(s1s2, s1);
		}

		return false;
	}

	public boolean isSubstring(String s1, String s2) {
		//code
	}
}