public class App {
    public static void main(String[] args) throws Exception { 
        int[] numeros = {10, 0, -5, 5, 15, 2, };


        ///CREA LA CLASE == INSTANCIAR LA CLASE CON VALOR
        /// SortBubble y = new SortBubble();
        SortBubble claseSortBubble = new SortBubble();
        //claseSortBubble.printArray(numeros); //IMPRIME
        //claseSortBubble.sortBubble(numeros); //ORDENA
        //System.out.println("Ordenado");
        //claseSortBubble.printArray(numeros); //IMPRIME

        SortBubble claseSortBubbleAvz = new SortBubble();
        claseSortBubbleAvz.printArray(numeros); //IMPRIME
        claseSortBubbleAvz.sortBubbleAvz(numeros); //ORDENA
        System.out.println("Ordenado");
    }     
}
