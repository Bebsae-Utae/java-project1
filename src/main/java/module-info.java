module com.likelion.project1new {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.likelion.project1new to javafx.fxml;
    exports com.likelion.project1new;
}