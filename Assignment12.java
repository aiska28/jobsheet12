import java.util.Scanner;

public class Assignment12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] [] surveyResults = new int[10][6];
        double surveyAverange = 0;
        double averangeOfQuestion = 0;
        
        System.out.println("-----Display the survey results-----");

        // for (int i = 0; i < 10; i++) {
        //     for (int j = 0; j < 6; j++) {
        //         System.out.print("Num Respontdent " + (i + 1) + " Answer options (1-5) " + j +": ");
        //         surveyResults [i] [j] = sc.nextInt();
        //     }
        //     System.out.println();
        // } 

         System.out.println("-----Display the average score for each respondent -----");

        // for (int i = 0; i < 10; i++) {
        //     for (int j = 0; j < 6; j++) {
        //         System.out.print("Num Respondent " + (i + 1) +" Answer Options (1-5)" + j + ": ");
        //         surveyResults [i][j] = sc.nextInt();
        //         surveyAverange += surveyResults[i][j];
        //     }
        //     double average = surveyAverange / (double) surveyResults[i].length;
        //     System.out.printf("Respondens " + (i+1) +" : %.2f%n" + average); 
        //     System.out.println();
        
        // }

        System.out.println("-----Display the average value for each question-----");

        // for (int i = 0; i < 10; i++) {
        //     for (int j = 0; j < 6; j++) {
        //         System.out.print("Num respondent " + (i + 1) + " Answer Options " + j + ": ");
        //         surveyResults[i][j] = sc.nextInt();
        //     }
        //     System.out.println();
        // }

        // for (int j = 0; j < 6; j++) {
        //     for (int i = 0; i < 10; i++) {
        //         averangeOfQuestion += surveyResults[i][j];
        //     }
        // double average = averangeOfQuestion / 10.0;
        // System.out.printf("\nAverange for quesion %d: %.2f" + j +" : " + average); 
        // }

        System.out.println("-----Display the overall average value-----");

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print("Num Respondent " + (i + 1) + " Answer options (1-5) " + j + ": ");
                surveyResults[i][j] = sc.nextInt();
                surveyAverange += surveyResults[i][j];
            }
            double average = surveyAverange / 6;
            System.out.printf("Respondent " + (i + 1) + " : %.2f%n", average); 
        }

        for (int j = 0; j < 6; j++) {
            for (int i = 0; i < 10; i++) {
                averangeOfQuestion += surveyResults[i][j];
            }
            double average = averangeOfQuestion / 10.0;
            System.out.printf("\nAverange for quesion %d: %.2f", j , average); 
        }
        double overalAverange = averangeOfQuestion / (double) (10*6);
        System.out.println("\nOveral Everage is: " +overalAverange);
    }
}