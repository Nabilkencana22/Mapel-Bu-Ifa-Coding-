// Driver Class
import java.util.Scanner;

public class TesSiswa {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
            System.out.println("Nama      :");
                String nama = in.nextLine();
                    System.out.println("ID :");
                int id = in.nextInt();
            System.out.println("IPK :");
        double ipk = in.nextDouble();
        Siswa rufat = new Siswa(id , nama , ipk);
        //Niali diatas 75 lulus
        if (rufat.getIPK() >= 75) {
            System.out.println(rufat.getNama() + " LULUS");
        } else {
            System.out.println(rufat.getNama() + " TIDAK LULUS");            
        }
        
        //NILAI HURUF 
        if (rufat.getIPK() < 60) {
            System.out.println("E");

                } else if (rufat.getIPK() >= 61 && rufat.getIPK() <=70) {
                    System.out.println("D");

                        } else if (rufat.getIPK() >= 71 && rufat.getIPK() <=80) {
                        System.out.println("C");

                }else if (rufat.getIPK() >= 81 && rufat.getIPK() <=90) {
            System.out.println("B");

        }else if (rufat.getIPK() >=   91 && rufat.getIPK() <=100) {
            System.out.println("A");
        }

        if (rufat.getIPK() < 0);                          
        in.close();
    }
}
