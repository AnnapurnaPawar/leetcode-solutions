class Solution {
    public boolean halvesAreAlike(String s) {
         int mid = s.length()/2;
         String a = s.substring(0,mid);
         String b = s.substring(mid);
        char[] vowels = {'a', 'e', 'i', 'o', 'u','A', 'E', 'I', 'O', 'U'};
           
           int countA= 0;
           int countB=0;
           for ( int i =0;i<a.length();i++){
            char ch =a.charAt(i);
         
         for(int j =0;j<vowels.length;j++){
            if(ch==vowels[j]){
                countA++;
                break;
            }
         }
           }


           for (int i = 0; i < b.length(); i++) {
            char ch = b.charAt(i);

            for (int j = 0; j < vowels.length; j++) {
                if (ch == vowels[j]) {
                    countB++;
                    break;
                }
            }
        }
            return countA == countB;
    }
}