class Solution { 
	public int solution(int[] A) {
		int total=0,max=0;
		for(int i=A.length-1;i>=0;i--) {
			if(A[i]==1) {
				max++;
			}else {
				total += max;
			}
			if(total>1000000000) {
				return -1;
			}
		}
		
		return total;
	}
}