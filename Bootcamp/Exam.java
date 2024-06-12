public class Exam {
    public  static int secondLargest(int[] arr){
        int curr = Integer.MIN_VALUE;
        int prev = Integer.MIN_VALUE;
        for (int i = 2; i < arr.length; i++) {
            if(arr[i] > curr){
                prev = curr;
                curr = arr[i];
            }
            else if(arr[i] > prev && arr[i] != curr){
                prev = arr[i];
            }

        }

        return prev;
    }

    public static void isAnagram(String s1, String s2){
        if(s1.length() != s2.length()){
            System.out.println("Not an Anagram");
            return;
        }

        for(int i=0; i<s1.length(); i++){
            if(!found(s1.charAt(i), s2)){
                System.out.println("Not an Anagram");
                return;
            }
        }

        System.out.println("Strings are Anagrams");
    }

    
    static boolean found(char c, String s2){
        for (int i = 0; i < s2.length(); i++) {
            if(s2.charAt(i) == c){
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,4,8,7,6};
        int secondLargest = secondLargest(arr);
        System.out.println("Second Largest element: " + secondLargest);
        isAnagram("Hello", "Hillo");
    }
}

