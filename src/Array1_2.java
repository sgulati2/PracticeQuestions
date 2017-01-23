import java.util.Arrays;

import javax.naming.ldap.SortControl;

// check if two strings are permutation of each other.
public class Array1_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(ifPermutation("susrit", "tirkUs"));
		System.out.println(ifPermutationMethod2("susrit", "tirkUs"));
	}
	
	public static boolean ifPermutation(String firstString, String secondString){
		//case insensitive
		char firstArray[] = firstString.toLowerCase().toCharArray();
		char secondArray[] = secondString.toLowerCase().toCharArray();
		Arrays.sort(firstArray);
		Arrays.sort(secondArray);
		for(int i=0 ;i<Math.max(firstArray.length, secondArray.length);i++){
			if(firstArray.length!=secondArray.length){
				return false;
			}
			if(firstArray[i]!=secondArray[i]){
				return false;
			}
		}
		return true;
	}

	public static boolean ifPermutationMethod2(String firstString, String secondString){
		//case insensitive
		char firstArray[] = firstString.toLowerCase().toCharArray();
		char secondArray[] = secondString.toLowerCase().toCharArray();
		Arrays.sort(firstArray);
		Arrays.sort(secondArray);
		
		if(String.valueOf(firstArray).equals(String.valueOf(secondArray))){
			return true;
		}
		return false;
	}
}
