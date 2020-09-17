class Solution{
	public int solution(int[] A) {
		 int result = Integer.MAX_VALUE;
		 Arrays.sort(A);
		 if(A[0]>=0)
			 return A[0]+A[0];
		 else if(A[A.length-1]<=0) {
			 return Math.abs(A[A.length-1]+A[A.length-1]);
		 }else {
			 int i=0,j=A.length-1,k=1;
			 while(A[k]<0 && (Math.abs(Math.abs(A[i])-A[j]))>(Math.abs(Math.abs(A[k])-A[j]))) {
		
				 i=k;
				 k++;
			 }
			 result = Math.min(Math.abs(A[i]+A[j]),Math.abs(A[k]+A[k]));
			 int firstpositiveindex=0;
			 for(i=1;i<A.length;i++) {
				 if(A[i]>=0) {
					 firstpositiveindex = i;
					 break;
				 }
			 }
			 result = Math.min(result,Math.abs(A[firstpositiveindex]+A[firstpositiveindex]));
		 }
		 return result;
	}
}