public class ValidPalindromAlternate {
    public static boolean isPalindrome(String s) {
        if (s.length() == 0) {
            return true;
        }

        s = s.toLowerCase();
        int i = 0;
        int j = s.length() - 1;

        while (i < j) {
            char first = s.charAt(i);
            char last = s.charAt(j);

            if (!Character.isLetterOrDigit(first)) {
                i++;
                continue;
            }

            if (!Character.isLetterOrDigit(last)) {
                j--;
                continue;
            }

            if (first != last) {
                return false;
            }

            i++;
            j--;
        }

        return true;
    }
}