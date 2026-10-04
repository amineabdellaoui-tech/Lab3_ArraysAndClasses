package ma.um6p.lab3.ex2;

public class ArrayExercise2 {
    public static void reverse(int[] array1){
        if (array1==null || array1.length==0){ //Check if the array is valid
            System.out.println("The array is empty or not available !");
            return;
        }

        //Print the original array
        System.out.print("Array = [");
        for (int i=0; i<array1.length;i++) {
            System.out.print(array1[i]);
            if (i<array1.length-1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        //Reverse the array in-place by swapping
        for(int i=0;i<(array1.length/2);i++){
            int temp = array1[i];
            array1[i]=array1[array1.length-i-1];
            array1[array1.length-i-1]=temp;
        }

        //print the array after the reverse
        System.out.print("Reversed array = [");
        for (int i=0;i<array1.length;i++) {
            System.out.print(array1[i]);
            if (i<array1.length-1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

    }

    public static void main(String[] args){ //test
        int[] numbers={1,2,3,4,5};
        reverse(numbers);
    }
}
