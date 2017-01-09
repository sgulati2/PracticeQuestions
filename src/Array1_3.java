import java.util.ArrayList;
import java.util.Arrays;



// replace spaces with a "%20"
public class Array1_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(ReplaceSpace("Mr John Smith    ", 13));
	}
	
	public static String ReplaceSpace(String input, int length){
		char stringArray[] = input.toCharArray();
		//char newArray[] = {};
		ArrayList<Character> newArray = new ArrayList<Character>();
		//int count = length;
		for(int i = 0;i<length;i++){
		if(stringArray[i]==' '){
			newArray.add('%');
			newArray.add('2');
			newArray.add('0');
		}else{
		newArray.add(stringArray[i]);
		}
		}
		return newArray.toString().replace("[", "").replace("]", "").replace(",", "");
	}

}
