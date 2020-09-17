class Solution { 
	public int solution(String S) {
		if(S.length()%2==1) {
			return 0;
		}
		Stack<Character> charStack = new Stack<Character>();
		char ch;
		for(int i=0;i<S.length();i++) {
			ch = S.charAt(i);
			if(ch=='(' || ch=='{' || ch=='[' ) {
				charStack.push(ch);
			}else if(ch==')') {
				if(charStack.size()==0 || charStack.peek()!='(') {
					return 0;
				}else {
					charStack.pop();
				}
			}else if(ch=='}') {
				if(charStack.size()==0 || charStack.peek()!='{') {
					return 0;
				}else {
					charStack.pop();
				}
			}else if(ch==']') {
				if(charStack.size()==0 || charStack.peek()!='[') {
					return 0;
				}else {
					charStack.pop();
				}
			}
		}
		if(charStack.size()==0)
		return 1;
		else
		return 0;
	}
}