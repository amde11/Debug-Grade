import java.util.Scanner;

public class Ifdebug {
    public static void main (String[] args)
    {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter the Grade");
        int testscore = input.nextInt();
        char grade;

        if (testscore >= 90)
        {
            grade = 'A';
        }
        if (testscore >= 80)
        {
        grade = 'B';
        }
        if (testscore >= 70)
        {
        grade = 'C';
        }
        if (testscore >= 60)
    {
        grade = 'D';
    } else {
        grade = 'F';
    }
        System.out.println("Grade = " + grade);
    }
}
