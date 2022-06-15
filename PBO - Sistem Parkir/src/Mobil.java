//inheritance mobil
import java.lang.String;

public class Mobil extends Kendaraan{
    private int jumlahPenumpang;

    public Mobil(int jumlahPenumpang) {
        this.jumlahPenumpang = jumlahPenumpang;
    }

    public Mobil(String merek, int jmlRoda, int jumlahPenumpang, String noPol) {
        super(merek, jmlRoda, noPol);
        this.jumlahPenumpang = jumlahPenumpang;
    }

    public int getJumlahPenumpang() {
        return jumlahPenumpang;
    }

    public void setJumlahPenumpang(int jumlahPenumpang) {
        this.jumlahPenumpang = jumlahPenumpang;
    }
}
