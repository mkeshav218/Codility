class Solution{ 
	public int solution(int[] A) {
		ArrayList<Integer> peaksIndex = new ArrayList<Integer>();
		for(int i=1;i<A.length-1;i++) {
			if(A[i]>A[i+1] && A[i]>A[i-1]) {
				peaksIndex.add(i);
			}
		}
		int max = 0;
		int maxNoFlag = peaksIndex.size();
		while(maxNoFlag>=0) {
			int a = peaksIndex.get(0);
			int count=1;
			for(int i=1;i<maxNoFlag;i++) {
				int b = a+ maxNoFlag;
				if(peaksIndex.get(i)>=b) {
					//l.add(peaksIndex.get(i));
					count++;
					a = peaksIndex.get(i);
				}
			}
			if(max<count) {
				max = count;
			}
			if(maxNoFlag==max) break;
			maxNoFlag--;
		}
		return max;
	}
}