//determine if a string has all unique characters
public class Array1_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(checkDuplicate("ghkpewqaz"));
	}

	public static boolean checkDuplicate(String input){
		if(input.length()>128){
			return false;
		}
		boolean[] char_exist = new boolean[128];
		for(int i=0;i<input.length();i++){
			int code = input.charAt(i);
			if(char_exist[code]){
				return false;
			}
			char_exist[code] = true;
		}
		return true;
	}
	
}
/// complexity O(n)