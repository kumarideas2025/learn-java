public class Ternary {
    public static void main(String[] args){
        int score=55;
        String grade2=(score >=90)?"A":"B";

        System.out.println("Ternary operator:" + grade2);

        String letterGrade=(score>=90)?"A":
                (score>=80)?"B":
                (score>=70)?"C":
                (score>=60)?"D":"F";


        System.out.println("letterGrade :" + letterGrade);
    }
}
