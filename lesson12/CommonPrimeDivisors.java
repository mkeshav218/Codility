class Solution { 
	public int solution(int[] A, int[] B) {
		int max = -1,count=0;
		for(int i=0;i<B.length;i++) {
			if(B[i]>max)
				max=B[i];
		}
		long[] primes = new long[max+1];
		primes[0]=1;
		primes[1]=1;
		for(int i=2;i<primes.length;i++) {
			if(primes[i]==0) {
				int j=i*2;
				while(j<=max) {
					primes[j]=1;
					j += i;
				}
			}
		}
		List<Integer> prime= new ArrayList<Integer>();
		for(int i=0;i<primes.length;i++) {
			if(primes[i]==0) {
				prime.add(i);
			}
		}
		boolean flag=true;
		for(int i=0;i<A.length;i++) {
			flag=true;
			for(int p:prime) {
				if(A[i]%p==0 && B[i]%p!=0) {
					flag=false;
					break;
				}else if(A[i]%p!=0 && B[i]%p==0) {
					flag=false;
					break;
				}
			}
			if(flag) {
				count++;
			}
		}
		return count;
    }
	
}
