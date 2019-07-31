package oop.inheritance;

import java.util.Scanner;

 public class UserInput {
     Board board = new Board();
     Shape triangle = new Triangle();
     Shape square = new Square();
     Shape circle = new Circle();
     Shape diamond = new Diamond();
     Scanner sc = new Scanner(System.in);

     public void menuOfTheShape () {

     }



     public void addFigureOnBoard() {
         System.out.println("You can add a figure on board: \n1 - Circle\n2 - Diamond\n3 - Square\n4 - Triangle\nPlease choose a figure");
         switch (sc.nextLine()) {
             case "1":
             case "Circle":
                 board.addFigureToBoard(circle);
                 break;
         }
     }
 }
