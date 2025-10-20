public class SortBubble {
    
    // CONSTRUCTOR
    public SortBubble(){
        System.out.println("Se creo mi clase SortBubble");
    }

    public void sortBubble(int[] numeros) {
        int numeroSize = numeros.length;
        int preguntaCondicion = 0;
        int numeroCambios = 0;
        for (int i = 0; i < numeroSize; i++) {
            for (int j = i+1; j < numeroSize; j++) {
                preguntaCondicion++;
                //System.out.println("Pregunto " + preguntaCondicion);
                if (numeros[i] > numeros[j]) { //si se cumple cambio
                    int temp = numeros[j];
                    numeros[j] = numeros[i];
                    numeros[i] = temp;
                    numeroCambios ++;
                    
                }
            }
        }
        System.out.println("Preguntas: " + preguntaCondicion);
        System.out.println("Cambios: " + numeroCambios);
    }

    public void printArray(int[] numeros) {
        System.out.print("[");
        for (int i = 0; i < numeros.length; i++) {
            if (i == numeros.length - 1) {
                System.out.print(numeros[i]);
            } else {
                System.out.print(numeros[i] + ", ");
            }
        }
        System.out.println("]");
    }

}
