/**
 * Definition for a Node.
 * struct Node {
 *     int val;
 *     int numChildren;
 *     struct Node** children;
 * };
 */

/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
#define TreeNode Node

int* travalBranch(int *rtn, int **ppReturnSize,struct TreeNode* subNode);
int* preorderTraversal_inner(struct TreeNode* root, int* returnSize);

int *extend(int *dst, int *pDestSize,
            int *src, int srcSize)
{
    int dstSize=*pDestSize;
    int new_len=dstSize+srcSize;
    int *new_buff=(int *)malloc(sizeof(int)*new_len);
    int d=0;
    int s=0;
    if (dst!=NULL){
        for(;d<dstSize;d+=1){
            new_buff[d]=dst[d];
        }
    }
    s=0;
    if (src!=NULL){
        for(;s<srcSize;s+=1){
            new_buff[dstSize+s]=src[s];
        }
    }
    *pDestSize=new_len;
    return new_buff;
}
int* travalBranch(int *rtn, int **ppReturnSize,struct TreeNode* subNode)
{
    int sub_size=0;
    int *sub=preorderTraversal_inner(subNode, &sub_size);
    int *oldrtn=rtn;
    int *pReturnSize=*ppReturnSize;
    rtn=extend(rtn, pReturnSize,sub,sub_size);
    if (oldrtn!=rtn){
        free(oldrtn);
    }
    free(sub);
    return rtn;
}

int* preorderTraversal_inner(struct TreeNode* root, int* returnSize){

    if(root == NULL){
        return NULL;
    }
    
    /*process current*/
    int *rtn=(int *)malloc(1*sizeof(int));
    rtn[0]=root->val;
    *returnSize+=1;
    
    if(root->numChildren == 0){
        return rtn;
    }
    
    /*drill down*/
/**
 * Definition for a Node.
 * struct Node {
 *     int val;
 *     int numChildren;
 *     struct Node** children;
 * };
 */
    int c=0;
    for(;c<root->numChildren;c+=1){
        rtn=travalBranch(rtn,&returnSize,root->children[c]);
    }    

    return rtn;
}


int* preorder(struct Node* root, int* returnSize) {
    printf("*returnSize:%ld", *returnSize);
    memset(returnSize,0,sizeof(int));
    return preorderTraversal_inner(root,returnSize);
}
