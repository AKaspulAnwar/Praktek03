package praktek03;

public class HasilPangan extends Beras{
    private String jenisPangan;
    private String jenislahan;
    private double hasilpanen;
    
    void throttle(){
        System.out.println("Tergolong Padi Ringan");
    } 

    public String getJenisPangan() {
        return jenisPangan;
    }

    public void setJenisPangan(String jenisPangan) {
        this.jenisPangan = jenisPangan;
    }

    public String getJenislahan() {
        return jenislahan;
    }

    public void setJenislahan(String jenislahan) {
        this.jenislahan = jenislahan;
    }

    public double getHasilpanen() {
        return hasilpanen;
    }

    public void setHasilpanen(double hasilpanen) {
        this.hasilpanen = hasilpanen;
    }
    
    
}
