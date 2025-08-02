public class arrays {
    public static void main(String args[]) {
        int marks[] = {1, 2, 3, 4};
        marks[3]=9;
        for (int i = 0; i <= 3; i++){
            System.out.println(marks[i]);
        }
//        for each loop

        System.out.println("this is for each loops");
        for(int value:marks){
            System.out.println(value);
        }
        int matrix[][]={{3,4,5,6},{22,33,44,55}};
        System.out.println(matrix[0][3]);
    }
}