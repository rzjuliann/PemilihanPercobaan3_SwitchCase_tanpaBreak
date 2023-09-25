import java.util.Scanner;

public class PemilihanPercobaan1_TernaryOperator_21 {
  
    public static void main(String[] args) {
    Scanner input21 = new Scanner(System.in);

    System.out.print("Masukan angka: ");
    int angka = input21.nextInt();

    String result = (angka % 2 == 0) ? "Bilangan Genap" : "Bilangan Ganjil";
    System.out.println(result);

    }
}