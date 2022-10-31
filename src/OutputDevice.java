public class OutputDevice {

    public void writeMessage(String mess) {
        System.out.println(mess);
    }

    public void writeMessage(int numericalMessage) {
        System.out.println(numericalMessage);
    }

    public void writeMessage(String[] messArr) {
        for(String arg: messArr){
            this.writeMessage(arg);
        }
    }

}
