public class Kendaraan {
    private String Merek;
    private int JmlRoda;
    private String NoPol;

    public Kendaraan(){
    }

    public Kendaraan(String merek, int jmlRoda, String noPol) {
        Merek = merek;
        JmlRoda = jmlRoda;
        NoPol = noPol;
    }

    public String getMerek() {
        return Merek;
    }

    public void setMerek(String merek) {
        Merek = merek;
    }

    public int getJmlRoda() {
        return JmlRoda;
    }

    public void setJmlRoda(int jmlRoda) {
        JmlRoda = jmlRoda;
    }

    public String getNoPol() {
        return NoPol;
    }

    public void setNoPol(String noPol) {
        NoPol = noPol;
    }
}
