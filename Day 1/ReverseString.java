public class ReverseString {

    public static String reverseString(String str) {
        StringBuilder sb = new StringBuilder();

        for (int i = str.length() - 1; i >= 0; i--) {
            sb.append(str.charAt(i));
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String test1 = "Cat";
        String test2 = "The Daily Byte";
        String test3 = "civic";

        System.out.println(reverseString(test1));
        System.out.println(reverseString(test2));
        System.out.println(reverseString(test3));
    }

}