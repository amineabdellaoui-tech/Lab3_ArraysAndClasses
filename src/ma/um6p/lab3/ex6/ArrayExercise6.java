package ma.um6p.lab3.ex6;
import ma.um6p.lab3.ex1.ArrayExercise1;

public class ArrayExercise6 {
    public static int median(int[] array1){
        //reusing the sorting method from exercise 1 to sort the data first
        int[] newArray=ArrayExercise1.sortIntegers(array1);
        //returning the element right in the middle of the sorted array
        return newArray[(newArray.length/2)];
    }

    public static void main(String[] args){
        //testing arrays with odd lengths
        int[] array1 ={5, 2, 4, 17, 55, 4, 3, 26, 18, 2, 17};
        int[] array2={42, 37, 1, 97, 1, 2, 7, 42, 3, 25, 89, 15, 10, 29, 27};

        //printing
        System.out.println("Median de array1 = "+median(array1));
        System.out.println("Median de array2 = "+median(array2));
    }
}
