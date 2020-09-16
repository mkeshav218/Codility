class Solution{ 
	public int solution(int[] A) {
		int min =999999999,total=0,k=0,l=0;
		for(int i=0;i<A.length;i++) {
			total += A[i];
		}
		for(int i=0;i<A.length-1;i++) {
			k += A[i];
			l = Math.abs(total - (k*2));
			if(l<min) {
				min=l;
			}
		}
		return min;
	}
}