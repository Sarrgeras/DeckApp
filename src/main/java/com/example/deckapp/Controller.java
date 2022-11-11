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

            for (int i = 0; i < 10; i++) {
                labels.get(i).setText(specialDeque.getIndex(i));
            }
            for (int i = specialDeque.size() - 1, j = 0; i >= specialDeque.size() - 10 ; i--, j++) {
                lastElements.add(j, specialDeque.getIndex(i));
            }
            for (int i = 0; i < 10; i++) {
                labelsLast.get(i).setText(lastElements.get(i));
            }
        });

        addToFirstDeque.setOnAction(actionEvent -> {
            specialDeque.pushFirst(randomGenerating.stackGenerate());
            addLabel.setText(specialDeque.peekFirst());
            for (int i = 0; i < 10; i++) {
                labels.get(i).setText(specialDeque.getIndex(i));
            }
            for (int i = specialDeque.size() - 1, j = 0; i >= specialDeque.size() - 10 ; i--, j++) {
                lastElements.add(j, specialDeque.getIndex(i));
            }
            for (int i = 0; i < 10; i++) {
                labelsLast.get(i).setText(lastElements.get(i));
            }
        });

        addToLastDeque.setOnAction(actionEvent -> {
            specialDeque.pushLast(randomGenerating.stackGenerate());
            addLabel.setText(specialDeque.peekLast());
            for (int i = 0; i < 10; i++) {
                labels.get(i).setText(specialDeque.getIndex(i));
            }
            for (int i = specialDeque.size() - 1, j = 0; i >= specialDeque.size() - 10 ; i--, j++) {
                lastElements.add(j, specialDeque.getIndex(i));
            }
            for (int i = 0; i < 10; i++) {
                labelsLast.get(i).setText(lastElements.get(i));
            }
        });

        removeFromFirstDeque.setOnAction(actionEvent -> {
            removeLabel.setText(specialDeque.popFirst());
            for (int i = 0; i < 10; i++) {
                labels.get(i).setText(specialDeque.getIndex(i));
            }
            for (int i = specialDeque.size() - 1, j = 0; i >= specialDeque.size() - 10 ; i--, j++) {
                lastElements.add(j, specialDeque.getIndex(i));
            }
            for (int i = 0; i < 10; i++) {
                labelsLast.get(i).setText(lastElements.get(i));
            }
        });

        removeFromLastDeque.setOnAction(actionEvent -> {
            removeLabel.setText(specialDeque.popLast());
            for (int i = 0; i < 10; i++) {
                labels.get(i).setText(specialDeque.getIndex(i));
            }
            for (int i = specialDeque.size() - 1, j = 0; i >= specialDeque.size() - 10 ; i--, j++) {
                lastElements.add(j, specialDeque.getIndex(i));
            }
            for (int i = 0; i < 10; i++) {
                labelsLast.get(i).setText(lastElements.get(i));
            }
        });
    }
}
