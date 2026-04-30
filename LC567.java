
import java.util.Arrays;

public class LC567 {
    public static void main(String[] args) {
        
        String s1 = "eidbaooo";
        String s2 = "ab";
        int k = s2.length();
        int n = s1.length();
        int[] freq = new int[26];
        int[] wind = new int[26];
        boolean valid = false;

        for(int i=0; i<k; i++){
            freq[s2.charAt(i) - 'a']++;
        }

        int l=0;
        int r=0;
        while(r<n){

            wind[s1.charAt(r) - 'a']++;

            while(r-l+1 > k){
                wind[s1.charAt(l) - 'a']--;
                l++;
            }

            if(r-l+1 == k){
                if(Arrays.equals(freq, wind)){
                    valid = true;
                    break;
                }
            }
            r++;
        }

        System.out.println(valid);
    }
}
