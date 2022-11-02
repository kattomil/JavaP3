package fruits;

public class Banana extends Fruit implements Peelable {

    boolean peeled = false;

    public Banana(double weight, double water_content, double sugar_content) {
        this.setWeight(weight);
        this.setWater_content(water_content);
        this.setSugar_content(sugar_content);
        this.setColor(Color.YELLOW);
        this.setName("Banana");
    }

    @Override
    public boolean hasPeel() {
        return this.peeled;
    }

    @Override
    public void peelOff() {
        this.peeled = true;
    }
}
