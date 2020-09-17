class Solution{
	public int solution(int[] A) {
		int[] B = new int[A.length];
		B[0]=A[0];
		for(int i=1;i<A.length;i++) {
			B[i]=B[i-1]+A[i];
		}
		ArrayList<Integer> l = new ArrayList<Integer>();
		l.add(0);
		for(int i=1;i<A.length-1;i++) {
			if(B[i]<B[i-1]) {
				l.add(i);
			}
		}
		l.add(A.length-1);
		int sum=0;
		if(l.size()==4) {
			int s1 = B[l.get(1)-1]-B[l.get(0)];
			int s2 = B[l.get(2)-1]-B[l.get(1)];
			int s3 = B[l.get(3)-1]-B[l.get(2)];
			int[] a = new int[3];
			a[0]=s1;a[1]=s2;a[2]=s3;
			Arrays.sort(a);
			sum += a[1] + a[2];
		}else if(l.size()==3) {
			int s1 = B[l.get(1)-1]-B[l.get(0)];
			int s2 = B[l.get(2)-1]-B[l.get(1)];
			sum += s1 + s2;
		}else if(l.size()==2) {
			int min = Integer.MAX_VALUE;
			for(int i=1;i<A.length-1;i++) {
				if(min>A[i])
					min=A[i];
			}
			sum = B[A.length-2]-B[0]-min;
		}else {
			int[] a = new int[l.size()-2];
			for(int i=0;i<l.size();i++) {
				a[i] = B[l.get(i+1)-1]-B[l.get(i)];
			}
			Arrays.sort(a);
			sum = a[l.size()-3];
		}
		return sum;
	}
}