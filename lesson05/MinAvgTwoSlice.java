class Solution { 
	public int solution(int[] A) {
		double minAvg =Double.MAX_VALUE;
		 double sum1,sum2;
		 int minIndex=-1;
		 for(int i=0;i<A.length-2;i++) {
			 sum1 = A[i]+A[i+1];
			 if(sum1/2 <minAvg) {
				 minAvg = sum1/2;
				 minIndex=i;
			 }
			 sum2 = sum1 + A[i+2];
			 if(sum2/3 < minAvg) {
				 minAvg = sum2/3;
				 minIndex=i;
			 }
		 }
		 sum1 = A[A.length-2]+A[A.length-1];
		 if(sum1/2 < minAvg) {
			 minAvg =sum1/2;
			 minIndex = A.length-2;
		 }
		 return minIndex;
	}
}