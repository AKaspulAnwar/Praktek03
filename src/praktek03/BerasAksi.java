package praktek03;

public class BerasAksi {
    public static void main(String[] args) {
        Beras Siam = new Beras();
        
        System.out.print("Beras Siam"+"\n");
        Siam.setWarna("Putih Bening");
        Siam.setHasil("Karau");
        Siam.setHarga(10000);
        
        Siam.cetakInfo();
        System.out.print("Warnanya \t: ");
        System.out.println(Siam.getWarna());
        System.out.print("Hasilnya \t: ");
        System.out.println(Siam.getHasil());
        System.out.print("Harganya \t: Rp. ");
        System.out.println(Siam.getHarga()+"/Liter");
        
        HasilPangan sawah = new HasilPangan();
        sawah.setWarna("PutihBening");
        sawah.setHasil("Karau");
        sawah.setHarga(10000);
        sawah.setJenisPangan("Padi");
        sawah.setJenislahan("Gambut");
        sawah.setHasilpanen(10000);
        
        sawah.cetakInfo();
        System.out.println("Jenis \t: "+sawah.getJenisPangan());
        System.out.println("Lahan \t: "+sawah.getJenislahan());
        System.out.println("Panen \t: "+sawah.getHasilpanen()+" Kg/10 m2");
        sawah.throttle();
    }
    
}
