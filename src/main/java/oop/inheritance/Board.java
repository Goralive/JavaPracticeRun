package oop.inheritance;


import java.util.ArrayList;

import java.util.List;


public class Board {

    private List<Shape> board = new ArrayList<>(4);
    private double overallArea;
    private int index = 0;

    public void addFigureToBoard(Shape shapeOfFigure) {
        if (board.size() < 4) {
            board.add(shapeOfFigure);
            overallArea += shapeOfFigure.getArea();
            System.out.println("On the board there is: " + board.size() + " figures\nFeel free to add another one");
        } else {
            System.out.println("On the board there is: " + board.size() + " figures\nYou can't add another one");
        }
    }

    public void deleteFigureFromBoard() {
            if (index < board.size()) {
                Shape tempFigure = board.get(index);
                overallArea -= tempFigure.getArea();
                System.out.println("Was deleted " + tempFigure.getName());
                board.remove(tempFigure);

            } else {
                System.out.println("No figure was deleted");
            }
        }


    public void printInformationFigureOnTheBoard() {
        System.out.println("On the board you can see: ");
        if (board.size() == index) {
            System.out.println("Nothing?");
        }
        for (Shape temp : board) {
            System.out.println("- " + temp.getName());
        }
    }

    public void overallSqueareOfTheFiguresOnTheBoard() {
        System.out.println("Overall area of the figures that are present on the board is: " + overallArea);
    }
}
