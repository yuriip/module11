package module9.ua.goit.java.flower;

public class RoseFlower extends Flower {
    public RoseFlower(String color) {
        super(color);
    }

    public RoseFlower(String name, String color) {
        super(name, color);
    }

    @Override
    public void formed() {
        System.out.println("Формируется роза");
    }

    @Override
    public void smell() {
        System.out.println("Роза пахнет приятно и очень сильно");
    }
}
