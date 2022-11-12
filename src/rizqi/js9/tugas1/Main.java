package rizqi.js9.tugas1;

public class Main {
    public static void main(String[] args) {
        Segitiga sgt = new Segitiga();

        System.out.println("=-=-=  Program Menghitung Segitiga  =-=-=");
        System.out.println("    Total Sisa Sudut Segitiga 1 : " + sgt.totalSudut(45));
        System.out.println("    Total Sudut C Segitiga 2    : " + sgt.totalSudut(30, 90));
        System.out.println("    Keliling Segitiga 1         : " + sgt.keliling(15, 20, 12));
        System.out.println("    Sisi C Segitiga 2           : " + sgt.keliling(12, 9));
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
    }
}
