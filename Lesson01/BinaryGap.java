class Solution {
    public int solution(int N) {
	int max=0;
	int arr[] = new int[100];
	int i=0,l=0;
	while(n>0) {
		arr[i++] = n%2;
		n=n/2;
	}
	int start=arr[0],end=0;
	i=0;
	for( i=0;i<arr.length;i++) {
		if(arr[i]==1) {
		        start=i;
		        while(i<arr.length-1 && arr[++i]==0) {
		        }
		        if(arr[i]==1) {
			end=i;
			l=end-start-1;
		        }
		        if(max<l) {
			max=l;
		        }
		        i--;
	                 }
	}
	return max;
        }
}