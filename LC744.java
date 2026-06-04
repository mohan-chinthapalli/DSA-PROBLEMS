public class LC744 {
    public static void main(String[] args) {

        // optimal approach with binary search 
        // approach search the character if it finnd in the char array imeediately return the next element to it 
        // because the letters array is sorted
        // extra test case if no character iss matched just return the letters first element
        char[] letters = {'c', 'f', 'j'};
        int n = letters.length;

        char target = 'c';
        int st = 0;
        int end = n;
        int mid = 0;

        while(st<=end){
            mid= (st+end)/2;
            char ch = letters[mid];
            if(ch>target){
                end = mid-1;
            }else if(ch<target){
                st = mid+1;
            }else{
                System.out.println(letters[mid+1]);
                return;
            }
        }

        System.out.println(letters[0]);
    }
}
