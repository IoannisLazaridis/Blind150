class Solution {
    public int search(int[] nums, int target) {
    
        // Declare start index of the array
        int start = 0;
        
        // Find the max index of the array
        int end = nums.length -1;
        
        // Initialize the mid as 0;
        int mid = 0;
        
        // Keep looping while start <= end
        while(start <= end){
        
            // Finding mid index of the specific loop
            mid = (start + end) / 2;
            
            // Check if mid index of nums equals with target
            if (nums[mid] == target){
            
                // Then return the index of nums array
                return mid;
            
            // Else check if mid index of nums is smaller than the target
            } else if (nums[mid] < target){
            
                // Then assign to start the current mid index + to start searching to the RIGHT of the array
                start = mid + 1;
            
            // Else check if mid index of nums is larger than the target
            } else if (nums[mid] > target){
            
                // Then assign to start the current mid index + to start searching to the LEFT of the array
                end = mid - 1;
            }
        }
        
        // If loop finish without a result then return -1;
        return -1;
    }
}
