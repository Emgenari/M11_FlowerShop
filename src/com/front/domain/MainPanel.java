package com.front.domain;

import com.crud.controller.BusinessController;
import com.front.utilities.Inputs;

import javax.swing.*;
import java.awt.event.*;
import java.util.Scanner;


//main panel class which will control the creation of new shops

public class MainPanel extends JPanel {

    //Atribites and buttons
    private final BusinessController bC = new BusinessController();
    JButton createNewShop, closeWindows;
    static JTextField shopNameField;
    public static String desiredShopName;
    String newShopName;

    //Main panel constructor.
    public MainPanel() {
        initComponents();
    }

    private void initComponents() {
        createNewShop = new JButton("Create new shop!");
        add(createNewShop);
        closeWindows = new JButton("Close all shops");
        add(closeWindows);

        //we now set the newShop button as an event performer using que listener class from below
        NewShopListener newShopListener = new NewShopListener();
        createNewShop.addActionListener(newShopListener);
       // -------------------------------------------------

        shopNameField = new JTextField(25);
        add(shopNameField);
        shopNameField.setText("Insert shop's name");

        //we now set methods to manage the "insert shop's name" text
        //1. here we erease the text as soon as we start writing a new name
        shopNameField.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                shopNameField.setText("");
                Scanner sc = new Scanner(System.in);
                newShopName = sc.nextLine();

            }
        });




        /*

        shopNameField.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Scanner sc = new Scanner(System.in);
                newShopName = sc.nextLine();
                sc.close();
            }

        });
        /*
        //we now set the shopNameField as an event listener to be able introduce the new shop's name
        InsertName giveNameListener = new InsertName();
        createNewShop.addActionListener(giveNameListener);

        desiredShopName = shopNameField.getText();
        //if (!desiredShopName.equals("")) {
            shopNameField.setText(desiredShopName);
        //}

         */

/*
        createNewShop.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {

                desiredShopName = shopNameField.getText();
                /*if (!desiredShopName.equals("")) {
                newShopName.setText(desiredShopName);
                }

            }
        });

 */

        //2. here we set again the original "insert name" text when clicking on create shop
        createNewShop.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {

                if (!shopNameField.equals("Insert shop's name")) {
                    shopNameField.setText("Insert shop's name");

                }
            }
        });
    }
    //private and internal Listener class implementing ActionListener,
    //which will call secondaryPanel when clicking on button.
    private class NewShopListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            /*
            if (e.getSource() == newShopName) {
                bC.createFlowerShop(Inputs.toTitleCase(newShopName.getText()));
                System.out.println("Business with name: " + newShopName.getText() + " successfully created");
            }
             */
            //this will close the secondary window

                SecondaryPanel newShopFrame = new SecondaryPanel(closeWindows, newShopName);

            }
        }
    }
    //private and internal Listener class implementing ActionListener to give name to new shops.
    /*
    private class InsertName implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            String desiredName = shopNameField.getText();
            //if (!desiredName.equals("")) {
            //newShopName.setText(desiredName);
            //}
            SecondaryPanel newShopFrame = new SecondaryPanel(closeWindows, shopNameField);
        }
    }


}
        */