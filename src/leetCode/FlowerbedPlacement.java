package leetCode;
//
//public class Leetcode01 {
//
//
//    public boolean canPlaceFlowers(int[] flowerbed, int n) {
//        int len = flowerbed.length;
//        int canPlant = 0;
//
//        if (len == 1) {
//            if (flowerbed[0] == 0) {
//                canPlant++;
//            }
//            return canPlant >= n;
//        }
//
//        if (flowerbed[0] == 0 && flowerbed[1] == 0) {
//            flowerbed[0] = 1;
//            canPlant++;
//        }
//
//        for (int i = 1; i < len - 1; i++) {
//            if (flowerbed[i - 1] == 0 && flowerbed[i] == 0 && flowerbed[i + 1] == 0) {
//                flowerbed[i] = 1;
//                canPlant++;
//            }
//        }
//
//        if (flowerbed[len - 1] == 0 && flowerbed[len - 2] == 0) {
//            flowerbed[len - 1] = 1;
//            canPlant++;
//        }
//
//        return canPlant >= n;
//    }
//
//    public static void main(String[] args) {
//        Solution solution = new Solution();
//
//        int[] flowerbed1 = {1, 0, 0, 0, 1};
//        int n1 = 1;
//        System.out.println(solution.canPlaceFlowers(flowerbed1, n1));
//
//        int[] flowerbed2 = {1, 0, 0, 0, 1};
//        int n2 = 2;
//        System.out.println(solution.canPlaceFlowers(flowerbed2, n2));
//
//        int[] flowerbed3 = {0};
//        int n3 = 1;
//        System.out.println(solution.canPlaceFlowers(flowerbed3, n3));
//    }
//}

public class FlowerbedPlacement {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int length = flowerbed.length;

        for (int i = 0; i < length; i++) {
            // Check if the current plot is empty and both adjacent plots are empty or out of bounds
            if (flowerbed[i] == 0 &&
                    (i == 0 || flowerbed[i - 1] == 0) &&
                    (i == length - 1 || flowerbed[i + 1] == 0)) {

                // Place a flower here
                flowerbed[i] = 1;
                n--; // Reduce the number of flowers left to place

                // Check if all required flowers have been planted
                if (n <= 0) {
                    return true;
                }
            }
        }

        // If not enough space for all flowers, return false
        return n <= 0;
    }

    public static void main(String[] args) {
        FlowerbedPlacement solution = new FlowerbedPlacement();

        int[] flowerbed1 = {1, 0, 0, 0, 1};
        int n1 = 1;
        System.out.println(solution.canPlaceFlowers(flowerbed1, n1)); // Output: true

        int[] flowerbed2 = {1, 0, 0, 0, 1};
        int n2 = 2;
        System.out.println(solution.canPlaceFlowers(flowerbed2, n2)); // Output: false
    }
}
