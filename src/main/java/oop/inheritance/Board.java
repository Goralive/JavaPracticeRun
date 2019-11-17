package oop.inheritance;


import java.util.ArrayList;

import java.util.List;


public class Board {

    private List<Shape> board = new ArrayList<>(4);
    private double overallArea;

    public void addFigureToBoard(Shape shapeOfFigure) {
        if (board.size() < 4) {
            board.add(shapeOfFigure);
            overallArea += shapeOfFigure.getArea();
            System.out.println("On the board there is: " + board.size() + " figures\nFeel free to add another one");
        } else {
            System.out.println("On the board there is: " + board.size() + " figures\nYou can't add another one");
        }
    }

    public void deleteFigureFromBoard(int numberOfDeleteFigure) {
        if (0 < board.size() && board.size() < 4) {
            overallArea -= board.get(numberOfDeleteFigure).getArea();
            System.out.println("Was deleted " + board.remove(numberOfDeleteFigure).getName());

        }
    }

    public void printInformationFigureOnTheBoard() {
        System.out.println("On the board you can see: ");
        if (board.size() == 0) {
            System.out.println("Nothing?");
        }
        for (Shape temp : board) {
            System.out.println("- " + temp.getName());
        }
    }

    public void overalSqueareOfTheFiguresOnTheBoard() {
        System.out.println("Overall area of the figures that are present on the board is: " + overallArea);
    }
}
