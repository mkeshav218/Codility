class Solution { 
	public int[] solution(String S, int[] P, int[] Q) {
		int a=0,c=0,g=0,t=0;
		int[] res = new int[P.length];
		Node[] n = new Node[S.length()+1];
		n[0]=new Node(0,0,0,0);
		for(int i=0;i<S.length();i++) {
			char ch = S.charAt(i);
			if(ch=='A') {
				a++;
			}else if(ch=='G') {
				g++;
			}else if(ch=='C') {
				c++;
			}else {
				t++;
			}
			n[i+1]=new Node(a,c,g,t);
		}
		for(int i=0;i<P.length;i++) {
			int num=1;
			if(P[i]==Q[i]) {
				char ch = S.charAt(P[i]);
				if(ch=='A') {
					num=1;
				}else if(ch=='C') {
					num=2;
				}else if(ch=='G') {
					num=3;
				}else {
					num=4;
				}
			}
			else if(n[Q[i]+1].A-n[P[i]].A>0) {
				num=1;
			}else if(n[Q[i]+1].C-n[P[i]].C>0) {
				num=2;
			}else if( n[Q[i]+1].G-n[P[i]].G>0) {
				num=3;
			}else if(n[Q[i]+1].T-n[P[i]].T>0) {
				num=4;
			}
			res[i] = num;
		}
		return res;
	}
}
class Node{
	int A;
	int C;
	int G;
	int T;
	public Node(int a, int c, int g, int t) {
		A = a;
		C = c;
		G = g;
		T = t;
	}
	
}