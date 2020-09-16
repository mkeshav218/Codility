class Solution{ 
	public int solution(int[] A) {
		HashMap<Integer,Integer> permutation = new HashMap<Integer,Integer>();
		for(int i=1;i<=A.length;i++) {
			permutation.put(i, 0);
		}
		for(int i=0;i<A.length;i++) {
			if(permutation.containsKey(A[i])) {
				int k = permutation.get(A[i]);
				k++;
				permutation.put(A[i], k);
			}else {
				return 0;
			}
		}
		Set<Integer> keySet = permutation.keySet();
		boolean flag = true;
		for(int i:keySet) {
			if(permutation.get(i)!=1) {
				flag = false;
				break;
			}
		}
		if(flag) return 1;
		else return 0;
	}
}