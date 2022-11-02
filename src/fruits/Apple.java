package fruits;

public class Apple extends Fruit implements SeedRemovable {

    boolean seedsInside = true;

    public Apple(double weight, double water_content, double sugar_content, Color color) {
        this.setWeight(weight);
        this.setWater_content(water_content);
        this.setSugar_content(sugar_content);
        this.setColor(color);
        this.setName("Apple");
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
