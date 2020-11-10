package braces_project;

import java.util.Stack;

public class App {
	
	public static String isBalanced (String input) {
		Stack opening = new Stack<>();
		Stack closing = new Stack();
		
		for (int i = 0; i < input.length(); i++) {
			String current = input.substring(i, i+1);
			if (current.equals("(") ||current.equals("{") || current.equals("[")){
				opening.push(current);	
			}
			else if (current.equals(")")) {
				if (! opening.empty()) {
					String lastOpening = opening.pop().toString();
					if (! lastOpening.equals("(")) {
						return "NO";
					}
				} else {
					closing.push(current);
				}
			} else if (current.equals("}")) {
				if (! opening.empty()) {
					String lastOpening = opening.pop().toString();
					if (! lastOpening.equals("{")) {
						return "NO";
					}
				} else {
					closing.push(current);
				}
			} else if (current.equals("]")) {
				if (! opening.empty()) {
					String lastOpening = opening.pop().toString();
					if (! lastOpening.equals("[")) {
						return "NO";
					}
				} else {
					closing.push(current);
				}
			}
		}
		if (!opening.empty() || !closing.empty() ) {
			return "NO";
		}
		
		return "YES";
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isBalanced("({}([][]))[]()"));

	}

}


Como se ha afectado por el covit 19
Colombia
Lider técnico
Adrian



