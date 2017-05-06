import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class PostFixtoInfix {
	
	public static void PrintPrettyEquation(ArrayList<String> al){
		Collections.reverse(al);
		Stack stack = new Stack();
		
		for(String s:al){
			if(s.equals("add") || s.equals("subtract") || s.equals("divide") || s.equals("multiply") || s.equals("equal")){
				String s1 = (String)stack.pop();
				String s2 = (String)stack.pop();
				String s3 = "( " + s1 + " " + s + " " + s2 + " )";
				stack.push(s3);				
			}
			else{
				stack.push(s);
			}
			System.out.println(stack);
		}
	}
	
	public static void main(String[] args){
		ArrayList<String> al  = new ArrayList<String>();
		al.add("equal");
		al.add("add");
		al.add("1");
		al.add("multiply");
		al.add("x");
		al.add("10");
		al.add("21");
		PrintPrettyEquation(al);
				
	}

}
