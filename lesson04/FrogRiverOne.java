class Solution { 
	public int solution(int X, int[] A) {
		int minTime =-1,count=X;
		boolean[] fallenLeaves = new boolean[X+1];
		for(int i=0;i<A.length;i++) {
			if(A[i]<fallenLeaves.length && fallenLeaves[A[i]]==false) {
				fallenLeaves[A[i]]=true;
				count--;
			}
			if(count==0) {
				minTime=i;
				break;
			}
		}
		return minTime;
	}
}