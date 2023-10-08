#include <iostream>

class Dog {
    private: 
        int age = 10;
    public: 
        void move() {
            std::cout << "The dog walks! \n";
        }
};

class : private Dog {
    public:
        void move() {
            std::cout << "The dog flies!\n";
        }
} superDog; // Variabel class ini hanya bisa dibuat disini


class {
    public: 
        void eat() {
            std::cout << "The cat eats!\n";
        }
} cat; // Variabel class ini hanya bisa dibuat disini

int main() {
    Dog regulerDog;
    regulerDog.move(); // The dog walks!
    std::cout << typeid(regulerDog).name() << "\n"; // 3Dog ==> class Dog

    superDog.move(); // The dog flies!
    std::cout << typeid(superDog).name() << "\n"; // 9._anon_62 ==> Anonymous class

    cat.eat(); // The cat eats!
    std::cout << typeid(cat).name() << "\n"; // 9._anon_63 ==> Anonymous class
}