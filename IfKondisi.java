import java.util.Scanner;

public class IfKondisi {

    public static void main(String[] args) {
        Scanner sc21 = new Scanner(System.in);

        System.out.print("Masukkan Suhu : ");
        int suhu = sc21.nextInt();

        if (suhu<16){
            System.out.println("silahkan menggunakan jaket");
        }
        if (suhu<20){
            System.out.println("silahkan pakai baju tebal");
        }
        else {
            System.out.println("silahkan pakai topi");

        }
        
    
    }
}