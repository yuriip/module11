package module9.ua.goit.java.flower;

import java.util.ArrayList;
import java.util.List;

public class Bouquet {
    private final static int MAX_NUM_FLOWERS = 5;

    private String name;
    private int numFlowers;
    private List<Flower> flowers;

    public Bouquet() {
        flowers = new ArrayList<>(MAX_NUM_FLOWERS);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Flower getFlower(int index) {
        return flowers.get(index);
    }

    public int getNumFlowers() {
        return flowers.size();
    }

    public void addFlower(Flower flower) {
        flowers.add(flower);
    }

    public List<Flower> getFlowers() {
        return flowers;
    }

    public void listFlowers() {
        if (flowers != null) {
            for (Flower f : flowers) {
                System.out.println(f.getName() + " " + f.getColor());
            }
        }
    }
}
