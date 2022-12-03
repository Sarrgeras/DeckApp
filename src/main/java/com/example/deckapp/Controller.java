package com.example.deckapp;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import util.RandomGenerating;
import util.SpecialDeque;

import java.util.ArrayList;

public class Controller {

    @FXML
    private Label addLabel;

    @FXML
    private Button addToFirstDeque;

    @FXML
    private Button addToLastDeque;

    @FXML
    private Label label1;

    @FXML
    private Label label10;

    @FXML
    private Label label101;

    @FXML
    private Label label11;

    @FXML
    private Label label2;

    @FXML
    private Label label21;

    @FXML
    private Label label3;

    @FXML
    private Label label31;

    @FXML
    private Label label4;

    @FXML
    private Label label41;

    @FXML
    private Label label5;

    @FXML
    private Label label51;

    @FXML
    private Label label6;

    @FXML
    private Label label61;

    @FXML
    private Label label7;

    @FXML
    private Label label71;

    @FXML
    private Label label8;

    @FXML
    private Label label81;

    @FXML
    private Label label9;

    @FXML
    private Label label91;

    @FXML
    private Label labelLastAddress1;

    @FXML
    private Label labelLastAddress10;

    @FXML
    private Label labelLastAddress2;

    @FXML
    private Label labelLastAddress3;

    @FXML
    private Label labelLastAddress4;

    @FXML
    private Label labelLastAddress5;

    @FXML
    private Label labelLastAddress6;

    @FXML
    private Label labelLastAddress7;

    @FXML
    private Label labelLastAddress8;

    @FXML
    private Label labelLastAddress9;

    @FXML
    private Label labelStartAddress1;

    @FXML
    private Label labelStartAddress10;

    @FXML
    private Label labelStartAddress2;

    @FXML
    private Label labelStartAddress3;

    @FXML
    private Label labelStartAddress4;

    @FXML
    private Label labelStartAddress5;

    @FXML
    private Label labelStartAddress6;

    @FXML
    private Label labelStartAddress7;

    @FXML
    private Label labelStartAddress8;

    @FXML
    private Label labelStartAddress9;

    @FXML
    private Button removeFromFirstDeque;

    @FXML
    private Button removeFromLastDeque;

    @FXML
    private Label removeLabel;

    @FXML
    private Button showingStack;

