class Dog {
    public void move() {
        System.out.println("The dog take a walk!");
    }
}

public class AnonymousClass {
    public static void main(String[] args) {
        Dog regularDog = new Dog();
        regularDog.move(); // The dog take a walk!
        System.out.println(regularDog instanceof Dog);

        Dog superDog = new Dog(){
            @Override
            public void move() {
                System.out.println("The dog flies!");
            }
        };

        superDog.move(); // The dog flies!
        System.out.println(superDog instanceof Dog);
    }
}
