import java.util.Arrays;

//find two adjacent numbers which give you tham
public class Practice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] my = {4,3,6};
		System.out.println(findTwoAdj(my));

	}
	
	public static int findTwoAdj(int[] number){
		int max = 0 ;
		for(int i = 0 ; i<number.length-1;i++){
			int mean = (number[i]+number[i+1])/2;
			number[i]= 0;
			number[i+1] = mean;
		int temp =	Integer.parseInt(Arrays.toString(number));
		if(max<temp){
			max =temp;
		}
		}
		return max;
	}
}
