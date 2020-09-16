class Solution{ 
	public int solution(int[] A) {
		boolean[] B = new boolean[A.length+2];
		for(int i=0;i<A.length;i++) {
			B[A[i]]=true;
		}
		for(int i=1;i<B.length;i++) {
			if(!B[i]) {
				return i;
			}
		}
		return 0;
	}
}