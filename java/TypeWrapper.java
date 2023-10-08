public class TypeWrapper {
    public static void main(String[] args){
        // Primitif --> Wrapper
        //  Variable primitif
        int pri = 10;
    
        // Integer obj1 = new Integer(pri); // Constructornya sudah deprecated, sebaiknya jangan dipakai
    
        //  Pakai factory method
        Integer obj2 = Integer.valueOf(pri);
        System.out.println(obj2); // 10 
    
        // Wrapper --> Primitif 
        int hasil = obj2.intValue();
        System.out.println(hasil);

        // Ada cara automatis
        int a = 1;
        int b = 3;
        // Masuk sebagai int biasa 
        int hasil2 = tambah(a, b);
        // Keluar sebagai int biasa
        System.out.println(hasil2);
    }

    // walaupun method menggunakan tipe Integer
    public static Integer tambah(Integer a, Integer b) {
        return a + b;
    }
}