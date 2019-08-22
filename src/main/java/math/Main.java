package math;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Grades grades = new Grades();
        grades.getUserInput();
        grades.getGrades();
        System.out.println("Calculate sum: " + String.format("%.2f",grades.calculateSum()));
        System.out.println("Avarage: " + String.format("%.2f", grades.calculateAverage()));
        System.out.println("Lowest: " + grades.getLowest());
        System.out.println("Highest: " + grades.getHighest());
    }
}
