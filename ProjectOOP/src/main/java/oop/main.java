package oop;
import java.io.PrintWriter;
import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.*;
import java.util.Scanner;


public class main {
    public static void main(String[] args) {
        teachingForm win = new teachingForm();
        win.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        win.pack();
        win.setVisible(true);


        Scanner scan = new Scanner(System.in);
        PrintWriter printWriter = null;
        Scanner fileReader = null;
//output
        try {
            printWriter = new PrintWriter("participants.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        // input
        try {
            fileReader = new Scanner(new File("participants.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

}
