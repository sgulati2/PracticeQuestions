
public class LinkedList2_3 {
	public static CS401LinkedListImpl<String> myLinkedList = new CS401LinkedListImpl<String>();
	
	public static void main(String[] args) {
		myLinkedList.add("a");
		myLinkedList.add("b");
		myLinkedList.add("c");
		myLinkedList.add("d");
		myLinkedList.add("e");
		myLinkedList.add("f");
		//deleteNode("b");
		CS401LinkedListImpl<String>.LinkEntry<String> input = myLinkedList.Head().next.next;  //c
		deleteNode(input);
	}
	
	
	
	public static void deleteNode(CS401LinkedListImpl<String>.LinkEntry<String> node){
		if(node == null||node.next == null){
			
		}
		CS401LinkedListImpl<String>.LinkEntry<String> temp = node.next;
		node.element = temp.element;
		node.next = temp.next;
		myLinkedList.print();
		}
	
//	public static void deleteNode(String element){
//		CS401LinkedListImpl<String>.LinkEntry<String> current;
//		CS401LinkedListImpl<String>.LinkEntry<String> previous = null;
//		
//	// only for middle element as asked in the question
//		for(current = myLinkedList.Head();current != null;current = current.next){
//			if(current.element == element){
//				if(previous!=null&&current!=null){
//					previous.next = current.next;
//					current = current.next;
//				}
//			}
//			previous = current;
//		}
//		myLinkedList.print();
//		}
}
