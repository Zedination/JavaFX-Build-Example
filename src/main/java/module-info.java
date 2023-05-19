module com.ducla.hellofx {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.jfxtras.styles.jmetro;
    requires org.controlsfx.controls;
    requires org.kordamp.ikonli.javafx;
//    requires aspose.words;

    opens com.ducla12.hellofx to javafx.fxml;
    exports com.ducla12.hellofx;
}