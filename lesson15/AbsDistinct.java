class Solution { 
	public int solution(int[] A) {
		HashSet<Integer> h = new HashSet<Integer>();
		for(int i=0;i<A.length;i++) {
			h.add(Math.abs(A[i]));
		}
		return h.size();
	}
}