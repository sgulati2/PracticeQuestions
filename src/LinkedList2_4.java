
public class LinkedList2_4 {
	public static CS401LinkedListImpl<Integer> myLinkedList = new CS401LinkedListImpl<Integer>();
	public static void main(String[] args) {
		myLinkedList.add(3);
		myLinkedList.add(5);
		myLinkedList.add(8);
		myLinkedList.add(5);
		myLinkedList.add(10);
		myLinkedList.add(2);
		myLinkedList.add(1);
		CS401LinkedListImpl<Integer>.LinkEntry<Integer> newHead = partition(5);
		while(newHead!=null){
			System.out.print(newHead.element + " ");
			newHead =newHead.next;
		}
	}
	// the concept is to put greater at tail and less than at head.
	// while i ran my code i was prinitng the original linkedlist which gave wrong result
	// referred solution figured out that there is a new head so linkedlist has changed
	// better to traverse the head after partition
	public static CS401LinkedListImpl<Integer>.LinkEntry<Integer> partition(Integer x){
		CS401LinkedListImpl<Integer>.LinkEntry<Integer> head = myLinkedList.Head();
		CS401LinkedListImpl<Integer>.LinkEntry<Integer> tail = myLinkedList.Head();
		CS401LinkedListImpl<Integer>.LinkEntry<Integer> current;
		
		
		for(current =head;current!=null;){
			CS401LinkedListImpl<Integer>.LinkEntry<Integer> next = current.next;
			if(current.element < 5){

				current.next =head;
				head = current;
			}else{
				tail.next =current;
				tail = current;
				tail.next = null;
			}
			current = next;
			
		}
		
		return head;
	}
	
}
