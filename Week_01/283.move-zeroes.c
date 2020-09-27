/* X 1 copy new arr
 * 2 i j O(n2) 
 * 3 swap(num[i],last)
 */
#define swap(type,a,b) type tmp=*(a);*(a)=*(b);*(b)=tmp

void moveZeroes(int* nums, int numsSize){
    int i=0;
    int z=0;
    for(i=0;i<numsSize;i+=1){
        if(nums[i]!=0){
            swap(int,nums+z,nums+i);
            z+=1;
        }
    }
}
