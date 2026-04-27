import java.util.HashMap;
import java.util.Map;

public class LC03 {
    public static void main(String[] args) {
        
        String s = "abcabcbb";
        int n =s.length();
        int maxLength = Integer.MIN_VALUE;
        // brute approach
        // for(int i=0; i<n; i++){
        //     for(int j=i; j<n; j++){
        //         boolean duplicate = false;
        //         for(int k=i; k<j; k++){
        //             if(S.charAt(k)==S.charAt(j)){
        //                 duplicate = true;
        //                 break;
        //             }
        //         }

        //         if(duplicate){
        //             break;
        //         }

        //         maxLength = Math.max(maxLength, j-i+1);
        //     }
        // }
        // optimal approach
        // int l=0;
        // int r=0;
        // boolean[] seen = new boolean[256];

        // while(r<n){
           
        //     while(seen[s.charAt(r)]){
        //         seen[s.charAt(l)] = false;
        //         l++;
        //     }   
        //         seen[s.charAt(r)] = true;
        //          maxLength = Math.max(maxLength, r-l+1);
                
        //     r++;
        // }

        // hashmap version
        Map<Character, Integer> map = new HashMap<>();

        int l=0;
        for(int r=0; r<n; r++){
            if(map.containsKey(s.charAt(r))){
                l = Math.max(l, map.get(s.charAt(r))+1);
            }

            map.put(s.charAt(r), r);

            maxLength = Math.max(maxLength, r-l+1);
        }

        System.out.println(maxLength);

        
    }
}
