import java.util.HashMap;
import java.util.Map;


public class Array1_4 {
// check if given string is a permutation of palindrome.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(permutationPalindrome("my gym"));

	}

	public static boolean permutationPalindrome(String input){
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		for(int i = 0;i<input.length();i++){
			char current = input.charAt(i);
			if(!String.valueOf(current).equals(" ")){
				if(map.containsKey(String.valueOf(current))){
					map.put(String.valueOf(current), map.get(String.valueOf(current))+1);
				}else{
					map.put(String.valueOf(current),1);
				}
			}
		}
		boolean odd = false;
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			String key = entry.getKey();
		    Integer value = entry.getValue();
		    System.out.println(key+","+value);
		    
		    if((value%2) == 1){
		    	System.out.println("hi");
		    	if(odd){
		    		return false;
		    	}
		    	odd = true;
		    }
		}
		return odd;
	}
}//O(n)
// another way is to use int[] where value would be number of times
// the alphabet occurred and location would be ascii value of a char in string