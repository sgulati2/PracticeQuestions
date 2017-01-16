/// used string builder as string concat has a complexity of n^2
public class Array1_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(CompressString("aabcccccaaa"));
	}
	
	public static StringBuilder CompressString(String input){
	StringBuilder compressString = new StringBuilder();
	int consecutive = 0;
	
	for(int  i = 0; i<input.length();i++){
		consecutive++;
		
		if(i+1>=input.length()||input.charAt(i)!=input.charAt(i+1)){
			compressString.append(input.charAt(i));
			compressString.append(consecutive);
			consecutive = 0;
		}
	}
	return compressString;
	}
//	public static String CompressString(String input){
//		Integer [] mychar = new Integer[input.length()];
//		for(int i = 0; i<input.length();i++){
//			if(mychar[(int)input.charAt(i)]>=1){
//				mychar[(int)input.charAt(i)]= mychar[(int)input.charAt(i)]++;
//			}else{
//				mychar[(int)input.charAt(i)] = 1;
//			}
//		}
//		int size = 0;
//		String myString = "";
//		for (int k =0;k<input.length();k++){
//			if (mychar[input.charAt(k)] == 1){
//				size++;
//			}
//				myString = myString +String.valueOf(input.charAt(k))+String.valueOf(mychar[input.charAt(k)]);	
//		}
//		if(size==input.length()){
//			myString = input;
//		}
//		return myString;
//	}
}
