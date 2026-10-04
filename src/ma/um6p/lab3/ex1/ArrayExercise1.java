package ma.um6p.lab3.ex1;

public class ArrayExercise1 {
    public static void printArray(int[] integerArray){
        if (integerArray==null || integerArray.length==0){  // Check if the array is null or empty
            System.out.println("The array is empty or not available !");
            return;
        }
        for(int i=0;i<integerArray.length;i++){
            System.out.println("Element "+i+" contents "+integerArray[i]);
        }

    }

    public static int[] sortIntegers(int[] integerArray){
        if (integerArray==null || integerArray.length==0){ //check
            System.out.println("The array is empty or not available !");
            return new int[0];
        }

        //copy the array manually so we don't modify the original one
        int[] copyArray = new int[integerArray.length];
        for(int i=0;i<integerArray.length;i++){
            copyArray[i]=integerArray[i];
        }
        //bubble sort in descending order
        for(int j=0;j<copyArray.length-1;j++){
            for(int h=0;h<copyArray.length-j-1;h++){
                if(copyArray[h]<copyArray[h+1]){
                    int temp=copyArray[h+1];
                    copyArray[h+1]=copyArray[h];
                    copyArray[h]=temp;
                }
            }
        }
        return copyArray;
    }

    public static void main(String[] args){ //test
        int[] originalArray = {106,26,81,5,15};

        System.out.println("Original array : ");
        printArray(originalArray);

        int[] sortedArray=sortIntegers(originalArray);

        System.out.println("\nSorted array(Desc)");
        printArray(sortedArray);
    }
}
