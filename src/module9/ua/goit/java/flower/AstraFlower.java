package module9.ua.goit.java.flower;

public class AstraFlower extends Flower {
    public AstraFlower(String name, String color) {
        super(name, color);
    }

    @Override
    public void formed() {
        System.out.println("Формируется астра");
    }

    @Override
    public void smell() {
        System.out.println("Астра не пахнет");
    }
}
