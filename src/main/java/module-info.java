module com.manage.inventorymanagementsystem {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires net.synedra.validatorfx;

    opens com.manage.inventorymanagementsystem to javafx.fxml;
    exports com.manage.inventorymanagementsystem;
}