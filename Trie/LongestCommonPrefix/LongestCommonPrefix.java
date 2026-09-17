import java.util.Arrays;
import java.util.Scanner;
class LongestCommonPrefix{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] strings = new String[n];
        for(int i=0;i<n;i++){
            strings[i] = sc.next();
        }
        String prefix = longestCommonPrefix(strings,n);
        System.out.println(prefix);
    }
    static String longestCommonPrefix(String[] strings, int n){
        Arrays.sort(strings);
        String s1 = strings[0];
        String s2 = strings[n-1];
        int i=0,j=0;
        while(i<s1.length()&&j<s2.length()){
            if(s1.charAt(i) == s2.charAt(j)){
                i++;
                j++;
            }else{
                break;
            }
        }
        return s1.substring(0,j);
    }
}