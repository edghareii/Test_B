package demo;

public class Metodos_Ordena implements Ordenacion  {

	
	public int[] bubbleSort (int[] list) {
		int i, j, temp = 0;
		for (i = 0; i < list.length - 1; i++) {
			for (j = 0; j < list.length - 1 - i; j++) {
				if (list[j] > list[j + 1]) {
					temp = list[j];
					list[j] = list[j + 1];
					list[j + 1] = temp;
				}
			}
		}
		return list;
	}
	
	 public  int[] InsertionSort(int[] list){
         
	        int temp;
	        for (int i = 1; i < list.length; i++) {
	            for(int j = i ; j > 0 ; j--){
	                if(list[j] < list[j-1]){
	                    temp = list[j];
	                    list[j] = list[j-1];
	                    list[j-1] = temp;
	                }
	            }
	        }
	        return list;
	    }
	 
	 public int[] shellSort(int[] list){
	        int h = 1;
	        while (h < list.length) h = 3*h + 1;
	        while (h > 0){
	            h = h/3;
	            for (int k = 0; k < h; k++){
	                for (int i = h+k; i < list.length; i+=h){
	                    int key = list[i];
	                    int j = i-h;
	                    while (j>=0 && list[j] > key){
	                        list[j+h] = list[j];
	                        j-=h;
	                    }
	                    list[j+h] = key;
	                    
	                }
	            }
	            
	        }
	        return list;
	    }
	
	
}