    @FXML
    void initialize(){
        SpecialDeque<String> specialDeque = new SpecialDeque<>();
        RandomGenerating randomGenerating = new RandomGenerating();
        ArrayList<Label> labels = new ArrayList<>();
        ArrayList<Label> labelsLast = new ArrayList<>();
        ArrayList<String> lastElements = new ArrayList<>();
        ArrayList<Label> labelStartAddress = new ArrayList<>();
        ArrayList<Label> labelLastAddress = new ArrayList<>();

        labelStartAddress.add(0, labelStartAddress1);
        labelStartAddress.add(1, labelStartAddress2);
        labelStartAddress.add(2, labelStartAddress3);
        labelStartAddress.add(3, labelStartAddress4);
        labelStartAddress.add(4, labelStartAddress5);
        labelStartAddress.add(5, labelStartAddress6);
        labelStartAddress.add(6, labelStartAddress7);
        labelStartAddress.add(7, labelStartAddress8);
        labelStartAddress.add(8, labelStartAddress9);
        labelStartAddress.add(9, labelStartAddress10);

        labelLastAddress.add(0, labelLastAddress10);
        labelLastAddress.add(1, labelLastAddress9);
        labelLastAddress.add(2, labelLastAddress8);
        labelLastAddress.add(3, labelLastAddress7);
        labelLastAddress.add(4, labelLastAddress6);
        labelLastAddress.add(5, labelLastAddress5);
        labelLastAddress.add(6, labelLastAddress4);
        labelLastAddress.add(7, labelLastAddress3);
        labelLastAddress.add(8, labelLastAddress2);
        labelLastAddress.add(9, labelLastAddress1);

        showingStack.setOnAction(actionEvent -> {

            for (int i = 0; i < 160; i++) {
                specialDeque.pushFirst(randomGenerating.stackGenerate());
            }

            labels.add(0, label1);
            labels.add(1, label2);
            labels.add(2, label3);
            labels.add(3, label4);
            labels.add(4, label5);
            labels.add(5, label6);
            labels.add(6, label7);
            labels.add(7, label8);
            labels.add(8, label9);
            labels.add(9, label10);

            labelsLast.add(0, label101);
            labelsLast.add(1, label91);
            labelsLast.add(2, label81);
            labelsLast.add(3, label71);
            labelsLast.add(4, label61);
            labelsLast.add(5, label51);
            labelsLast.add(6, label41);
            labelsLast.add(7, label31);
            labelsLast.add(8, label21);
            labelsLast.add(9, label11);
            int chis = 0;
            for (int i = 0; i < 10; i++) {

                labels.get(i).setText(specialDeque.getIndex(i));
            }
            for (int i = specialDeque.size() - 1, j = 0; i >= specialDeque.size() - 11 ; i--, j++) {
                lastElements.add(j, specialDeque.getIndex(i));
            }

            for (int i = 0; i < 10; i++) {
                labelsLast.get(i).setText(lastElements.get(i));
            }
            int ch = 0;
            int chLast = 0;
            for (int i = 0; i < 10; i++) {
                if (i == 0){
                    ch = i;
                    chLast = i;
                    labelStartAddress.get(i).setText("null; " + specialDeque.getIndex(ch).hashCode()
                            + "; " + specialDeque.getIndex(ch+1).hashCode()
                            + ";" );
                }
                else {
                    ch = i;
                    chLast = i;
                    labelStartAddress.get(i).setText( specialDeque.getIndex(ch-1).hashCode() + "; "
                            + specialDeque.getIndex(ch).hashCode()
                            + "; " + specialDeque.getIndex(chLast+1).hashCode()
                            + ";" );
                }
            }

            for (int i = 0; i < 10; i++) {
                if (i == 0){
                    ch = i;
                    chLast = i;
                    labelLastAddress.get(i).setText(lastElements.get(ch + 1).hashCode()
                            + "; " + lastElements.get(ch).hashCode() + "; null;");
                }
                else {
                    ch = i;
                    chLast = i;
                    if (i == 9){
                        labelLastAddress.get(i).setText(lastElements.get(ch + 1).hashCode()
                                + "; " + lastElements.get(ch).hashCode() + "; " + lastElements.get(chLast - 1) + ";");
                    }else{
                        labelLastAddress.get(i).setText(lastElements.get(ch + 1).hashCode() + "; "
                                + lastElements.get(ch).hashCode()
                                + "; " + lastElements.get(chLast - 1).hashCode()
                                + ";" );
                    }


                }
            }

        });

        addToFirstDeque.setOnAction(actionEvent -> {
            specialDeque.pushFirst(randomGenerating.stackGenerate());
            addLabel.setText(specialDeque.peekFirst());
            for (int i = 0; i < 10; i++) {
                labels.get(i).setText(specialDeque.getIndex(i));
            }
            for (int i = specialDeque.size() - 1, j = 0; i >= specialDeque.size() - 11 ; i--, j++) {
                lastElements.add(j, specialDeque.getIndex(i));
            }
            int ch = 0;
            int chLast = 0;
            for (int i = 0; i < 10; i++) {
                if (i == 0){
                    ch = i;
                    chLast = i;
                    labelStartAddress.get(i).setText("null; " + specialDeque.getIndex(ch).hashCode()
                            + "; " + specialDeque.getIndex(ch+1).hashCode()
                            + ";" );
                }
                else {
                    ch = i;
                    chLast = i;
                    labelStartAddress.get(i).setText( specialDeque.getIndex(ch-1).hashCode() + "; "
                            + specialDeque.getIndex(ch).hashCode()
                            + "; " + specialDeque.getIndex(chLast+1).hashCode()
                            + ";" );
                }
            }

            for (int i = 0; i < 10; i++) {
                if (i == 0){
                    ch = i;
                    chLast = i;
                    labelLastAddress.get(i).setText(lastElements.get(ch + 1).hashCode()
                            + "; " + lastElements.get(ch).hashCode() + "; null;");
                }
                else {
                    ch = i;
                    chLast = i;
                    if (i == 9){
                        labelLastAddress.get(i).setText(lastElements.get(ch + 1).hashCode()
                                + "; " + lastElements.get(ch).hashCode() + "; " + lastElements.get(chLast - 1) + ";");
                    }else{
                        labelLastAddress.get(i).setText(lastElements.get(ch + 1).hashCode() + "; "
                                + lastElements.get(ch).hashCode()
                                + "; " + lastElements.get(chLast - 1).hashCode()
                                + ";" );
                    }


                }
            }
        });

        addToLastDeque.setOnAction(actionEvent -> {
            specialDeque.pushLast(randomGenerating.stackGenerate());
            addLabel.setText(specialDeque.peekLast());
            for (int i = 0; i < 10; i++) {
                labels.get(i).setText(specialDeque.getIndex(i));

            }
            for (int i = specialDeque.size() - 1, j = 0; i >= specialDeque.size() - 11 ; i--, j++) {
                lastElements.add(j, specialDeque.getIndex(i));
            }
            for (int i = 0; i < 10; i++) {
                labelsLast.get(i).setText(lastElements.get(i));
            }
            int ch = 0;
            int chLast = 0;
            for (int i = 0; i < 10; i++) {
                if (i == 0){
                    ch = i;
                    chLast = i;
                    labelStartAddress.get(i).setText("null; " + specialDeque.getIndex(ch).hashCode()
                            + "; " + specialDeque.getIndex(ch+1).hashCode()
                            + ";" );
                }
                else {
                    ch = i;
                    chLast = i;
                    labelStartAddress.get(i).setText( specialDeque.getIndex(ch-1).hashCode() + "; "
                            + specialDeque.getIndex(ch).hashCode()
                            + "; " + specialDeque.getIndex(chLast+1).hashCode()
                            + ";" );
                }
            }

            for (int i = 0; i < 10; i++) {
                if (i == 0){
                    ch = i;
                    chLast = i;
                    labelLastAddress.get(i).setText(lastElements.get(ch + 1).hashCode()
                            + "; " + lastElements.get(ch).hashCode() + "; null;");
                }
                else {
                    ch = i;
                    chLast = i;
                    if (i == 9){
                        labelLastAddress.get(i).setText(lastElements.get(ch + 1).hashCode()
                                + "; " + lastElements.get(ch).hashCode() + "; " + lastElements.get(chLast - 1) + ";");
                    }else{
                        labelLastAddress.get(i).setText(lastElements.get(ch + 1).hashCode() + "; "
                                + lastElements.get(ch).hashCode()
                                + "; " + lastElements.get(chLast - 1).hashCode()
                                + ";" );
                    }


                }
            }
        });

        removeFromFirstDeque.setOnAction(actionEvent -> {
            removeLabel.setText(specialDeque.popFirst());
            for (int i = 0; i < 10; i++) {
                labels.get(i).setText(specialDeque.getIndex(i));
            }
            for (int i = specialDeque.size() - 1, j = 0; i >= specialDeque.size() - 11; i--, j++) {
                lastElements.add(j, specialDeque.getIndex(i));
            }
            for (int i = 0; i < 10; i++) {
                labelsLast.get(i).setText(lastElements.get(i));
            }
            int ch = 0;
            int chLast = 0;
            for (int i = 0; i < 10; i++) {
                if (i == 0){
                    ch = i;
                    chLast = i;
                    labelStartAddress.get(i).setText("null; " + specialDeque.getIndex(ch).hashCode()
                            + "; " + specialDeque.getIndex(ch+1).hashCode()
                            + ";" );
                }
                else {
                    ch = i;
                    chLast = i;
                    labelStartAddress.get(i).setText( specialDeque.getIndex(ch-1).hashCode() + "; "
                            + specialDeque.getIndex(ch).hashCode()
                            + "; " + specialDeque.getIndex(chLast+1).hashCode()
                            + ";" );
                }
            }

            for (int i = 0; i < 10; i++) {
                if (i == 0){
                    ch = i;
                    chLast = i;
                    labelLastAddress.get(i).setText(lastElements.get(ch + 1).hashCode()
                            + "; " + lastElements.get(ch).hashCode() + "; null;");
                }
                else {
                    ch = i;
                    chLast = i;
                    if (i == 9){
                        labelLastAddress.get(i).setText(lastElements.get(ch + 1).hashCode()
                                + "; " + lastElements.get(ch).hashCode() + "; " + lastElements.get(chLast - 1) + ";");
                    }else{
                        labelLastAddress.get(i).setText(lastElements.get(ch + 1).hashCode() + "; "
                                + lastElements.get(ch).hashCode()
                                + "; " + lastElements.get(chLast - 1).hashCode()
                                + ";" );
                    }


                }
            }
        });

        removeFromLastDeque.setOnAction(actionEvent -> {
            removeLabel.setText(specialDeque.popLast());
            for (int i = 0; i < 10; i++) {
                labels.get(i).setText(specialDeque.getIndex(i));
            }
            for (int i = specialDeque.size() - 1, j = 0; i >= specialDeque.size() - 11; i--, j++) {
                lastElements.add(j, specialDeque.getIndex(i));
            }
            for (int i = 0; i < 10; i++) {
                labelsLast.get(i).setText(lastElements.get(i));
            }
            int ch = 0;
            int chLast = 0;
            for (int i = 0; i < 10; i++) {
                if (i == 0){
                    ch = i;
                    chLast = i;
                    labelStartAddress.get(i).setText("null; " + specialDeque.getIndex(ch).hashCode()
                            + "; " + specialDeque.getIndex(ch+1).hashCode()
                            + ";" );
                }
                else {
                    ch = i;
                    chLast = i;
                    labelStartAddress.get(i).setText( specialDeque.getIndex(ch-1).hashCode() + "; "
                            + specialDeque.getIndex(ch).hashCode()
                            + "; " + specialDeque.getIndex(chLast+1).hashCode()
                            + ";" );
                }
            }

            for (int i = 0; i < 10; i++) {
                if (i == 0){
                    ch = i;
                    chLast = i;
                    labelLastAddress.get(i).setText(lastElements.get(ch + 1).hashCode()
                            + "; " + lastElements.get(ch).hashCode() + "; null;");
                }
                else {
                    ch = i;
                    chLast = i;
                    if (i == 9){
                        labelLastAddress.get(i).setText(lastElements.get(ch + 1).hashCode()
                                + "; " + lastElements.get(ch).hashCode() + "; " + lastElements.get(chLast - 1) + ";");
                    }else{
                        labelLastAddress.get(i).setText(lastElements.get(ch + 1).hashCode() + "; "
                                + lastElements.get(ch).hashCode()
                                + "; " + lastElements.get(chLast - 1).hashCode()
                                + ";" );
                    }


                }
            }
        });
    }
}
