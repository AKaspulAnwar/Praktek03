package praktek03;

public class HasilPangan extends Beras{
    private String jenisPangan;
    
    void throttle(){
        System.out.println("Padi");
    } 

    public String getJenisPangan() {
        return jenisPangan;
    }

    public void setJenisPangan(String jenisPangan) {
        this.jenisPangan = jenisPangan;
    }
    
}
