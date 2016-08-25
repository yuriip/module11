package module9.ua.goit.java;

import module9.ua.goit.java.cryptography.EncriptDecript;
import module9.ua.goit.java.flower.Bouquet;
import module9.ua.goit.java.flower.DaisyFlower;
import module9.ua.goit.java.flower.RoseFlower;
import module9.ua.goit.java.flower.TulipFlower;

public class Main {
    public static void main(String[] args) {
        Bouquet mixedBouquet = new Bouquet();
        mixedBouquet.getFlowers().add(new DaisyFlower("Ромашка", "белая"));
        mixedBouquet.getFlowers().add(new RoseFlower("Роза", "красная"));
        mixedBouquet.getFlowers().add(new TulipFlower("Тюльпан", "желтый"));
        mixedBouquet.getFlowers().add(new TulipFlower("Тюльпан", "розовый"));

        System.out.println("Букет с разными цветами\n" + mixedBouquet.getFlowers().toString());

        EncriptDecript encriptDecript = new EncriptDecript(7);

        String encryptedText = null;
        try {
            encryptedText = encriptDecript.encrypt(mixedBouquet.getFlowers().toString());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\nЗашифрованный букет\n" + encryptedText);

        String decryptedText = null;
        try {
            decryptedText = encriptDecript.decrypt(encryptedText);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("\nРасшифрованный букет\n" + decryptedText);
    }
}
