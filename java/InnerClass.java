class ClassLuar {
    private int x = 5;
    class ClassDalam {
        private int y = 10;

        public ClassDalam() {
            x = 7;
        }

        public int getY() {
            return y;
        }
    }

    static class StaticClassDalam {
        private int z = 20;

        public int getZ() {
            return z;
        }
    }

    public int getX() {
        return x;
    }
}

public class InnerClass {
    public static void main(String args[]) {
        ClassLuar luaran = new ClassLuar();
        System.out.println(luaran.getX()); // 5
        // System.out.println(luaran.getY()); // Ga punya akses ke fungsi maupun properti yang ada pada class dalam

        ClassLuar.ClassDalam daleman = luaran.new ClassDalam();
        // System.out.println(daleman.getX()); // Ga punya akses ke fungsi maupun properti yang ada pada class luar
        System.out.println(daleman.getY()); // 10
        System.out.println(luaran.getX()); // berkat constructor kelas dalam, properti luaran berubah

        System.out.println("(" + luaran.getX() + ", " + daleman.getY() + ")"); 

        

        ClassLuar.StaticClassDalam staticClass = new ClassLuar.StaticClassDalam(); // dapat diinisiasikan tanpa objek class luar
        // System.out.println(staticClass.getX()); // sama sama tidak bisa akses yang di class luar
        System.out.println(staticClass.getZ()); // 20
    }
}
