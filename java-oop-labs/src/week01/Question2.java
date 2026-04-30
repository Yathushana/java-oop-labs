package week01;
/*
 * Q2: Add corresponding elements of arrays A and B
 * and store the result in array C
 */
public class Question2 {
    public static void main(String []args){

        int [] A ={10,20,30,40,50};
        int [] B ={34,67,12,89,12};
        int [] C = new int[5];

        System.out.print(" Array C:[");
        for(int i = 0; i <5; i++) {
            C[i] = A[i] + B[i];
            System.out.print(+C[i]);
            if (i != 4) {
                System.out.print(",");
            }
        }
        System.out.println("]");
    }
}
