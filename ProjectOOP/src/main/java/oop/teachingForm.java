package oop;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class teachingForm extends JFrame{
    private JPanel panPageB;
    private JPanel panBLB ;
    private JPanel panNorth;
    private JPanel panCheck1;

    private JLabel courseName;
    private JLabel lecName;
    private JLabel helpLabel;
    private JLabel subLabel;
    private JLabel Label1;
    private JLabel Label2;
    private JLabel Label3;
    private JLabel Label4;
    private JLabel Label5;
    private JLabel Label6;
    private JLabel Label7;
    private JLabel Label8;





    private JTextField toField;
    private JTextField lecField;

    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JLabel label4;
    private JLabel label5;


    private JButton send;

    //form
    public teachingForm(){
        setTitle("Evalate Teaching Application");
        //setLayout(new BorderLayout());
        panPageB = new JPanel();
        panPageB.setLayout(new GridLayout(3,2,6,6));
        panPageB.setAlignmentX(10);

        JLabel courseName = new JLabel("   Course Name: ");
        courseName.setVerticalTextPosition(SwingConstants.CENTER);
        panPageB.add(courseName);

        JTextField toField = new JTextField(20);
        panPageB.add(toField);

        JLabel lecName = new JLabel("   Lecturer Name: ");
        panPageB.add(lecName);

        JTextField lecField = new JTextField();
        panPageB.add(lecField);

        JLabel helpLabel = new JLabel("   Rate aspect of the training on 5 scales");
        panPageB.add(helpLabel);
        //hien
        add(panPageB, BorderLayout.BEFORE_FIRST_LINE);
        ///////////////////

        panBLB = new JPanel();
        panBLB.setLayout(new GridLayout(1,1,2,2));

        JLabel subLabel = new JLabel("   1. Strongly disagree   2. Disagree   3.Neither agree or disagree   4. Agree   5. Strongly Agree   ");
        panBLB.add(subLabel);
        add(panBLB,BorderLayout.BEFORE_LINE_BEGINS);

        /////////////////////////////////

        panNorth = new JPanel();
        panNorth.setLayout(new GridLayout(1,4,1,1));



        JLabel Label1 = new JLabel("   The objective of this course were clear to you ");
        panNorth.add(Label1);

        JPanel panCheck1 = new JPanel();
        panCheck1.setLayout(new CardLayout());

        JLabel label1= new JLabel("1");
        panCheck1.add(label1);
        JLabel label2 = new JLabel("2");
        panCheck1.add(label2);
        JLabel label3 = new JLabel("3");
        panCheck1.add(label3);
        JLabel label4 = new JLabel("4");
        panCheck1.add(label4);
        JLabel label5 = new JLabel("5");
        panCheck1.add(label5);

        add(panCheck1,BorderLayout.LINE_START);


        add(panNorth,BorderLayout.NORTH);
/*
        JCheckBox label1= new JCheckBox();
        panNorth.add(label1);
        JCheckBox label2 = new JCheckBox();
        panNorth.add(label2);
        JCheckBox label3 = new JCheckBox();
        panNorth.add(label3);
        JCheckBox label4 = new JCheckBox();
        panNorth.add(label4);
        JCheckBox label5 = new JCheckBox();
        panNorth.add(label5);

        add(panNorth,BorderLayout.NORTH);

/*
        JLabel Label2 = new JLabel("   The organization of the lesson were logical and easy to follow ");
        panSouth.add(Label2);


        JLabel Label3 = new JLabel("   The content of lecture met your expectations ");
        panSouth.add(Label3);


        JLabel Label4 = new JLabel("   The exercises/assignments/labworks were useful ");
        panSouth.add(Label4);


        JLabel Label5 = new JLabel("   The lecturer explained things clearly ");
        panSouth.add(Label5);


        JLabel Label6 = new JLabel("   The lecturer answered student's questions clearly during classes ");
        panSouth.add(Label6);


        JLabel Label7 = new JLabel("   The lecturer encouraged students participation during classes ");
        panSouth.add(Label7);


        JLabel Label8 = new JLabel("   This class gave you opportunities to improve your teamworks skills ");
        panSouth.add(Label8);

        add(panSouth,BorderLayout.SOUTH);



*/










    }

}


