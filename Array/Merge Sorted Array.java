void merge(int* nums1, int nums1Size, int m, int* nums2, int nums2Size, int n) {
    	int i,j;
	j=0;
	
	for (i=0; i<m+n; i++){
		if (i<m){
		     nums1[i] = nums1[i];
           	printf("%d\n",nums1[i]);
		}
		else{
			nums1[i] = nums2[j];
			j++;
		}
	}
	for (i=0; i<nums1Size; i++){
        for (j=i+1; j<nums1Size; j++){
		if (nums1[i] > nums1[j]){
            int temp = nums1[i];
            nums1[i] = nums1[j];
            nums1[j] = temp;
        }
        }
	}  
}
