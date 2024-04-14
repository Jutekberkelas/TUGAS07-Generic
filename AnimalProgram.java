
import java.util.ArrayList;
import java.util.ArrayDeque;

class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

public class AnimalProgram {
    public static void main(String[] args) {
        // Membuat objek hewan
        Animal lion = new Animal("Lion");
        Animal tiger = new Animal("Tiger");
        Animal elephant = new Animal("Elephant");
        
        // Menggunakan ArrayList
        ArrayList<Animal> animalsArrayList = new ArrayList<>();
        animalsArrayList.add(lion);
        animalsArrayList.add(tiger);
        animalsArrayList.add(elephant);
        
        // Menampilkan hewan-hewan dalam ArrayList
        System.out.println("Animals in ArrayList:");
        for (Animal animal : animalsArrayList) {
            System.out.println(animal.getName());
        }
        
        // Menggunakan ArrayDeque
        ArrayDeque<Animal> animalsArrayDeque = new ArrayDeque<>();
        animalsArrayDeque.add(lion);
        animalsArrayDeque.add(tiger);
        animalsArrayDeque.add(elephant);
        
        // Menampilkan hewan-hewan dalam ArrayDeque
        System.out.println("\nAnimals in ArrayDeque:");
        for (Animal animal : animalsArrayDeque) {
            System.out.println(animal.getName());
        }
    }
}
