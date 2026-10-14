package info.java;

class Animal {
    void move() {
        System.out.println("Animal moves");
    }

    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Bird extends Animal {
    @Override
    void move() {
        System.out.println("Bird flies in the sky");
    }

    @Override
    void makeSound() {
        System.out.println("Bird chirps");
    }
}

class Panthera extends Animal {
    @Override
    void move() {
        System.out.println("Panthera walks and runs on land");
    }

    @Override
    void makeSound() {
        System.out.println("Panthera roars");
    }
}

public class AnimalDemo {
    public static void main(String[] args) {
        Bird b = new Bird();
        Panthera p = new Panthera();

        b.move();
        b.makeSound();

        p.move();
        p.makeSound();
    }
}




