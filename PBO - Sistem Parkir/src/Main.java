import java.util.ArrayList;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jumlahRoda = 0, jamMasuk, mntMasuk, jumlahPenumpang, itrMotor = 0, itrMobil = 0, pilih = 1;
        String merek, noPol;
        Motor[] motor = new Motor[10];
        Mobil[] mobil = new Mobil[10];

        ArrayList<Motor> daftarMotor = new ArrayList<>();
        ArrayList<Mobil> daftarMobil = new ArrayList<>();

        while(true) {
        System.out.println("\t Program Sistem Parkir Mall");
        System.out.println("--------------------------------------------");
        System.out.println("Silahkan Pilih Jenis Kendaraan");
        System.out.println("1. Motor");
        System.out.println("2. Mobil");
        System.out.println("3. Batal");
        System.out.print("Pilihan: ");
   
        pilih = sc.nextInt();
            if(pilih == 1){
                System.out.println("Jenis Kendaraan Anda adalah Motor");
                System.out.print("Merek\t\t: ");
                sc.next();
                merek = sc.nextLine();
                while(true){
                    System.out.print("Jumlah roda\t: ");
                    jumlahRoda = sc.nextInt();
                    if(jumlahRoda != 2){
                        System.out.println("Maaf input yang anda masukkan tidak sesuai ketentuan");
                    } else{
                        break;
                    }
                }
        
                System.out.print("No Polisi\t: ");
                noPol = sc.next();
                while(true){
                    motor[itrMotor] = new Motor(merek, jumlahRoda, noPol);
                    itrMotor++;
                    break;
                }
                System.out.println();

                System.out.println("Input jam masuk kendaraan");
                while(true){
                    System.out.print("Jam masuk\t: ");
                    jamMasuk = sc.nextInt();
                    if(jamMasuk < 0 || jamMasuk > 23){
                        System.out.println("Mungkin Anda keliru menginput jam?");
                    } else{
                        break;
                    }
                }
                
                while(true){
                    System.out.print("Menit masuk\t: ");
                    mntMasuk = sc.nextInt();
                    if(mntMasuk < 0 || mntMasuk > 59){
                        System.out.println("Mungkin Anda keliru menginput menit?");
                    } else{
                        break;
                    }
                }
                System.out.println("Input kendaraaan Anda tercatat pukul " + jamMasuk + ":" + mntMasuk);
                break;
            }
                        
            else if(pilih == 2){
                System.out.println("Jenis Kendaraan Anda adalah Mobil");
                System.out.print("Merek\t\t: ");
                sc.next();
                merek = sc.nextLine();
                while(true){
                    System.out.print("Jumlah roda\t: ");
                    jumlahRoda = sc.nextInt();
                    if(jumlahRoda != 4){
                        System.out.println("Maaf input yang anda masukkan tidak sesuai ketentuan");
                    } else{
                        break;
                    }
                }

                System.out.print("Jumlah Penumpang: ");
                jumlahPenumpang = sc.nextInt();
                System.out.print("No Polisi\t: ");
                noPol = sc.next();
                while(true){
                    mobil[itrMobil] = new Mobil(merek, jumlahRoda, jumlahPenumpang, noPol);
                    itrMotor++;
                    break;
                }
                System.out.println();

                System.out.println("Input jam masuk kendaraan");
                while(true){
                    System.out.print("Jam masuk\t: ");
                    jamMasuk = sc.nextInt();
                    if(jamMasuk < 0 || jamMasuk > 23){
                        System.out.println("Mungkin Anda keliru menginput jam?");
                    } else{
                        break;
                    }
                }
                
                while(true){
                    System.out.print("Menit masuk\t: ");
                    mntMasuk = sc.nextInt();
                    if(mntMasuk < 0 || mntMasuk > 59){
                        System.out.println("Mungkin Anda keliru menginput menit?");
                    } else{
                        break;
                    }
                }
                System.out.println("Input kendaraaan Anda tercatat pukul " + jamMasuk + ":" + mntMasuk);
                break;
            }

            else {
                break;
            }
                    
        }  
                
        
    }
}
