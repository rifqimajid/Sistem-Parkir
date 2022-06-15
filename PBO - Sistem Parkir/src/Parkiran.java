import java.util.ArrayList;

public class Parkiran {
    private ArrayList<Motor> daftarMotor = new ArrayList<>();
    private ArrayList<Mobil> daftarMobil = new ArrayList<>();

    public Parkiran(){
    }

    public Parkiran(ArrayList<Motor> daftarMotor, ArrayList<Mobil> daftarMobil) {
        this.daftarMotor = daftarMotor;
        this.daftarMobil = daftarMobil;
    }

    public ArrayList<Motor> getDaftarMotor() {
        return daftarMotor;
    }

    public void setDaftarMotor(ArrayList<Motor> daftarMotor) {
        this.daftarMotor = daftarMotor;
    }

    public ArrayList<Mobil> getDaftarMobil() {
        return daftarMobil;
    }

    public void setDaftarMobil(ArrayList<Mobil> daftarMobil) {
        this.daftarMobil = daftarMobil;
    }

    public void addMotor(Motor mtr){
        daftarMotor.add(mtr);
    }

    public void addMobil(Mobil mbl){
        daftarMobil.add(mbl);
    }
}
