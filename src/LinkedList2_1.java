import java.util.HashSet;
import java.util.LinkedList;


public class LinkedList2_1 {
	public static CS401LinkedListImpl<String> myString = new CS401LinkedListImpl<String>() ;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myString.add("F");
		myString.add("O");
		myString.add("L");
		myString.add("L");
		myString.add("O");
		myString.add("W");
		myString.add("U");
		myString.add("P");
		delete(myString.Head());
		myString.print();
		

	}
	
	public static void delete(CS401LinkedListImpl<String>.LinkEntry<String> linkEntry){
		HashSet<String> set = new HashSet<String>();
		CS401LinkedListImpl<String>.LinkEntry<String> previous = null;
		while(linkEntry != null){
			if(set.contains(linkEntry.element)){
				previous.next = linkEntry.next;
			}else{
				set.add(linkEntry.element);
				previous = linkEntry;
			}
			linkEntry = linkEntry.next;
		}
	}
	
	


}
