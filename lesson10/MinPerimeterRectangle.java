class Solution{ 
	public int solution(int N) {
		int perimeter = 2*(1+N);
		int length=0,breadth=0;
		for(int i=2;i<=Math.sqrt(N);i++) {
			if(N%i==0) {
				length = i;
				breadth = N/i;
				if((2*(length+breadth))<perimeter) {
					perimeter = 2 * (length + breadth);
				}
			}
		}
		return perimeter;
	}
}