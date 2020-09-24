class Solution {
    public int solution(int[] A) {
        if(A.length==1)
        return Math.abs(2*A[0]);
        List<Integer> b = new ArrayList<Integer>();
		for(int i:A){
		    b.add(i);
		}
		Collections.sort(b,new MyComparator());
		int minSum=Integer.MAX_VALUE;
		for(int i=0;i<b.size()-1;i++){
		    int k = Math.abs(b.get(i)+b.get(i));
		    if(minSum>k){
		        minSum=k;
		    }
		    k = Math.abs(b.get(i)+b.get(i+1));
		    if(minSum>k){
		        minSum=k;
		    }
		}
		return minSum;
    }
}
class MyComparator implements Comparator<Integer> {
    
    public int compare(Integer a, Integer b){
        if(a.equals(b))
        return 1;
        return Math.abs(a)- Math.abs(b);
    }
}