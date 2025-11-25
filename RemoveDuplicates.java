public class RemoveDuplicates {
    public static int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int writeIdx = 0;
        for (int readIdx = 1; readIdx < nums.length; readIdx++) {
            if (nums[readIdx] != nums[writeIdx]) {
                writeIdx++;
                nums[writeIdx] = nums[readIdx];
            }
        }
        return writeIdx + 1;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 2, 2, 3, 4, 4};
        int newLen = removeDuplicates(nums);
        System.out.println("New length: " + newLen);

        System.out.print("Array after remove duplicates: ");
        for (int i = 0; i < newLen; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }
}