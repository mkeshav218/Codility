class Solution{ 
	public int solution(int[] A) {
		Arrays.sort(A);
		int result=0;
		for(int i=0;i<A.length-2;i++) {
			int k = i + 2;
			for(int j=i+1;j<A.length-1;j++) {
				while(k<A.length && A[i]+A[j]>A[k])
					k++;
				result += k-j-1;
			}
		}
		return result;
	}
}