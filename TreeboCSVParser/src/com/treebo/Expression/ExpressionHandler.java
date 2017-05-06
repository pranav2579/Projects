package com.treebo.Expression;

import java.util.Stack;
import java.util.StringTokenizer;

import com.treebo.handler.DataHandler;

public class ExpressionHandler implements DataHandler {

	@Override
	public void handle(String data) {
		System.out.println(data);
		Stack<String> stack = new Stack<String>();
		data = data.replaceAll("", " ");
		StringTokenizer tokens = new StringTokenizer(data);
		while (tokens.hasMoreTokens()) {
			String tkn = tokens.nextToken();

			if (tkn.equals("(") || tkn.equals("{") || tkn.matches("[0-9]+") || tkn.equals("*") || tkn.equals("/")
					|| tkn.equals("+") || tkn.equals("-")) {
				stack.push(tkn);
			} else if (tkn.equals("}") || tkn.equals(")")) {
				try {
					int op2 = Integer.parseInt(stack.pop());
					String oprnd = stack.pop();
					int op1 = Integer.parseInt(stack.pop());
					if (!stack.isEmpty()) {
						stack.pop();
					}
					int result = 0;
					if (oprnd.equals("*")) {
						result = op1 * op2;
					} else if (oprnd.equals("/")) {
						result = op1 / op2;
					} else if (oprnd.equals("+")) {
						result = op1 + op2;
					} else if (oprnd.equals("-")) {
						result = op1 - op2;
					}
					stack.push(result + "");
				} catch (Exception e) {
					e.printStackTrace();
					break;
				}
			}
		}
		String finalResult = "";
		try {
			finalResult = stack.peek();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(finalResult);
	}
}
