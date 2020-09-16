class Solution{ 
	public int solution(int[] A) {
		int max = Integer.MIN_VALUE;
		int n = A.length;
		for(int i=0;i<n;i++) {
			if(A[i]>max)
				max=A[i];
		}
		if(max<1) {
			return 1;                     // if all elements are less than 1, then it's returning 1
		}else {
			int[] counterArray = new int[n+1];
			for(int i=0;i<n ;i++) {
				if(A[i]>0 && A[i]<counterArray.length)
					counterArray[A[i]]++;
			}
			for(int i=1;i<n+1;i++) {
				if(counterArray[i]==0) {
					return i;           // if found missing element, it's returning that 
				}
			}
			return n+1;            
		}
	}
}