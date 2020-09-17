class Solution { 
	public int[] solution(int[] A) {
		int result[] = new int[A.length];
		int max = A[0];
		for(int i=1;i<A.length;i++) {
			max = Math.max(max, A[i]);
		}
		int[] nonDivisors = new int[max+1];
		HashMap<Integer,Integer> noOfOccurance = new HashMap<Integer,Integer>();
		for(int i=0;i<A.length;i++) {
			if(noOfOccurance.containsKey(A[i])) {
				int  k = noOfOccurance.get(A[i]);
				k = k + 1;
				noOfOccurance.put(A[i], k);
			}else {
				noOfOccurance.put(A[i], 1);
			}
		}
		
		for(int i = 0;i<A.length;i++) {
				nonDivisors[A[i]] = A.length - noOfOccurance.get(A[i]);
		}
		for(int i=1;i<=max;i++) {
			if(nonDivisors[i]!=0) {
				int s = i + i;
				while(s<=max && noOfOccurance.containsKey(i)) {
					nonDivisors[s] -= noOfOccurance.get(i);
					s += i;
				}
			}
		}
		for(int i=0;i<A.length;i++) {
			result[i] = nonDivisors[A[i]];
		}
		return result;
	}
}