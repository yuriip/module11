package module9.ua.goit.java.flower;

public class DaisyFlower extends Flower {
    public DaisyFlower(String name, String color) {
        super(name, color);
    }

    @Override
    public void formed() {
        System.out.println("Формируется ромашка");
    }

    @Override
    public void smell() {
        System.out.println("Ромашка пахнет немного специфически");
    }
}
