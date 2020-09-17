class Solution{
	public int solution(int[] A) {
		HashMap<Integer,Integer> occurance = new HashMap<Integer,Integer>();
		int leader=-1,occur=-1,count=0;
		for(int i=0;i<A.length;i++) {
			if(occurance.containsKey(A[i])) {
				int c = occurance.get(A[i]);
				c++;
				occurance.put(A[i], c);
				if(c>(A.length)/2) {
					leader= A[i];
					occur = c;
				}
			}else {
				occurance.put(A[i], 1);
			}
		}
		
		if(leader!=-1) {
			int count1=0,count2=occur;
			for(int i=0;i<A.length-1;i++) {
				if(A[i]==leader) {
					count1++;
					count2--;
					
				}
				if((count1>(i+1)/2)&&(count2>(A.length-i-1)/2)) {
					count++;
				}
			}
		}
		return count;
	}
}