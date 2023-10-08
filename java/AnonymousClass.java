class Dog {
    public void move() {
        System.out.println("The dog take a walk!");
    }
}

public class AnonymousClass {
    public static void main(String[] args) {
        Dog regularDog = new Dog();
        regularDog.move(); // The dog take a walk!

        Dog superDog = new Dog(){
            @Override
            public void move() {
                System.out.println("The dog flies!");
            }
        };

        superDog.move(); // The dog flies!
    }
}
