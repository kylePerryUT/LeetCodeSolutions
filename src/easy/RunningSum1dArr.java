package easy;

public class RunningSum1dArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = new int[] {1,2,3};
		int[] answer = RunningSum(nums);
		for(int i = 0; i < answer.length; i++) {
			System.out.println(answer[i]);
		}
	}
	
    public static int[] RunningSum(int[] nums) {
        int prev = 0;
        for(int i = 1; i < nums.length; i++){
            prev = nums[i-1];
            nums[i] += prev;
        }
        return nums;
    }

}
