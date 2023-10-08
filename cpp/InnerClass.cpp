#include <iostream>

class Penutup {
    private:
        int x = 10;

    

    public: 
        int getX() {
            return x;
        }

        class Dalem {
        private: 
            int y = 5;
        
        public:
            int getY() {
                return y;
            }
    };
};

int main() {
    Penutup tutup;

    std::cout << tutup.getX() << "\n"; //10
    // std::cout << tutup.getY() << "\n"; // Tidak memiliki akses ke properti maupun method inner class
    std::cout << typeid(tutup).name() << "\n"; // 7Penutup ==> artinya memiliki class penutup

    Penutup::Dalem isi; // 5
    // std::cout << isi.getX() << "\n"; // Tidak memiliki akses ke properti maupun method outer class
    std::cout << isi.getY() << "\n"; 
    std::cout << typeid(isi).name() << "\n";  // N7Penutup5DalemE ==> artinya memiliki class Dalem yg berada di class Penutup

}