class Solution{ 
	public int[] solution(int[] A, int[] B) {
		int[] result = new int[A.length];
		int max = A[0];
		for(int i=1;i<A.length;i++) {
			max = Math.max(max, A[i]);
		}
		long a = 0;
		long b = 1;
		
		BigInteger[] fibonacci = new BigInteger[max+1];
		for(int i=0;i<fibonacci.length;i++) {
			long c = a+b;
			fibonacci[i] = BigInteger.valueOf(c);
			a = b;
			b = c;
		}
		
		for(int i=0;i<A.length;i++) {
			BigInteger ans =  fibonacci[A[i]-1].mod(BigInteger.valueOf((long) Math.pow(2, B[i])));
			result[i] = ans.intValue();
		}
		return result;
	}
	
}