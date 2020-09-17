class Solution { 
	public int solution(int K, int M, int[] A) {
		
		int totalSum = 0,min=Integer.MAX_VALUE;
		for(int i=0;i<A.length;i++) {
			totalSum += A[i];
			min =Math.min(min, A[i]);
		}
		int lower = min;
		int upper = totalSum;
		int result = 0;
		while(lower<=upper) {
			int mid =(upper+lower)/2;
			int blocks = countBlocks(A,mid)[1];
			if(blocks>K)
				lower = mid + 1;
			else {
				if(blocks==K)
					result = Math.max(result,countBlocks(A,mid)[0]);
				result = countBlocks(A,mid)[0];
				upper = mid-1;
			}
				
		}
		return result;
	}
	private int[] countBlocks(int[] A,int mid) {
		int[] result = new int[2];
		int noOfPartition = 1;
		int minBlockSum = 0;
		int sum = A[0];
		for(int i=1;i<A.length;i++) {
			if(sum + A[i]>mid) {
				noOfPartition++;
				minBlockSum = Math.max(minBlockSum, sum);
				sum = A[i];
			}else
				sum += A[i];
		}
		minBlockSum = Math.max(minBlockSum, sum);
		result[0] = minBlockSum;
		result[1] = noOfPartition;
		return result;
	}
}