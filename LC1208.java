public class LC1208 {
    public static void main(String[] args) {
        
        String s = "abcd";
        String t = "bcdf";
        int n = s.length();
        int cost = 0;
        int maxCost = 3;
        int maxLength = Integer.MIN_VALUE;
        int l=0;
        int r=0;
        while(r<n){
        cost += Math.abs(s.charAt(r) - t.charAt(r)); 
        
        while(cost>maxCost){
            int tempCost = Math.abs(s.charAt(l) - t.charAt(l));
            cost -= tempCost;
            l++;
        }

        maxLength = Math.max(maxLength, r-l+1);
        r++;
           }

           System.out.println(maxLength);
    }
}
