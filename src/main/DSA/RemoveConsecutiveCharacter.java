public class RemoveConsecutiveCharacter {
    public static void main(String args[])
    {
        String S="aabaa";
        System.out.println(removeConsecutiveCharacter(S));
    }
   public static String removeConsecutiveCharacter(String S){
        int n = S.length();
        String res = "";
        for (int i = 0 ; i<n ; i++){
            if(i<n-1 && S.charAt(i)==S.charAt(i+1))
            {
                continue;
            }
            else {
                res = res+S.charAt(i);
            }
        }
        return res;
   }
}
