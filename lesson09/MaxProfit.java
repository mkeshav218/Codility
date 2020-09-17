class Solution{ 
	public int solution(int[] A) {
		if(A.length<2) {
			return 0;
		}
		int[] profitDifference = new int[A.length-1];
		for(int i=0;i<profitDifference.length;i++) {
			profitDifference[i] = A[i+1]-A[i];
		}
		int maxEnd=0,maxTotal=0;
		for(int i=0;i<profitDifference.length;i++) {
			maxEnd = Math.max(0, maxEnd+profitDifference[i]);
			maxTotal = Math.max(maxEnd, maxTotal);
		}
		return maxTotal;
	}
	
}