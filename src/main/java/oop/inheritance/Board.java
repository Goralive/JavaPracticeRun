package oop.inheritance;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Board {

    private List<Shape> board = new ArrayList<Shape>(4);


    public void addFigureToBoard (Shape shapeOfFigure) {
        board.add(shapeOfFigure);
    }

    public void deleteFigureFromBoard (int numberOfDeleteFigure) {
        board.remove(numberOfDeleteFigure);
    }

    public void printInformationFigureOnTheBoard () {
        System.out.println("On the board you can see: ");
        for (Shape shape : board) {
            //shape.
        }
    }

    public void overalSqueareOfTheFiguresOnTheBoard () {

    }
}
