
 class MergeSort {
		int p;
		int r;
		int mArray[];
		MergeSort(int array[],int begin,int end){
			mArray = array;
			p = begin;
			r =end;
		}
		void mergeSort(int mArray[],int p,int r) {
			if(p<r) {
		}
	int q = (p+r)/2;
	mergeSort(mArray,p,q);
	mergeSort(mArray,q+1,r);
	merge(mArray,p,q,r);
 
 }

void merge (int mArray[],int p,int q,int r) {
	int n1 = q-p+1;
	int n2 = r-q;
	int lArray[] =new int[n1];
	int rArray[] =new int[n2];
	for(int i=0; i<n1;i++) {
		lArray[i]=mArray[p+i-1];
		
		for(int j=0; j<n2;j++) {
			rArray[i]=mArray[q+1];
			
			i=0;
			j=0;
			for(int k=p; k<r;k++) {
				if(n1>=n2) {
					
				}
				if(lArray[i]<rArray[j]) {
					mArray[k]=lArray[i];
					
				}
				else {
					mArray[k] = rArray[j];
					j++;
					

				}
			}
				
			}
			
		}
		
	}
}


