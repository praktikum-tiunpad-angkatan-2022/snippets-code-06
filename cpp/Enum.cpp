#include <iostream>

enum shape {
    LINGKARAN, PERSEGI_PANJANG = 10, PERSEGI
};

int main() {
    shape bentuk; 
    bentuk = LINGKARAN;
    std::cout << "bentuk : " << bentuk << "\n"; // bentuk : 0
    bentuk = PERSEGI_PANJANG;
    std::cout << "bentuk : " << bentuk << "\n"; // bentuk : 10
    bentuk = PERSEGI;
    std::cout << "bentuk : " << bentuk << "\n"; // bentuk : 11

    switch (bentuk)
    {
    case LINGKARAN:
        std:: cout << "Phi kali jari-jari kali jari-jari" << "\n";
        break;
    case PERSEGI_PANJANG:
        std:: cout << "Panjang kali laber" << "\n";
        break;
    case PERSEGI:
        std:: cout << "Sisi kali sisi" << "\n";
        break;
    
    default:
    std::cout << "Duar" << "\n";
        break;
    } // Sisi kali sisi

    return 0;
}