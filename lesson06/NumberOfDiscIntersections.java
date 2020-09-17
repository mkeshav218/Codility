class Solution{
	public int solution(int[] A) {
		int count=0;
		for(int i=0;i<A.length-1;i++) {
			for(int j=i+1;j<A.length;j++) {
				if(((long)A[j]+A[i])>=(j-i)) {
					count++;
				}
			}
			if(count>10000000) {
				return -1;
			}
		}
		return count;
	}
}
