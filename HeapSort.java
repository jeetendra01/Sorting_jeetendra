
public class HeapSort {
 int hArray[];
 HeapSort(int array[]){
	 hArray = array;
 }
 
void maxHeapify (int i,int hArray[],int heapSize){
		 int l = 2*i+1;
		 int r = 2*l+2;
		 int largest;
		 if(l<heapSize && hArray[l]>hArray[i]) {
	largest = l;
 }
		 
		 else {
			 largest = i;
		 }
	if(r<heapSize && hArray[r]>hArray[largest]) {
			largest= r;
}
 if(largest!=i){
	 
	 int temp=hArray[largest];
	 hArray[largest]=hArray[i];
	 hArray[i]=temp;
	 maxHeapify(largest,hArray,heapSize);
}  
  }



void buildMaxHeap(int hArray[]) {
	for(int i=(hArray.length/2)-1;i>=0;i--) {
		maxHeapify(i,hArray,hArray.length);
 }
}
public int[]heap(){
	buildMaxHeap(hArray);
	for(int i=hArray.length-1;i>=1;i--) {
		int temp =hArray[i];
		hArray[i]=hArray[0];
		hArray[0]=temp;
		 maxHeapify(0,hArray,i);
		
}
return hArray;
	
}
}


 

