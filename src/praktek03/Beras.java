package praktek03;

public class Beras {
    private String warna;
    private String hasil;
    private double harga;
    
    void cetakInfo(){
        System.out.println("Warna \t: "+warna+"\n"+"Hasil \t: "+hasil+"\n"+"Harga \t: Rp. "+harga+"/Liter");
        
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public String getHasil() {
        return hasil;
    }

    public void setHasil(String hasil) {
        this.hasil = hasil;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }
    
    
    
}
