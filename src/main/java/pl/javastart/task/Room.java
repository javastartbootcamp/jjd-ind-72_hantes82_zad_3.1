package pl.javastart.task;

public class Room {
    public static void main(String[] args) {
        Sofa firstSofa = new Sofa("Heban", "Leather", 215, 70);
        Sofa secondSofa = new Sofa("BlackMebel", "Skaja", 200, 60);

        System.out.printf("Informacje o sofie: %s\n", firstSofa.producer);
        System.out.printf("Materiał: %s\n", firstSofa.material);
        System.out.printf("Długość: %d\n", firstSofa.length);
        System.out.printf("Szerokość %d\n", firstSofa.width);
        System.out.printf("Informacje o sofie: %s\n", secondSofa.producer);
        System.out.printf("Materiał: %s\n", secondSofa.material);
        System.out.printf("Długość: %d\n", secondSofa.length);
        System.out.printf("Szerokość %d", secondSofa.width);

    }
}
