
public class LinkedList2_2 {

	public static CS401LinkedListImpl<Integer> myLinkedList = new CS401LinkedListImpl<Integer>();
	
	public static void main(String[] args) {
		myLinkedList.add(1);
		myLinkedList.add(2);
		myLinkedList.add(3);
		myLinkedList.add(4);
		myLinkedList.add(5);
		System.out.println(elementFromLast(3));
		System.out.println(kthToLast(myLinkedList.Head(), 3));
	}
	
	//simple approach if size is known
	public static Integer elementFromLast(int n){
		int indexFromFront = myLinkedList.size() - n;
		CS401LinkedListImpl<Integer>.LinkEntry<Integer> prev ; 
		prev = myLinkedList.Head();
		for(int i = 0;i<indexFromFront;i++){
			prev = prev.next;
		}
		return prev.element;
	}
	
	//this recursive function traverses the entire linked list. when bas e condition reaches
	//its activation stack unravels and as we increase index by 1
	//it means now we are traversing from right to left in as sense
	//when index == n that activation stack is printed
	public static Integer kthToLast(CS401LinkedListImpl<Integer>.LinkEntry<Integer> temp ,int n){
		if(temp == null){
			return 0;
		}
		int index = kthToLast(temp.next, n)+1;
		if(index == n){
			System.out.println(n +"th to last nod is "+ temp.element);
		}
		return index;
	}
	
	
	
}
