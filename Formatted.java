public class Formatted {
    public static String formatGrade(String name, double score) {
        String grade;

        
        if(score >= 90) grade = "A";
        else if(score >= 80) grade = "B";
        else if(score >= 70) grade = "C";
        else if(score >= 60) grade = "D";
        else grade = "F";


        return String.format("%s scored %.2f%% and received grade %s", name, score, grade);
    }

    public static void main(String[] args) {
        
        String gradeReport = formatGrade("Kumar", 69.089745);
        System.out.println(gradeReport);  
    }
}

// %.1f%%?
// % means -t tells the formatting function that a variable will be inserted at this position in the string.
// .1 means-- how many number will after .
// f means --variable being formatted is a floating-point number .
// %%-- is to show percentageS