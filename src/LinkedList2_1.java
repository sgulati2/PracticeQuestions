import java.util.LinkedList;

import javax.xml.soap.Node;


public class LinkedList2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(RemoveDuplicates("FOLLOW UP"));

	}
	public static String RemoveDuplicates(String input){
		
		LinkedList<Character> myList = new LinkedList<Character>();
		for(int i = 0;i<input.length();i++){
			myList.add(input.charAt(i));
		}
		LinkedList<Character> newList = new LinkedList<Character>();
		for(Character newc : myList){
			if(newList.contains(newc)){
				newList.add(newc);
			}
		}
		String output = newList.toString();
		return output;
	}

}
