public class Main {
    public static void main(String[] args){
        InputDevice inputDevice = new InputDevice();
        OutputDevice outputDevice = new OutputDevice();

        outputDevice.writeMessage(args);


        Application mainApp = new Application(inputDevice, outputDevice, args[0]);
        mainApp.run();
    }
}
