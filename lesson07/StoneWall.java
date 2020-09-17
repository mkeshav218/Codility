class Solution{ 
	public int solution(int[] H) {
		Stack<Integer> s = new Stack<Integer>();
		int count=0;
		for(int i=0;i<H.length;i++) {
			if(s.empty()) {
				s.push(H[i]);
				count++;
			}
			if(H[i]>s.peek()) {
				s.push(H[i]);
				count++;
			}
			while(H[i]<s.peek()) {
				s.pop();
				if(s.empty()) {
					s.push(H[i]);
					count++;
				}else if(H[i]>s.peek()) {
					s.push(H[i]);
					count++;
				}
			}
		}
		return count;
	}
}