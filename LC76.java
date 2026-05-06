public class LC76 {
    public static void main(String[] args) {
        String s = "ADOBECODEBANC";
        String t = "ABC";
        int n = s.length();
        int[] freq = new int[26];
        int[] wind = new int[26];
        int minString = 0;

        for(int i=0; i<t.length(); i++){
            freq[t.charAt(i) - 'A']++;
        }

        int l=0; 
        int r=0;
        while(r<n){
            wind[s.charAt(r) - 'A']++;

            while(wind>freq){
                wind[s.charAt(l) - 'A']--;
                l++;
            }

            if(wind==freq){
                minString = Math.min(minString, r-l+1);

            }
            r++;
        }
    }
}
