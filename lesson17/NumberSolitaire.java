class Solution { 
	public int solution(int[] A) {
		int B[] = new int[6];
		int sum = A[0];
		Arrays.fill(B, sum);
		for(int i=1;i<A.length;i++) {
			int max=B[0];
			for(int j=1;j<B.length;j++) {
				max = Math.max(max, B[j]);
			}
			sum = max;
			B[i%6] = sum + A[i];
			if(sum<B[i%6])
				sum = B[i%6];
		}
		return B[(A.length-1)%6];
	}
}