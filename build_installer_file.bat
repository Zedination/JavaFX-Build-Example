mvn clean install
jpackage --name TestJavaFXApp --input "D:\Source Code\JavaFX Project\HelloFX11\target" --module-path "D:\Java\openjfx-19.0.2.1_windows-x64_bin-jmods\javafx-jmods-19.0.2.1" --main-jar HelloFX11-1.0-SNAPSHOT-shaded.jar --main-class com.ducla12.hellofx.App --type exe --win-shortcut --win-menu