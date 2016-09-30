package demo;

class Test {
	
	public static void main(String[] args) {
		// Declarar un arreglo de tipo int con 20 numeros desordenados;
		
		// Declarar un objeto de tipo Ordenacion
		
		// Hacer la llamada al metodo de impresion

		int[ ] array = {45,23,11,9,2,3,6,5,43,60,21,31,19,8,0,-1,-4,-15,80,100};
		Ordenacion a =new Metodos_Ordena();
		a.bubbleSort(array);
		System.out.println("Bubble Sort :"+Arrays.toString(array));

		
	}

	
}