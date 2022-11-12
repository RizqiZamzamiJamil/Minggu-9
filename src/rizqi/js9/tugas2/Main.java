package rizqi.js9.tugas2;

public class Main {
    public static void main(String[] args) {
        Manusia manusia = new Manusia();
        Manusia dosen = new Dosen();
        Manusia mahasiswa = new Mahasiswa();

        /*Menggunakan method makan(). 
        Karena method makan ada di semua class yang dimana hal ini merupakan proses overriding*/
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-= Overriding =-=-=-=-=-=-=-=-=-=-=-=");
        System.out.print("Parent Class       : "); 
        manusia.makan();
        System.out.print("SubClass Dosen     : "); 
        dosen.makan();
        System.out.print("SubClass Mahasiswa : ");
        mahasiswa.makan();
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=____________=-=-=-=-=-=-=-=-=-=-=-=");
    }
}
