import java.util.Stack;

///check if given expression is a balanced expression
public class BalancedExpression {

	public static void main(String args[]){
		System.out.println(isBalanced("{(})"));
	}
	private static boolean isBalanced(String inputString){
		Stack<Character> charStack = new Stack<>();
		for(int i = 0; i<inputString.length();i++){
			char tempChar = inputString.charAt(i);
			if(tempChar=='{'||tempChar == '('||tempChar == '['){
				charStack.push(tempChar);
			}else if(tempChar == '}'||tempChar==')'||tempChar==']'){
				if(charStack.isEmpty()){
					return false;
				}
			 char currentChar = charStack.peek();
			 if(currentChar == '{' && tempChar!='}'||
				currentChar == '[' && tempChar!=']'||
				currentChar == '(' && tempChar!=')'){
				 return false;
			 }else{
				 charStack.pop();
			 }
			}
		}
		return charStack.isEmpty();
	}
	
}
