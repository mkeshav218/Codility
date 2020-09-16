class Solution { 
	public int solution(int A, int B, int K) {
		
		int count=0;
		int lowBound = A/K;
		int upperBound = B/K;
		count = upperBound-lowBound;
		if(A%K==0) {
			count++;
		}
		return count;
	}
}