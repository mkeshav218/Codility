class Solution{ 
	public int solution(int K, int[] A) {
		int lengthOfRope = A[0];
		int count=0;
		for(int i=1;i<A.length;i++) {
			if(lengthOfRope>=K) {
				lengthOfRope=A[i];
				count++;
			}else {
				lengthOfRope += A[i];
			}
		}
		if(lengthOfRope>=K)
			count++;
		return count;
	}
}