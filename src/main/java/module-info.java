module com.example.deckapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.deckapp to javafx.fxml;
    exports com.example.deckapp;
}