package praktek03;

public class BerasAksi {
    public static void main(String[] args) {
        Beras Siam = new Beras();
        
        Siam.setWarna("Putih Bening");
        Siam.setHasil("Karau");
        Siam.setHarga(10000);
        
        Siam.cetakInfo();
        
        System.out.print("Warnanya \t: ");
        System.out.println(Siam.getWarna());
        System.out.print("Hasilnya \t: ");
        System.out.println(Siam.getHasil());
        System.out.print("Harganya \t: ");
        System.out.println(Siam.getHarga());
        
        HasilPangan sawah = new HasilPangan();
        sawah.setWarna("PutihBening");
        sawah.setHasil("Karau");
        sawah.setHarga(10000);
        sawah.setJenisPangan("Padi");
        sawah.cetakInfo();
        System.out.println("Jenis \t: "+sawah.getJenisPangan());
        sawah.throttle();
    }
    
}
