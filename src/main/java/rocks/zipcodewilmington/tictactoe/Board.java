package rocks.zipcodewilmington.tictactoe;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author leon on 6/22/18.
 */
public class Board {


    Character[][] matrix;

    ArrayList<String> solutionList = new ArrayList<>();


    public Board(Character[][] matrix) {
        this.matrix = matrix;
    }

    public Board() {
    }


    public Boolean isInFavorOfX() {
//        Board board = new Board();
//        boolean Xwins = false;
//        if (board.getWinner().equals("X")) {
//            Xwins = true;
//        }
//        return Xwins;
//        return null;
        if (getWinner().equals("X")){
            return true;
        } else {
            return false;
        }
    }

    public Boolean isInFavorOfO() {
//        Board board = new Board();
//        boolean Owins = false;
//        if (board.getWinner().equals("O")) {
//            Owins = true;
//        }
//        return Owins;
        if (getWinner().equals("O")){
            return true;
        } else {
            return false;
        }
    }

    public Boolean isTie() {
//        Board board = new Board();
//        boolean isTiee = false;
//        if (board.getWinner().equals("TIE")){
//            isTiee = true;
//        }
//        return isTiee;
        if (getWinner().equals("")){
            return true;
        } else {
            return false;
        }
    }

    public String getWinner() {
        Board board = new Board();


        solutionList.add(readRow1());
        solutionList.add(readRow2());
        solutionList.add(readRow3());
        solutionList.add(readColumn1());
        solutionList.add(readColumn2());
        solutionList.add(readColumn3());
        solutionList.add(readDiagonal1());
        solutionList.add(readDiagonal2());




        if (solutionList.contains("XXX")) {
            return "X";
        } else if (solutionList.contains("OOO")) {
            return "O";
        } else {
            return "";
        }

    }


//    public String readRow1() {
////        String str = "";
////        String solution;
////        for (int i = 0; i < 3; i++){
////            str = str + testBoard[0][i];
////        }
////        if (str.equals("OOO")){
////            solution = "OOO";
////        } else if (str.equals("XXX")){
////            solution = "XXX";
////        } else {
////            solution = "TIE";
////        }
//
//        return null;
//    }



//    //ANYTHING DOWN BELOW HERE IS TESTING ONLY!!!!
//    public static void main(String[] args) {
//        Board board = new Board();
//            board.getWinner();
//
//
//    }


    public String readRow1 (){
        Board board = new Board();
        String str = "";
        for (int i = 0; i < 3; i++){
            str = str + matrix[0][i];
        }
        return str;
    }
    public String readRow2 (){
        Board board = new Board();
        String str = "";
        for (int i = 0; i < 3; i++){
            str = str + matrix[1][i];
        }
        return str;
    }
    public String readRow3 (){
        Board board = new Board();
        String str = "";
        for (int i = 0; i < 3; i++){
            str = str + matrix[2][i];
        }
        return str;
    }
    public String readColumn1 (){
        Board board = new Board();
        String str = "";
        for (int i = 0; i < 3; i++){
            str = str + matrix[i][0];
        }
        return str;
    }
    public String readColumn2 (){
        Board board = new Board();
        String str = "";
        for (int i = 0; i < 3; i++){
            str = str + matrix[i][1];
        }
        return str;
    }
    public String readColumn3 (){
        Board board = new Board();
        String str = "";
        for (int i = 0; i < 3; i++){
            str = str + matrix[i][2];
        }
        return str;
    }
    public String readDiagonal1 (){
        String str = "";
        for (int i = 0; i < 3; i++){
            str = str + matrix[i][i];
        }
        return str;
    }
    public String readDiagonal2 (){
        String str = "";
        for (int i = 0; i < 3; i++){
            str = str + matrix[i][2 - i];
        }
        return str;
    }




}




//this is how we read a row. (aka row 1)
//        System.out.print(testBoard[0][0]);
//        System.out.print(testBoard[0][1]);
//        System.out.print(testBoard[0][2] + "\n");

//Now turn the above^ into a loop:
//        String str = "";
//        for (int i = 0; i < 3; i++){
//            str = str + testBoard[0][i];
//        }
//        System.out.println(str); //THIS WORKS!
//        if (str.equals("OOO")){   <<Now let's take this and put it into a inFavorOf0 method
//            return true;
//        }

//
//        //This is to read row 2.
//PUT THIS IN THE ARRAY LIST
//        System.out.print(testBoard[1][0]);
//        System.out.print(testBoard[1][1]);
//        System.out.print(testBoard[1][2] + "\n");
//
//        //This is to read row 3.
//PUT THIS IN THE ARRAY LIST
//        System.out.print(testBoard[2][0]);
//        System.out.print(testBoard[2][1]);
//        System.out.print(testBoard[2][2]);



//FOR DIAGNOL TOP LEFT TO BOTTOM RIGHT
//        String str = "";
//        for (int i = 0; i < 3; i++){
//            str = str + testBoard[i][i];
//        }
//        System.out.println(str);


//FOR DIAGNOL TOP RIGHT TO BOTTOM LEFT
//[0][2] -> [2][0]
//        String str = "";
//        for (int i = 0; i < 3; i++){
//            str = str + testBoard[i][2 - i];
//        }
//        System.out.println(str);








//THIS IS THE ANSWER !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

//read rows through it into arraylist

    /* PUT IT INSIDE GET INSIDE
    8 methods:
    -row 1 --> puts a string into list array
    -row 2
    -row 3
    -column 1
    -column 2
    -column 3
    -diagonal 1
    -diagonal 2
     */

//each of these methods puts a string into arraylist


//read columns through it into arraylist
//read diaganols throw it into arraylist

//if (arraylist === XXX) return "X" and that makes x win
//if (Arraylist === OOO) return "O" and that makes o win
//if its neither ^^ its a tie return "TIE" and that makes a tie