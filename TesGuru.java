
import java.util.Scanner;

//Driver Class
public class TesGuru {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Nama :");
        String nama = in.nextLine();
        System.out.println("Mapel :");
        String mapel = in.nextLine();     
        System.out.println("Alamat:");
        String alamat = in.nextLine();  
        System.out.println("ID :");
        int id = in.nextInt();
        
        // Membuat Obyek
        Guru bupasha = new Guru();
        bupasha.id = 1;
        bupasha.nama = "Nama : Pasha tania indah lestari";
        bupasha.mapel = "Mapel : Produktif";
        bupasha.alamat = "Alamat : Malang";

            System.out.println("ini data Bu pasha");
            System.out.println(bupasha.id);
            System.out.println(bupasha.nama);
            System.out.println(bupasha.mapel);
            System.out.println(bupasha.alamat);

        Guru buaulia = new Guru();
        buaulia.id = 2;
        buaulia.nama = "Nama : Aulia Mas'adah";
        buaulia.mapel = "Mapel : Produktif";
        buaulia.alamat = "Alamat : Malang";

            System.out.println("ini data Bu Aulia");
            System.out.println(buaulia.id);
            System.out.println(buaulia.nama);
            System.out.println(buaulia.mapel);
            System.out.println(buaulia.alamat);

        Guru bufeni = new Guru();
        bufeni.id = 3;
        bufeni.nama = "nama : Feniliya Mayrini";
        bufeni.mapel = "mapel : matematika";
        bufeni.alamat = "alamat : malang";

            System.out.println("ini data bu feni");
            System.out.println(bufeni.id);
            System.out.println(bufeni.nama);
            System.out.println(bufeni.mapel);
            System.out.println(bufeni.alamat);

        Guru pakabdi = new Guru();
        pakabdi.id = 4;
        pakabdi.nama = "nama : Achmad Abidin";
        pakabdi.mapel = "mapel : matematika";
        pakabdi.alamat = "alamat : malang";
        
            System.out.println("ini data pak abdi");
            System.out.println(pakabdi.id);
            System.out.println(pakabdi.nama);
            System.out.println(pakabdi.mapel);
            System.out.println(pakabdi.alamat);

        Guru pakmunif = new Guru();
        pakmunif.id = 5;
        pakmunif.nama = "nama : Mohamad Munif";
        pakmunif.mapel = "mapel : pend agama";
        pakmunif.alamat = "alamat : malang";

            System.out.println("ini data pak munif");
            System.out.println(pakmunif.id);
            System.out.println(pakmunif.nama);
            System.out.println(pakmunif.mapel);
            System.out.println(pakmunif.alamat);

        bupasha.print();
        buaulia.print();
        bufeni.print();
        pakabdi.print();
        pakmunif.print();


    }
}
