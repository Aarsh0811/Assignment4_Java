module com.georgian.studentinfosystem.ad.groupassignment {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.georgian.studentinfosystem.ad to javafx.fxml;
    exports com.georgian.studentinfosystem.ad;
}