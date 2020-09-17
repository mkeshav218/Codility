class Solution{ 
	public int solution(int[] A) {
		ArrayList<Integer> peaksIndex = new ArrayList<Integer>();
		for(int i=1;i<A.length-1;i++) {
			if(A[i]>A[i+1] && A[i]>A[i-1]) {
				peaksIndex.add(i);
			}
		}
		HashSet<Integer> factor = new HashSet<Integer>();
		int k = (int) Math.sqrt(A.length);
		for(int i=1;i<=k;i++) {
			if(A.length%i == 0) {
				factor.add(i);
				factor.add(A.length/i);
			}
		}
		int noOfBlock;
		int maxBlockSize = 0;
		for(int i:factor) {
			if(A.length/i <= peaksIndex.size() ) {
				HashSet<Integer> h1 = new HashSet<Integer>();
				noOfBlock = A.length/i;
				int k1=0;
				for(int j=0;j<noOfBlock;j++) {
					int blockStart = k1;
					int blockEnd = blockStart + i - 1 ;
					int count=0;
					for(int e = blockStart;e<=blockEnd;e++) {
						if(peaksIndex.contains(e)) {
							count++;
						}
					}
					h1.add(count);
					k1 = k1 +  i;
				}
				if(h1.size()==1) {
					if(maxBlockSize<noOfBlock) {
						maxBlockSize = noOfBlock;
					}
				}
			}
		}
		return maxBlockSize;
	}
}