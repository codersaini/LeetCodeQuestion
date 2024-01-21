import java.util.Arrays;
class Solution 
{
    public void reverse(int nums[])
    {
        int start =0;
        int end=nums.length-1;
        for(int i=nums.length-1;i>=start;i--)
        {
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
       
    }
    public void nextPermutation(int nums[]) 
    {
        int n=nums.length;
        int ind=-1;
        //for finding out the break point in array
        for(int i=n-2;i>=0;i--)
        {
            if(nums[i]<nums[i+1])
            {
                ind=i;
                break;
            }
        }
        //if there the ind is still -1 so it mean it is a last case so we have to give the first permutlation
        if(ind==-1)
        {
            reverse(nums);
            return;
        }
        //for finding the smallest largest in remaning array(mean array which is after the breaking point)
        for(int i=n-1;i>ind;i--)
        {
            if(nums[i]>nums[ind])
            {
                int temp=nums[i];
                nums[i]=nums[ind];
                nums[ind]=temp;
                break;
            }
        }
        //Now we have to just sort the remaining array after the index value
        Arrays.sort(nums, ind+1, n);
       
    }
}