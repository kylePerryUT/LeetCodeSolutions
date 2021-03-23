package topInterviewEasy.SortingandSearching;

import java.util.Arrays;

public class MergeSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums1[] = new int[] {1,2,3,0,0,0};
		int m = 3;
		int nums2[] = new int[] {2,5,6};
		int n = 0;
		merge(nums1, m, nums2, n);

	}
	
	public static void merge(int[] nums1, int m, int[] nums2, int n) {
        //return a copy of nums1 as a NEW array
        int cpynums1[] = Arrays.copyOf(nums1, m);
        
        int mptr = 0;
        int nptr = 0;
        //Need to handle the case where m or n starts out with 0 elmts
        for(int i = 0; i < m + n; i++){
        	//Check to see if we have reached the end of the elmts in nums1 or nums2
            if(mptr == m){
                //copy the remaining ints from n
                while(nptr < n){
                    nums1[i++] = nums2[nptr++];
                }
                break;
            }
            if(nptr == n){
                //copy the remaining ints from m
                while(mptr < m){
                    nums1[i++] = cpynums1[mptr++];
                }
                break;
            }
            if(cpynums1[mptr] < nums2[nptr]){
                nums1[i] = cpynums1[mptr++];
            }
            else{
                //if the two numbers are equal we pick one arbitrarily to go first int he sorted merged arr
                nums1[i] = nums2[nptr++];
            }
        }
        
    }

}
