package leetCode;

public class ReversreString {
        public String reverseVowels(String s) {
            // Convert the input string to a character array for easy swapping
            char[] chars = s.toCharArray();
            // Define two pointers: one starting from the beginning and one from the end
            int left = 0;
            int right = s.length() - 1;

            // Loop until the two pointers meet
            while (left < right) {
                // Move the left pointer until a vowel is found
                while (left < right && !isVowel(chars[left])) {
                    left++;
                }
                // Move the right pointer until a vowel is found
                while (left < right && !isVowel(chars[right])) {
                    right--;
                }
                // Swap the vowels
                char temp = chars[left];
                chars[left] = chars[right];
                chars[right] = temp;
                // Move the pointers inward
                left++;
                right--;
            }

            // Convert the character array back to a string and return
            return new String(chars);
        }

        // Helper method to check if a character is a vowel (case insensitive)
        private boolean isVowel(char c) {
            return "aeiouAEIOU".indexOf(c) != -1;
        }

        public static void main(String[] args) {
//            ReverseVowels solution = new ReverseVowels();
//
            // Test cases
            String input1 = "IceCreAm";
//            System.out.println(solution.reverseVowels(input1)); // Output: "AceCreIm"

            String input2 = "leetcode";
//            System.out.println(solution.reverseVowels(input2)); // Output: "leotcede"
        }
    }


