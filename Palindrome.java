public class Palindrome {
    private static boolean checkPalindrome(String s) {
        int n=s.length();
        for(int i=0;i<=(n/2)-1;i++){
            if(s.charAt(i)!=s.charAt(n-1-i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String []args)
    {
        String s="rabba";
        boolean t= checkPalindrome(s);
        System.out.println("check= "+t);
    }


}
