class Solution { 
	public int solution(int N) {
		int count=0;
		int k = (int) Math.sqrt(N);
		for(int i=1;i<=k;i++) {
			if(N%i == 0) {
				count += 2;
			}
		}
		if(k*k==N) {
			count--;
		}
		return count;
	}
}