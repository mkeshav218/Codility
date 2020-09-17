class Solution{ 
	public int solution(int M, int[] A) {
		int beg=0,end=0,noOfSlice=0;
		boolean[] visited = new boolean[M+1];
		while(beg<A.length && end<A.length) {
			if(!visited[A[end]]) {
				visited[A[end]]=true;
				noOfSlice += end-beg+1;
				end++;
				if(noOfSlice>=1000000000)
					return 1000000000;
			}else {
				visited[A[beg]]=false;
				beg++;
			}
		}
		return noOfSlice;
	}
}