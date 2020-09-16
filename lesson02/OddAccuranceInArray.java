class Solution{ 
	public int solution(int[] A) {
		HashMap<Integer,Integer> occurance = new HashMap<Integer,Integer>();
		for(int i=0;i<A.length;i++) {
			if(occurance.containsKey(A[i])) {
				int occur = occurance.get(A[i]);
				occur++;
				occurance.put(A[i], occur);
			}else {
				occurance.put(A[i], 1);
			}
		}
		int num=0;
		Set<Integer> entrySet = occurance.keySet();
		for(int i:entrySet) {
			if(occurance.get(i)%2==1) {
				num=i;
				break;
			}
		}
		return num;
	}
}