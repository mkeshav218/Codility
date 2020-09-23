class Solution{ 
	public int solution(int[] A, int[] B) {
		Stack<Integer> stack = new Stack<Integer>();
		int count=0,i=0;
		for(;i<B.length;i++) {
			if(stack.isEmpty() && B[i]==0) {
				count++;
			}else if(B[i]==1) {
				stack.push(A[i]);
			}else if(B[i]==0) {
				while(stack.size()>0) {
					if(stack.peek()<A[i]) {
						stack.pop();
					}else {
						break;
					}
				}
				if(stack.isEmpty()) {
					count++;
				}
			}
		}
		return count + stack.size();
	}
}
