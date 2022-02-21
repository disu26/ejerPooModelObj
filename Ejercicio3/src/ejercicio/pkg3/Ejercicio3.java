
package ejercicio.pkg3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Programa que genera aleatoriamente un array de numeros reales, y lo ordena
 * mediante el algoritmo burbuja o el quick sort.
 * 
 * @version 1.00.000 2022-02-21
 * @author Dímar Andrey Suárez Hidalgo - dimar260212@gmail.com
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        ArrayList<Double> nums = new ArrayList<>();
        Double aux;
        int option = 0;
        
        for (int i = 0; i < 10; i++) {
            nums.add(Math.random()*20);
        }
        
        System.out.println("¿Cómo desea ordenar el arreglo?");
        System.out.println("1.Algoritmo de la burbuja");
        System.out.println("2.Quick Sort");
        System.out.println("3.No ordenar");
        option = read.nextInt();
        
        if (option==1) {
            /**
             * Algoritmo de la burbuja
             */
            for (int i = 0; i < nums.size(); i++) {
                for (int j = 0; j < nums.size(); j++) {
                    /**
                     * Condicion para determinar si el primer valor es menor 
                     * que el segundo, de ser así se realiza el cambio de los valores
                     * con ayuda de la variable auxiliar;
                     */
                    try{
                        if (nums.get(j+1) < nums.get(j)) {
                        aux=nums.get(j+1);
                        nums.set(j+1, nums.get(j));
                        nums.set(j, aux);
                        }
                    }catch(Exception exc){
                        
                    }
                    
                }
            }
        }else if(option==2){
            /**
             * Se ejecuta el método quicksort.
             */
            quicksort(nums, 0, nums.size() - 1);
        }
        
        /**
         * Se imprime el array, ordenado por cualquierad de los dos métodos 
         * o no ordenado.
         */
        for (Double num : nums) {
            System.out.println(num);
        }
    }
    
    /**
     * Metodo para dividir el array.
     * @param nums
     * @param left
     * @param right
     * @return 
     */
    private static int partition(ArrayList<Double> nums, int left, int right){
        /**
         * Se elige el pivote, sería el primer valor del array.
         */
        double pivot = nums.get(left);
        
        while(true){
            /**
             * Mientras que cada elemento de la izquierda esté en orden
             * continúa avanazando el índice.
             */
            while (nums.get(left) < pivot) {
                left++;
            }
            
            /**
             * Mientras que cada elemento de la izquierda esté en orden
             * continúa avanazando el índice.
             */
            while (nums.get(right) > pivot) {
                right--;
            }
            
            /**
             * Si la izquierda es mayor o igual que la derecha significa que no
             * se necesita hacer ningún intercambio de variables, porque los 
             * elementos ya estarían en orden.
             */
            if (left >= right) {
                /**
                 * Se indica en dónde se queda para poder volver a dividir el arreglo
                 */
                return right;
            }else{
                /**
                 * Si la izquierda no superó ni alcanzó la derecha significa que
                 * se detuvieron porque encontraron un valor que no estaba en orden,
                 * así que se intercambian
                 */
                double temp = nums.get(left);
                nums.set(left, nums.get(right));
                nums.set(right, temp);
                
                /**
                 * Se avanzan los indices.
                 */
                left++;
                right--;
            }
            /**
             * Este ciclo se repite hasta que left>=right;
             */
        }
    }
    
    /**
     * Metodo de ordenamiento quicksort.
     * @param nums
     * @param left
     * @param right 
     */
    private static void quicksort(ArrayList<Double> nums, int left, int right){
        if (left < right) {
            int partitionIndex = partition(nums, left, right);
            quicksort(nums, left, partitionIndex);
            quicksort(nums, partitionIndex + 1, right);
            
        }
    }
    
}
