class Solution {
    public int solution(int[] A, int[] B) {
    	if(A.length==0)
    		return 0;
    	int temp=B[0];
    	int count=1;
    	int i=0;
    	while(i<A.length) {
    		if(A[i]>temp) {
    			count++;
    			temp=B[i];
    		}
    		i++;
    	}
    	return count;
    }
}