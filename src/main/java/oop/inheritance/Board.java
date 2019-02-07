package oop.inheritance;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Board {

    private ArrayList board = new ArrayList<Shape>(4);


    public void addFigureToBoard (Shape shapeOfFigure) {
        if(!board.isEmpty()){
            board.add(shapeOfFigure);
        }
    }

    public void deleteFigureFromBoard (int numberOfDeleteFigure) {

    }

    public void printInformationFigureOnTheBoard () {
        System.out.println("On the board you can see: ");
        for (int i = 0; i < board.size() ; i++) {
            System.out.println(board.get(i));
        }
    }

    public void overalSqueareOfTheFiguresOnTheBoard () {

    }
}
