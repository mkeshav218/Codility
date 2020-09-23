class Solution { 
	public int solution(int[] A) {
		HashMap<Integer, Integer> frequency = new HashMap<Integer, Integer>();
		for(int i:A) {
			if(frequency.containsKey(i)) {
				int k = frequency.get(i);
				k++;
				frequency.put(i,k);
			}else {
				frequency.put(i,1);
			}
		}
		Set<Integer> keys = frequency.keySet();
		for(int i:keys) {
			if(frequency.get(i)>((A.length)/2)) {
				for(int j=0;j<A.length;j++) {
					if(A[j]==i) {
						return j ;
					}
				}
			}
		}
		return -1;
	}
}