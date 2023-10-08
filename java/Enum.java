enum Bentuk2D {
    LINGKARAN, PERSEGI, PERSEGI_PANJANG, SEGITIGA
}

enum Bentuk2DWithMethod {
    LINGKARAN {
        public void cetakRumus() {
            System.out.println("Phi kali jari-jari kali jari-jari");
        }
    },
    PERSEGI {
        public void cetakRumus() {
            System.out.println("Sisi kali sisi");
        }
    };

    public void cetakRumus() {
        System.out.println("Halo");
    }

}

public class Enum {
    public static void main(String args[]) {
        Bentuk2D test = Bentuk2D.PERSEGI_PANJANG;

        System.out.println(test); //PERSEGI_PANJANG

        switch (test) {
            case PERSEGI_PANJANG:
                System.out.println("Panjang kali lebar");
                break;
            case LINGKARAN:
                System.out.println("Phi kali jari-jari kali jari-jari");
                break;
            case PERSEGI:
                System.out.println("Sisi kali sisi");
                break;
            case SEGITIGA:
                System.out.println("Setengah kali alas kali tinggi");
                break;
        
            default:
                System.out.println("Duar");
                break;
        } // Panjang kali lebar

        Bentuk2DWithMethod test2 = Bentuk2DWithMethod.LINGKARAN;
        test2.cetakRumus(); //Phi kali jari-jari kali jari-jari
    }
}
