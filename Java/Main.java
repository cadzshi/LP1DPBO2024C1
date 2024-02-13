/*
Saya Sabila Rosad NIM 2106000 mengerjakan latihan 1
dalam mata kuliah Desain Pemrograman Berorientasi Objek
untuk keberkahanNya maka saya tidak melakukan
kecurangan seperti yang telah dispesifikasikan
*/
//library
import java.util.Scanner;

public class Main 
{
    public static void main(String[] args) 
    {
        //instansiasi
        Dpr[] data = new Dpr[99];
        Dpr temp = new Dpr();
        int menu = 0, n = 0;    //inisialisasi
        Scanner scanner = new Scanner(System.in);
        //clearscreen
        System.out.print("\033[H\033[2J");
        System.out.flush();

        do
        {
            //output pilihan menu
            System.out.println("+-------------------------------+");
            System.out.println("| Latihan Praktikum DPBO 1 2024 |");
            System.out.println("+-------------------------------+");
            System.out.println("Pilihan Menu :");
            System.out.println("1. Menambahkan Data Anggota DPR");
            System.out.println("2. Menampilkan Data Anggota DPR");
            System.out.println("3. Mengubah Data Anggota DPR");
            System.out.println("4. Menghapus Data Anggota DPR");
            System.out.println("5. Keluar dari Program");
            //input user
            System.out.print("\nMasukkan menu pilihan : ");
            try 
            {
                menu = scanner.nextInt();    
            }
            catch (Exception e) 
            {
                System.out.println("Input tidak sesuai!");
            }

            switch (menu) 
            {
                //case 1 untuk menambahkan data
                case 1:
                    temp = new Dpr();
                    temp.tambah();
                    data[n] = temp;
                    n++;
                    break;
                //case 2 untuk menampilkan data
                case 2:
                    temp = new Dpr();
                    temp.tampil(data, n);
                    break;
                case 3:
                //case 3 untuk mengubah data
                    temp = new Dpr();
                    temp.ubah(data, n);
                    break;
                case 4:
                //case 4 untuk menghapus data
                    temp = new Dpr();
                    temp.hapus(data, n);
                    break;
                default:
                    break;
            }
        //5 untuk keluar program
        } while (menu != 5);   

        scanner.close();
    }
}
