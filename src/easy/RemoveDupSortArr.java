package easy;

public class RemoveDupSortArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] test1 = new int[] {1,1,2,3};
		int ret = removeDuplicates(test1);
		System.out.println(ret);
	}
	
	public static int removeDuplicates(int[] nums) {
        int distinctCnt = 1;
        int lastDistinctPos = 0;
		for(int i = 1; i < nums.length; i++) {
			if(nums[lastDistinctPos] != nums[i]) {
				//"move" the new distinct number next to the last distinct number "overriding" any duplicates in between
				nums[distinctCnt++] = nums[i];
				lastDistinctPos = i;
			}
		}
		return distinctCnt;
    }

}
