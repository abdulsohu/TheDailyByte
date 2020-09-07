public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        if (s.length() == 0) {
            return true;
        }

        String clean = cleanString(s);

        int last = clean.length() - 1;
        int first = 0;

        while (first < last) {
            if (clean.charAt(first) != clean.charAt(last)) {
                return false;
            }
            first++;
            last--;
        }

        return true;
    }

    public String cleanString(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetterOrDigit(s.charAt(i))) {
                sb.append(s.charAt(i));
            }
        }
        return sb.toString().toLowerCase();
    }
}
