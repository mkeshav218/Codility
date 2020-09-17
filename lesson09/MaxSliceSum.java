class Solution { 
	public int solution(int[] A) {
		int curMax=A[0],maxTotal=A[0];
		for(int i=1;i<A.length;i++) {
			if(A[i]>0) {
				if(curMax<0) curMax = A[i];
				else curMax += A[i];
			}else {
				curMax = Math.max(0, curMax+A[i]);
			}
			if(curMax==0) {
				maxTotal = Math.max(A[i], maxTotal);
			}else {
				maxTotal = Math.max(curMax, maxTotal);
			}
		}
		return maxTotal;
	}
}
