class Solution{ 
	public int solution(int[] A, int[] B) {
		Stack<Integer> fishSize = new Stack<Integer>();
		int curMaxFlowDownStream=-1,oldMaxFlowDownStream=-1;
		for(int i=0;i<A.length;i++) {
			if(B[i]==0) {
				if(curMaxFlowDownStream==-1) {
					fishSize.push(A[i]);
				}else {
					while(curMaxFlowDownStream!=-1) {
						if(curMaxFlowDownStream<A[i]) {
							int k = fishSize.pop();
							if(k==oldMaxFlowDownStream) {
								curMaxFlowDownStream=-1;
								oldMaxFlowDownStream=-1;
								fishSize.push(A[i]);
							}
							curMaxFlowDownStream=fishSize.peek();
						}else {
							break;
						}
						
					}
				}
				
			}else {
				fishSize.push(A[i]);
				curMaxFlowDownStream=A[i];               // current fish flowing downstream
				if(oldMaxFlowDownStream==-1) {
					oldMaxFlowDownStream=A[i];           //1st fish flowing downstream
				}
			}
		}
		return fishSize.size();
	}
}
