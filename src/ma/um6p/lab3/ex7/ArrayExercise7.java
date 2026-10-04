package ma.um6p.lab3.ex7;

public class ArrayExercise7 {
    public static double stdev(int[] array1){
        //We calculate the average
        int sum=0;
        for(int i=0;i<array1.length;i++){
            sum+=array1[i];
        }
        double avg = (double) sum / (array1.length);

        //nominateur
        double nominateur =0;
        for(int i=0;i<array1.length;i++){
            nominateur+=(array1[i]-avg)*(array1[i]-avg);
        }
        double val=(double)nominateur/(array1.length-1);

        double finalValue=Math.sqrt(val);

        return finalValue;

    }

    public static void main(String[] args){
        //testing
        int[] array1 = {1, -2, 4, -4, 9, -6, 16, -8, 25, -10};

        System.out.println("the stdev is : "+stdev(array1));
    }
}
