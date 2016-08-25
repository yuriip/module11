package module9.ua.goit.java.flower;

public abstract class Flower {
    private String name;
    private String color;

    public Flower(String color) {
        this.color = color;
    }

    public Flower(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Flower{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    public void grow() {
        System.out.println("Цветок растет");
    }

    public void fade(){
        System.out.println("Цветок увядае");
    }

    public abstract void formed();

    public abstract void smell();
}
