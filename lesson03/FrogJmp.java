class Solution { 
	public int solution(int X, int Y, int D) {
		double k = Y-X;
		k =   Math.ceil(k/D);
		return (int)k;
	}
}