import java.util.Scanner;

public class PemilihanPercobaan2_21  {
  
    public static void main(String[] args) {
    Scanner input21 = new Scanner(System.in);

    System.out.print("Nilai uas     : ");
    float uas = input21.nextFloat();

    System.out.print("Nilai uts     : ");
    float uts = input21.nextFloat();

    System.out.print("Nilai kuis     : ");
    float kuis = input21.nextFloat();

    System.out.print("Nilai tugas    : ");
    float tugas = input21.nextFloat();

    float total = (uas * 0.4F) + (uts * 0.3F) + (kuis * 0.1F) + (tugas * 0.2F);

    // Cara lebih cepat menggunakan TernaryOperator
    /* String message = 80 < total && total <= 100? "Anda mendapatkan Nilai A, dengan Kualifikasi Sangat Baik"
        :73 < total && total <= 80? "Anda mendapatkan Nilai B+, dengan Kualifikasi Lebih dari Baik"
        :65 < total && total <= 73? "Anda mendapatkan Nilai B, dengan Kualifikasi BaiK"
        :60 < total && total <= 65? "Anda mendapatkan Nilai C+, dengan Kualifikasi Lebih dari Cukup"
        :50 < total && total <= 60? "Anda mendapatkan Nilai C, dengan Kualifikasi Cukup"
        :39 < total && total <= 50? "Anda mendapatkan Nilai D, dengan Kualifikasi Kurang"
        :"Gagal"; */

    String message = total < 65 ? "Remidi" : "Tidak Remidi";
    System.out.println("Nilai akhir = "+ total + " sehingga " + message);

    if(total > 80){
    System.out.println("Anda mendapatkan Nilai A, dengan Kualifikasi Sangat Baik");}
    
    else if(total > 73){
    System.out.println("Anda mendapatkan Nilai B+, dengan Kualifikasi Lebih dari Baik");}

    else if(total > 65){
    System.out.println("Anda mendapatkan Nilai B, dengan Kualifikasi BaiK");}

    else if(total > 60){
    System.out.println("Anda mendapatkan Nilai C+, dengan Kualifikasi Lebih dari Cukup");}

    else if(total > 50){
    System.out.println("Anda mendapatkan Nilai C, dengan Kualifikasi Cukup");}

    else if(total > 39){
    System.out.println("Anda mendapatkan Nilai D, dengan Kualifikasi Kurang");}

    else {
    System.out.println("Anda mendapatkan Nilai E, dengan Kualifikasi Gagal");} 

    

    }
}