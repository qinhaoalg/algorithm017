
void shiftLeft(int *nums, int numsSize, int pos)
{
    int i=pos;
    for(;i+1<(numsSize);i+=1){
        nums[i]=nums[i+1];
    }
    return;
}

int removeDuplicates(int* nums, int numsSize)
{
    int i=0;
    for (i=0; i<numsSize; i+=1) {
        int j=i+1;
        for (; j<numsSize; j+=1) {
            if (nums[i]==nums[j]) {
                shiftLeft(nums,numsSize,j);
                numsSize-=1;
                j=j-1;
            }
        }
    }
    return numsSize;
}
