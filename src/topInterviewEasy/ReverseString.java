package topInterviewEasy;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] s = new char[] {'h', 'e', 'l', 'l', 'o'};
		reverseString(s);
		System.out.println(s);
		char[] s2 = new char[] {'h', 'a', 'n', 'n', 'a', 'h'};
		reverseString(s2);
		System.out.println(s2);
	}
	
	public static void reverseString(char[] s) {
		for(int i = 0; i < s.length / 2; i++) {
			char temp = s[i];
			s[i] = s[s.length - 1 - i];
			s[s.length - 1 - i] = temp;
		}
	}

}
