public class LC424 {
    public static void main(String[] args) {
        
        String s = "ABAB";
        int n = s.length();
        int k=2;
        int count = 0;
        int maxLength = 0;
        int maxFreq = 0;
        int[] freq = new int[26];
        int l=0;
        int r=0;
        

        while(r<n){
           freq[s.charAt(r)- 'A']++;

           maxFreq = Math.max(maxFreq, freq[s.charAt(r) - 'A']);
           count = ((r-l+1) - maxFreq);

           while(count>k){
                freq[s.charAt(l) - 'A']--;
                l++;
                 count = ((r-l+1) - maxFreq);

           }

           maxLength = Math.max(maxLength, r-l+1);
           r++;
           
        }

        System.out.println(maxLength);
        }
}
