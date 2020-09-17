class Solution{ 
	public int[] solution(int N, int[] P, int[] Q) {
		int[] semiPrime = new int[P.length];
		boolean[] prime = new boolean[(N/2) + 1];
		for(int i=2;i<prime.length;i++) {
			prime[i]=true;
		}
		for(int i=2;i<=Math.sqrt(prime.length);i++) {
			if(prime[i]) {
				int k = i * i;
				while(k<prime.length) {
					prime[k] = false;
					k += i;
				}
			}
		}
		int[] maxSemiPrimeArray = new int[N+1];
		for(int i=2;i<prime.length;i++) {
			if(prime[i]) {
				if(i*i < maxSemiPrimeArray.length) {
					maxSemiPrimeArray[i*i]=1;
					for(int j=i+1;j<prime.length;j++) {
						if(prime[j]) {
							if(i*j < maxSemiPrimeArray.length) {
								maxSemiPrimeArray[i*j] = 1;
							}else {
								break;
							}
						}
					}
				}else {
					break;
				}
			}
		}
		int sum = 0;
		for(int i=0;i<maxSemiPrimeArray.length;i++) {
			sum += maxSemiPrimeArray[i];
			maxSemiPrimeArray[i]= sum;
		}
		for(int i=0;i<P.length;i++) {
			semiPrime[i] = maxSemiPrimeArray[Q[i]]-maxSemiPrimeArray[P[i]-1];
		}
		return semiPrime;
	}
}