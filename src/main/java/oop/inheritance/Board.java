package oop.inheritance;


import java.util.ArrayList;

import java.util.List;


public class Board {

    private List <Shape> board = new ArrayList<>(4);


    public void addFigureToBoard (Shape shapeOfFigure) {
        if  (board.size() < 4) {
            board.add(shapeOfFigure);
        } else {
            System.out.println("On the board there is: " + board.size() + " figures\n You can't add another one");
        }
    }

    public void deleteFigureFromBoard (int numberOfDeleteFigure) {
        if (0 < board.size() && board.size() < 4) {
            board.remove(numberOfDeleteFigure);
        }
    }

    public void printInformationFigureOnTheBoard () {
        System.out.println("On the board you can see: ");
        for (Shape temp : board) {
            System.out.println(temp.toString());
        }
    }

    public void overalSqueareOfTheFiguresOnTheBoard (Shape shape) {
        System.out.println(shape.getPerimeter());
    }
}
