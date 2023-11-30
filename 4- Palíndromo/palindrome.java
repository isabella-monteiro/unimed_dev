public class palindrome {
    public static void main(String[] args) {
    String word = "Arara";

    if (palindrome(word)) {
    System.out.println(word + " é um palíndromo" );
    } else {
    System.out.println(word + " não é um palíndromo");
    }
    }
    
    public static boolean palindrome(String word) {
    word = word.replaceAll("\\s", "").toLowerCase();
    int left = 0;
    int right = word.length() - 1;
    while (left < right) {
    if (word.charAt(left) != word.charAt(right)) {
    return false;
    }
    left++;
    right--;
    }
    return true;
    }
}
   