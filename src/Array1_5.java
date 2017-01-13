import java.util.HashMap;
import java.util.Map;

//given two function check if they are
//one edit or zero edits away.
public class Array1_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(editsAway("goog", "googd"));

	}
	public static boolean editsAway(String firstString, String secondString){
		String concated = firstString+secondString;
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		for(int i = 0; i<concated.length();i++){
			String currentChar = String.valueOf(concated.charAt(i));
			if(map.containsKey(currentChar)){
				map.put(currentChar,map.get(currentChar) +1);
			}else{
				map.put(currentChar, 1);
			}
		}
		int count = 0;
		for(Map.Entry<String, Integer> entry : map.entrySet()){
			Integer value = entry.getValue();
			if(value%2==1){
				count++;
			}
		}
		if(count>1){
			return false;
		}else{
			return true;
		}
	}

}
//the given solution doesn't look at permutation of the two string.
//if we had two do the same method as the book. we wouldn't concatenate
// instead check length and iterate hashmap and compare with each char 
// of second string. if count when compared is > 1 return false
// else return true
//in this way we don't even need a hashmap, array of char type would work.