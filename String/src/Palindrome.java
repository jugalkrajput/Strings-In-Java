public class Palindrome {                       //A palindrome reads the same forward and backward.

    public static void main(String[] args) {

        String str = "madam";

//      Method 1 ==>> Palindrome Using Two Pointers
        String reversed = new StringBuilder(str)
                .reverse()
                .toString();
        System.out.println(str.equals(reversed));

//      Method 2

        int left = 0;
        int right = str.length() - 1;

        boolean palindrome = true;

        while (left < right) {

            if (str.charAt(left) != str.charAt(right)) {
                palindrome = false;
                break;
            }

            left++;
            right--;
        }

        System.out.println(palindrome);
    }
}
