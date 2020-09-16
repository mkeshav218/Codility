class Solution { 
	public int[] solution(int[] A, int K) {
		int n = A.length;
                                      if(n==0)
                                             return A;
		int[] B = new int[n];
		K = K % n;
		for(int i=0;i<n;i++) {
			B[(i+K)%n]=A[i];
		}
		return B;
	}
}