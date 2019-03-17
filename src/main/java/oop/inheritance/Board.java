package oop.inheritance;


import java.util.ArrayList;

import java.util.List;


public class Board {

    private List <Shape> board = new ArrayList<>(4);


    public void addFigureToBoard (Shape shapeOfFigure) {
        if(board.size() < 4){
            board.add(shapeOfFigure);
        }
    }

    public void deleteFigureFromBoard (int numberOfDeleteFigure) {

    }

    public void printInformationFigureOnTheBoard () {
        System.out.println("On the board you can see: ");
        for (Shape temp : board) {
            System.out.println(temp.toString());
        }
    }

    public void overalSqueareOfTheFiguresOnTheBoard () {

    }
}
