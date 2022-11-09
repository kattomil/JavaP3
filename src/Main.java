import java.io.InputStream;
import java.io.OutputStream;

public class Main {
    public static void main(String[] args){
        InputStream inputStream = null;
        InputDevice inputDevice = new InputDevice(inputStream);
        OutputStream outputStream = null;
        OutputDevice outputDevice = new OutputDevice(outputStream);

        outputDevice.writeMessage(args);
        Application mainApp = new Application(inputDevice, outputDevice, args[0]);
        mainApp.run();
    }
}
