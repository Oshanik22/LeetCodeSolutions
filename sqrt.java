class Solution {
  //Using binary search
    public int mySqrt(int x) {
        long l=0;
        long r=x;
        long res=0;
        
        while(l<=r){
            long mid = l+(r-l)/2;
            
            if(mid*mid==x) return (int)mid;
            else if(mid*mid>x){
                r=mid-1;
            }
            else{
                if(x-mid*mid<x-res){
                    res=mid;
                }
                l=mid+1;
            }
        }
        return (int)res;
    }
}
