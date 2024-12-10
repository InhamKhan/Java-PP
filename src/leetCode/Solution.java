package leetCode;
//String Compression 443

public class Solution {
    public int compress(char[] chars) {
        int index = 0; // Pointer to insert the compressed characters
        int i = 0; // Pointer to traverse the input array

        while (i < chars.length) {
            char currentChar = chars[i];
            int count = 0;

            // Count the number of consecutive repeating characters
            while (i < chars.length && chars[i] == currentChar) {
                i++;
                count++;
            }

            // Write the current character to the array
            chars[index++] = currentChar;

            // If the count is greater than 1, write the count as well
            if (count > 1) {
                for (char c : Integer.toString(count).toCharArray()) {
                    chars[index++] = c;
                }
            }
        }

        return index; // The length of the compressed array
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Example 1
        char[] chars1 = {'a', 'a', 'b', 'b', 'c', 'c', 'c'};
        int length1 = solution.compress(chars1);
        System.out.println("Output length: " + length1);
        System.out.print("Compressed chars: ");
        for (int i = 0; i < length1; i++) {
            System.out.print(chars1[i]);
        }
        System.out.println();

        // Example 2
        char[] chars2 = {'a'};
        int length2 = solution.compress(chars2);
        System.out.println("Output length: " + length2);
        System.out.print("Compressed chars: ");
        for (int i = 0; i < length2; i++) {
            System.out.print(chars2[i]);
        }
        System.out.println();

        // Example 3
        char[] chars3 = {'a', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b'};
        int length3 = solution.compress(chars3);
        System.out.println("Output length: " + length3);
        System.out.print("Compressed chars: ");
        for (int i = 0; i < length3; i++) {
            System.out.print(chars3[i]);
        }
        System.out.println();
    }
}
