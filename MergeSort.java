class MergeSort {
   public static void concure(int [] arr,int left,int mid,int right){
    int merge[]=new int[right-left+1];
        int i,s1=left,s2=mid+1;
        for(i=0;s2<=right&&s1<=mid;i++){
            if(arr[s1]<arr[s2])
            merge[i]=arr[s1++];
            else merge[i]=arr[s2++];
        }
        while(s1<=mid){
            merge[i++]=arr[s1++];
        }
        while(s2<=right){
            merge[i++]=arr[s2++];
        }
        for (int j = 0; j < merge.length; j++) {
    arr[left + j] = merge[j];
}
    }
    
    
    public static void mergeSort(int [] arr,int left,int right){
        int mid=left+(right-left)/2;
        if(left>=right) return;
        mergeSort(arr,left,mid);
        mergeSort(arr,mid+1,right);
        concure(arr,left,mid,right);
    }
    public static void main(String[] args) {
        int arr[]={5,6,3,4,8,9};
        int left=0;
        int right=arr.length-1;
        System.out.print("Original Array:");
        for(int i=0;i<=right;i++)
        System.out.print(" "+arr[i]);
        System.out.print("\nSorted Array:");
        
        mergeSort(arr,left,right);
        for(int i=0;i<=right;i++)
        System.out.print(" "+arr[i]);
        
    }
}
