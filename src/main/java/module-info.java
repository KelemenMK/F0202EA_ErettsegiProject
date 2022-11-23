module beadando.f0202ea_erettsegiproject {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.hibernate.orm.core;
    requires java.persistence;
    requires java.naming;
    requires java.sql;

    opens beadando.f0202ea_erettsegiproject to javafx.fxml;
    exports beadando.f0202ea_erettsegiproject;
}