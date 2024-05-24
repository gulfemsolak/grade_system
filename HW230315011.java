 public class HW230315011 {
 

public static void main(String[] args) {
    /* Defining the methods for returning in the main method */
        int[][] scoreArray = initiateScoreArray();
        printScoreArray(scoreArray);
        calculateAverages(scoreArray);

        double[] overallGrades = calculateOverallGrade(scoreArray);/* Working with scoreArray like a matching for source */
        System.out.println("\nOverall Grades:");
        printGrades(overallGrades);

        char[] letterGrades = calculateLetterGrade(overallGrades);
        System.out.println("\nLetter Grades:");
        printLetterGrades(letterGrades);
    }
    /* This code provides to give random grades(midterm,quiz,final)for 20 students */
    public static int[][] initiateScoreArray() {
        int[][] scoreArray = new int[20][3];
        for (int i = 0; i < 20; i++) {
          for (int j = 0; j < 3; j++) {
            scoreArray[i][j] = (int) (Math.random() * 101);
          }
        }
        return scoreArray;
      }
    /* Prints student grades like a table */
      public static void printScoreArray(int[][] scoreArray) {
        System.out.println("Student" + "*** " + "Quiz" +"\t"+ "Midterm" + "\t" + "Final");
        for (int i = 0; i < 20; i++) {
          System.out.print("Student " + (i + 1) + " = ");
          for (int j = 0; j < 3; j++) {
            System.out.print(scoreArray[i][j] + "\t");
          }
          System.out.println();
        }
    
    }
    /* This code provides to calculate students'grades averages */
    static double[] calculateAverages(int[][] scoreArray) {
        double[] averages = new double[3];

        for (int j = 0; j < 3; j++) {
            double sum = 0;
            for (int i = 0; i < scoreArray.length; i++) {
                sum += scoreArray[i][j];
            }
            averages[j] = sum / scoreArray.length;
        }
        return averages;
    }
/* This code provides to calculate overall grades with given rates */
    static double[] calculateOverallGrade(int[][] scoreArray) {
        double[] overallGrades = new double[scoreArray.length];

        for (int i = 0; i < scoreArray.length; i++) {
            overallGrades[i] = scoreArray[i][0] * 0.2 +
                    scoreArray[i][1] * 0.3 +
                    scoreArray[i][2] * 0.5;
        }
        return overallGrades;
    }
/* This code provides to give letter grades by working with the logic of meeting the conditions */
    static char[] calculateLetterGrade(double[] overallGrades) {
        char[] letterGrades = new char[overallGrades.length];

        for (int i = 0; i < overallGrades.length; i++) {
            if (overallGrades[i] >= 85) {
                letterGrades[i] = 'A';
            } else if (overallGrades[i] >= 65) {
                letterGrades[i] = 'B';
            } else if (overallGrades[i] >= 50) {
                letterGrades[i] = 'C';
            } else {
                letterGrades[i] = 'F';
            }
        }
        return letterGrades;
    }
/* Method using for printing grades */
    static void printGrades(double[] grades) {
        for (int i = 0; i < grades.length; i++) {
            System.out.printf("Student %d: %.2f\n", i + 1, grades[i]);
        }
    }
/* Method using for printing letter grades */
    static void printLetterGrades(char[] letterGrades) {
        for (int i = 0; i < letterGrades.length; i++) {
            System.out.printf("Student %d: %c\n", i + 1, letterGrades[i]);
        }
    }
 }