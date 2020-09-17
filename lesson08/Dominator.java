class Solution { 
	public int solution(int[] A) {
		HashMap<Integer,Integer> occurance = new HashMap<Integer,Integer>();
		int leader=-1;
		for(int i=0;i<A.length;i++) {
			if(occurance.containsKey(A[i])) {
				int c = occurance.get(A[i]);
				c++;
				occurance.put(A[i], c);
				if(c>(A.length)/2) {
					leader= A[i];
					break;
				}
			}else {
				occurance.put(A[i], 1);
			}
		}
		if(leader!=-1) {
			for(int i=0;i<A.length;i++) {
				if(A[i]==leader) {
					return i;
				}
			}
		}
		return -1;
	}
}