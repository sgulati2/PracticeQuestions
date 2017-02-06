
public class LinkedList2_5 {
	public static CS401LinkedListImpl<Integer> firstList = new CS401LinkedListImpl<Integer>();
	public static CS401LinkedListImpl<Integer> secondList = new CS401LinkedListImpl<Integer>();
	public static CS401LinkedListImpl<Integer> resultList = new CS401LinkedListImpl<Integer>();
	public static CS401LinkedListImpl<Integer> resultList1 = new CS401LinkedListImpl<Integer>();
	public static void main(String[] args) {
		firstList.add(7);
		firstList.add(1);
		firstList.add(6);
		secondList.add(5);
		secondList.add(9);
		secondList.add(2);
		String firstString = linkedListReverse(firstList.Head());
		String secondString = linkedListReverse(secondList.Head());
		int result = Integer.parseInt(firstString) + Integer.parseInt(secondString);
		System.out.println(result);
		String resultString = String.valueOf(result);
		for(int i = resultString.length()-1 ;i>=0;i--){
			resultList.add((int)resultString.charAt(i)-(int)('0'));
		}
		resultList.print();
		
		
		//book
		newlinkedListReverse(firstList.Head(), secondList.Head(), 0);
		resultList1.print();
	}
	
//	public static CS401LinkedListImpl<Integer>.LinkEntry<Integer> 
//	linkedListSum(CS401LinkedListImpl<Integer>.LinkEntry<Integer> firsthead, 
//				CS401LinkedListImpl<Integer>.LinkEntry<Integer> secondhead){
//		String firstValue="";
//		String secondValue="";
//		CS401LinkedListImpl<Integer>.LinkEntry<Integer> temp;
//		for(temp = firsthead; temp.next != null; ){
//			firstValue = firstValue + temp.toString();
//			temp = temp.next;
//		}
//		for(temp = secondhead; temp.next != null; ){
//			secondValue = secondValue + temp.toString();
//			temp = temp.next;
//		}
//		
//		return secondhead;
//		
//	}
	
	public static String linkedListReverse(CS401LinkedListImpl<Integer>.LinkEntry<Integer> firsthead){
		String myValue = "";
		if(firsthead == null){
			return "";
		}
		myValue = linkedListReverse(firsthead.next) + firsthead.element.toString(); 
		
		return myValue;
		
	}
	public static CS401LinkedListImpl<Integer> newlinkedListReverse(CS401LinkedListImpl<Integer>.LinkEntry<Integer> firsthead,CS401LinkedListImpl<Integer>.LinkEntry<Integer> secondhead,int carry){
		int first = 0,second = 0,value = 0;
		if(firsthead == null && secondhead == null && carry ==0){
			return null;
		}
		if(firsthead != null){
			first = firsthead.element;
		}
		if(secondhead != null){
			second = secondhead.element;
		}
		
		value = (first + second +carry);
		int finalVal = value %10;
		resultList1.add(finalVal);
		//add value in linked list and do a recursion for the next nodes.
		newlinkedListReverse(firsthead == null? null :firsthead.next, secondhead == null?null:secondhead.next, value >= 10 ? 1:0);
		
		return resultList1;
		
	}
}
