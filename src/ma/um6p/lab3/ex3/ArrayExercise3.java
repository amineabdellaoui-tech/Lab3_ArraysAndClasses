package ma.um6p.lab3.ex3;

public class ArrayExercise3 {
    public static void main(String[] args){
        //create a 2D array with 5 rows
        int[][] tab= new int[5][];
        int count=1; //counter

        for(int i=0;i<tab.length;i++){
            tab[i]=new int[i+1]; //allocate the size for each row so it forms a triangle
            for(int j=0;j<tab[i].length;j++){
                //fill the cell and move to the next number
                tab[i][j]=count;
                count++;
            }
        }

        //printing
        for(int i=0;i<tab.length;i++){
            for(int j=0;j<tab[i].length;j++){
                System.out.print(tab[i][j]+" ");
            }
            System.out.print("\n");
        }
    }
}
