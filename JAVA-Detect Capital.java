import java.util.regex.Pattern;
class Solution {
    public boolean detectCapitalUse(String word) {
        
         String pattern1 = "[A-Z]+";
         String pattern2 = "[a-z]+";
         String pattern3 = "[A-Z]{1}[a-z]+";
        
         return Pattern.matches(pattern1, word) || Pattern.matches(pattern2, word) || Pattern.matches(pattern3, word);
        
    }
}