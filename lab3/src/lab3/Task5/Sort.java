package lab3.Task5;

import java.lang.reflect.Array;

public class Sort {
	private static <E> void swap(E [] array, int j) {
        E temp = array[j];
        array[j] = array[j+1];
        array[j+1] = temp;
	}
	
	@SuppressWarnings("unchecked")
	private static <E extends Comparable<Object>> void merge(E [] arr, int l, int m, int r) { 
        int n1 = m - l + 1; 
        int n2 = r - m; 

        E [] L = (E[]) Array.newInstance(arr[0].getClass(), n1);
        E [] R = (E[]) Array.newInstance(arr[0].getClass(), n2);
  
        for (int i = 0; i < n1; ++i) 
            L[i] = arr[l + i]; 
        for (int j = 0; j < n2; ++j) 
            R[j] = arr[m + 1 + j]; 
   
        int i = 0, j = 0, k = l;

        while (i < n1 && j < n2) { 
            if (L[i].compareTo(R[j]) <= 0) { 
                arr[k] = L[i]; 
                i++; 
            } 
            else {
                arr[k] = R[j]; 
                j++; 
            } 
            k++; 
        } 

        while (i < n1) { 
            arr[k] = L[i]; 
            i++; 
            k++; 
        } 

        while (j < n2) { 
            arr[k] = R[j]; 
            j++; 
            k++; 
        } 
    } 

	public static <E extends Comparable<Object>> void sort(E [] arr, int l, int r) {
		if (l < r) { 
            int m = (l + r) / 2; 
   
            sort(arr, l, m); 
            sort(arr, m + 1, r); 
   
            merge(arr, l, m, r); 
        } 
	}

	public static <E extends Comparable<Object>> void bubbleSort(E [] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) { 
            for (int j = 0; j < n - i - 1; j++) { 
                if (array[j].compareTo(array[j + 1]) > 0) {
                	swap(array, j);
                } 
            }
        }
	}
	
	public static <E extends Comparable<Object>> void mergeSort(E [] array) {
		sort(array, 0, array.length - 1);
	}	
}