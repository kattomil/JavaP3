package fruits;

public class Mango extends Fruit implements Peelable, SeedRemovable{

    boolean seedsInside = true;
    boolean peeled = false;

    public Mango(double weight, double water_content, double sugar_content, Color color){
        this.setColor(color);
        this.setWeight(weight);
        this.setSugar_content(sugar_content);
        this.setWater_content(water_content);
        this.setName("Mango");
    }

    @Override
    public boolean hasPeel() {
        return this.peeled;
    }

    @Override
    public void peelOff() {
        this.peeled = true;
    }

    @Override
    public boolean hasSeeds() {
        return this.seedsInside;
    }

    @Override
    public void removeSeeds() {
        this.seedsInside = false;
    }
}
