package math;

import java.util.Scanner;

public class Grades {


    Scanner sc = new Scanner(System.in);
    int[] grades;


    public void getGrades() {
        for (int i = 0; i < grades.length; i++) {
            System.out.println("Enter grade #" + (i + 1));
            grades[i] = sc.nextInt();
        }
    }

    public void getUserInput() {
        System.out.println("How many grades would you like to enter?");
        grades = new int[sc.nextInt()];
    }

    public double calculateSum() {
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return sum;
    }

    public double calculateAverage() {
        return calculateSum() / grades.length;
    }

    public int getHighest() {
        int highest = grades[0];
        for(int grade: grades) {
            if(grade > highest){
                highest = grade;
            }
        }
        return highest;
    }
    public int getLowest() {
        int lowest = grades[0];
        for (int grade: grades) {
            if(grade < lowest) {
                lowest = grade;
            }
        }
        return lowest;
    }
}
