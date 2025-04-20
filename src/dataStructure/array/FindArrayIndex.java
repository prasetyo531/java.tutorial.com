package dataStructure.array;

public class FindArrayIndex {

    public int findElement(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i; // Return the index of the target
            }
        }
        return -1; // Return -1 if the target is not found
    }

    public static void main(String[] args) {
        FindArrayIndex solution = new FindArrayIndex();
        int[] arr = {20, 35, -15, 7, 55, 1, -22};
        int target = 7; // Change this to the number you want to find

        int index = solution.findElement(arr, target);
        if (index != -1) {
            System.out.println("Element " + target + " found at index " + index + ".");
        } else {
            System.out.println("Element " + target + " not found in the array.");
        }
    }
}
