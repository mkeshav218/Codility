class Solution{ 
	public int solution(int[] A) {
		Arrays.sort(A);
		int pdt = 0,pdt1,pdt2;
		if(A[0]>=0 || A[A.length-1]<0) {
			pdt = A[A.length-1]*A[A.length-2]*A[A.length-3];
		}else if(A[0]<0 && A[1]>0) {
			pdt = A[A.length-1]*A[A.length-2]*A[A.length-3];
		}else if(A[0]<0 && A[1]<0) {
			pdt1 = A[0]*A[1]*A[A.length-1];
			pdt2 = A[A.length-1]*A[A.length-2]*A[A.length-3];
			if(pdt1>pdt2) {
				pdt = pdt1;
			}else {
				pdt = pdt2;
			}
		}
		return pdt;
	}
}
