class Solution{ 
	public int[] solution(int N, int[] A) {
		int[] counter = new int[N];
		int setMax=0,max=0;
		for(int i=0;i<A.length;i++) {
			if(A[i]<N+1) {
				if(counter[A[i]-1]<setMax) {
					counter[A[i]-1]=setMax+1;
					max =  Math.max(max, counter[A[i]-1]);
				}else {
					counter[A[i]-1]++;
					max =  Math.max(max, counter[A[i]-1]);
				}
			}else if(A[i]==N+1) {
				setMax=max;
			}
			
			
		}
		for(int i=0;i<N;i++) {
			counter[i]=Math.max(setMax, counter[i]);
		}
	    return counter;
	}
}