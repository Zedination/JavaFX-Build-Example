package com.ducla12.hellofx;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
//        Clipboard clipboard = Clipboard.getSystemClipboard();
//        System.out.println(clipboard.getContentTypes());
//        System.out.println(clipboard.getContent(DataFormat.HTML));
//        clipboard.getContentTypes().forEach(System.out::println);
//        System.out.println(clipboard.getContent(DataFormat.lookupMimeType("text/html")));

    }

    @FXML
    protected void onTestClipBoardClick() throws Exception {
        welcomeText.setText("");
//        Clipboard clipboard = Clipboard.getSystemClipboard();
//        Document document1 = new Document("Poi.docx");
//        RtfSaveOptions rtfSaveOptions = new RtfSaveOptions();
//        OutputStream outputStream = new ByteArrayOutputStream();
//        document1.save(outputStream, rtfSaveOptions);
//        System.out.println(outputStream.toString());
//        ClipboardContent clipboardContent = new ClipboardContent();
//        clipboardContent.putRtf(outputStream.toString());
//        clipboard.setContent(clipboardContent);
//        outputStream.close();
    }
}