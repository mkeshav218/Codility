class Solution{
	public int solution(int N, int M) {
		int k = gcd(N,M);
		int noOfChocolate = N/k;
		return noOfChocolate;
	}
	private static int gcd(int N,int M) {
		if(N%M==0)
			return M;
		else 
			return gcd(M,N%M);
	}
}