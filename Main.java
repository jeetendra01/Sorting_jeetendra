import java.util.Scanner;
public class Main {

	public static void main(String args[]) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner (System.in);
        System.out.println("Enter the size");
		int size = sc.nextInt();
		int array[] = new int [size];
		for(int i=0; i<size; i++) {
			System.out.println("Ether the "+ i + " th Element");
			array[i]=sc.nextInt();
		}		
		
		HeapSort hs = new HeapSort(array);
		int hArray[] = hs.heap();
		for(int i=0;i<hArray.length;i++) {
			System.out.println(hArray[i]);
			System.out.println("\t");
		}
		
		// MergeSort
		 MergeSort ms =new MergeSort(array,0,array.length-1);
		
		
        sc.close();
	
	}

}


		

