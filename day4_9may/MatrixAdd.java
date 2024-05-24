package day4_9may;

public class MatrixAdd {

    public static void main(String args[])
    {

        //creating two matrices

        int a[][]={{2,4,9},{3,5,7},{7,5,3}};
        int b[][]={{1,3,4},{4,5,7},{8,5,2}};

        //creating another matrix to store the sum of two matrices

        int c[][]=new int[3][3];  //3 rows and 3 columns

        //adding and printing addition of 2 matrices

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){

                c[i][j]=a[i][j]+b[i][j];  //Addition

                System.out.print(c[i][j]+" ");
            }

            System.out.println();
        }
    }
}
