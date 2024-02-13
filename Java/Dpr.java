/*
Saya Sabila Rosad NIM 2106000 mengerjakan latihan 1
dalam mata kuliah Desain Pemrograman Berorientasi Objek
untuk keberkahanNya maka saya tidak melakukan
kecurangan seperti yang telah dispesifikasikan
*/

//library
import java.util.Scanner;

//deklarasi class
public class Dpr 
{
    //atribut private
    private int id;         //id dpr
    private String nama;    //nama dpr
    private String nbidang; //nama bidang dpr   
    private String npartai; //nama partai dpr
    
    //constructor
    public Dpr()
    {
        this.id =0;
        this.nama = "";
        this.nbidang = "";
        this.npartai = "";
    }
    public Dpr(int id, String nama, String nbidang, String npartai)
    {
        this.id = id;
        this.nama = nama;
        this.nbidang = nbidang;
        this.npartai = npartai;
    }

    //setter
    public void setId(int n)
    {
        this.id = n;
    }
    public void setNama(String nama)
    {
        this.nama = nama;
    }
    public void setNbidang(String nbidang)
    {
        this.nbidang = nbidang;
    }
    public void setNpartai(String npartai)
    {
        this.npartai = npartai;
    }

    //getter
    public int getId()
    {
        return this.id;
    }
    public String setNama()
    {
        return this.nama;
    }
    public String setNbidang()
    {
        return this.nbidang;
    }
    public String setNpartai()
    {
        return this.npartai;
    }

    //methods
    Scanner scanner = new Scanner(System.in);
    //menambahkan data anggota dpr
    public void tambah()
    {
        clearScreen();
        System.out.println("+------------------------------+");
        System.out.println("| Menambahkan Data Aggota Baru |");
        System.out.println("+------------------------------+");

        System.out.print("Masukkan ID Anggota DPR          : ");
        try 
        {
            this.id = scanner.nextInt();
        } 
        catch (Exception e) 
        {
            System.out.println("Input tidak sesuai!");
        }
        System.out.print("Masukkan Nama Anggota DPR        : ");
        try 
        {
            this.nama = scanner.next();
        } 
        catch (Exception e) 
        {
            System.out.println("Input tidak sesuai!");
        }
        System.out.print("Masukkan Nama Bidang Anggota DPR : ");
        try 
        {
            this.nbidang = scanner.next();
        } 
        catch (Exception e) 
        {
            System.out.println("Input tidak sesuai!");
        }
        System.out.print("Masukkan Nama Partai Anggota DPR : ");
        try 
        {
            this.npartai = scanner.next();
        } 
        catch (Exception e) 
        {
            System.out.println("Input tidak sesuai!");
        }

        System.out.println("\nData berhasil ditambahkan!");
    }

    //menampilkan data anggota dpr
    public void tampil(Dpr data[], int n)
    {
        //penanda
        int longestId = 0, longestNama = 4, longestNbidang = 11, longestNpartai = 11;
        int temp = 2;
        clearScreen();
        System.out.println("\nList Anggota DPR");
        //kalau data lebih dari 0 (terdapat data)
        if (n > 0) 
        {
            for(int i = 0; i < n; i++)
            {
                //nyari kata terpanjang di setiap kolom
                if (data[i].id > temp) 
                {
                    temp = data[i].id;
                    longestId = temp - data[i].id;    
                }
                if (data[i].nama.length() > longestNama) 
                {
                    longestNama = data[i].nama.length();    
                }
                if (data[i].nbidang.length() > longestNbidang)  
                {
                    longestNbidang = data[i].nbidang.length();    
                }
                if (data[i].npartai.length() > longestNpartai) 
                {
                    longestNpartai = data[i].npartai.length();    
                }
            }
            //garis tabel paling atas
            garisTabel(longestId + 2, longestNama, longestNbidang, longestNpartai);
            //kolom paling atas
            System.out.print("| ID");
            for (int i = 0; i < longestId; i++) 
            {
                System.out.print(" ");    
            }
            System.out.print(" | Nama");
            for (int i = 0; i < longestNama - 4; i++) 
            {
                System.out.print(" ");    
            }
            System.out.print(" | Nama Bidang");
            for (int i = 0; i < longestNbidang - 11; i++) 
            {
                System.out.print(" ");    
            }
            System.out.print(" | Nama Partai");
            for (int i = 0; i < longestNpartai - 11; i++) 
            {
                System.out.print(" ");    
            }
            System.out.println(" |");
            //garis lagi
            garisTabel(longestId + 2, longestNama, longestNbidang, longestNpartai);
            //print setiap kolom
            for (int i = 0; i < n; i++) 
            {
                //kalau angka id kurang dari 10 maka perlu ditambah 1 biar sesuai garisnya
                if (data[i].id < 10) 
                {
                    System.out.print("| " + data[i].id);
                    for (int j = 0; j < longestId + 1; j++) 
                    {
                        System.out.print(" ");    
                    }    
                }
                else //kalau lebih ya gausah
                {
                    System.out.print("| " + data[i].id);
                    for (int j = 0; j < longestId; j++) 
                    {
                        System.out.print(" ");    
                    }
                }
                System.out.print(" | " + data[i].nama);
                for (int j = 0; j < longestNama - data[i].nama.length(); j++) 
                {
                    System.out.print(" ");    
                }    
                System.out.print(" | " + data[i].nbidang);
                for (int j = 0; j < longestNbidang - data[i].nbidang.length(); j++) 
                {
                    System.out.print(" ");    
                }    
                System.out.print(" | " + data[i].npartai);
                for (int j = 0; j < longestNpartai - data[i].npartai.length(); j++) 
                {
                    System.out.print(" ");    
                }    
                System.out.println(" |");
            }
            //garis paling bawah
            garisTabel(longestId + 2, longestNama, longestNbidang, longestNpartai);
        }
        else    //kalau datanya 0 alias kosong
        {
            System.out.println("KOOOOSOOOOONGG macam hatimu~~");
        }
    }
    //mengubah data anggota dpr
    public void ubah(Dpr data[], int n)
    {
        int cari = 0, flag = 0;
        clearScreen();
        tampil(data, n);
        //input user
        System.out.println("+-----------------------+");
        System.out.println("| Ubah Data Anggota DPR |");
        System.out.println("+-----------------------+");
        System.out.print("Masukkan ID DPR yang ingin diubah : ");
        try 
        {
            cari = scanner.nextInt();    
        } 
        catch (Exception e) 
        {
            System.out.println("Input tidak sesuai!");
        }
        //proses perubahan data
        for (int i = 0; i < n; i++) 
        {
            //kalau yg dicari ada
            if (cari == data[i].getId()) 
            {
                System.out.print("Masukkan Nama Anggota DPR        : ");
                try 
                {
                    data[i].nama = scanner.next();
                } 
                catch (Exception e) 
                {
                    System.out.println("Input tidak sesuai!");
                }
                System.out.print("Masukkan Nama Bidang Anggota DPR : ");
                try 
                {
                    data[i].nbidang = scanner.next();
                } 
                catch (Exception e) 
                {
                    System.out.println("Input tidak sesuai!");
                }
                System.out.print("Masukkan Nama Partai Anggota DPR : ");
                try 
                {
                    data[i].npartai = scanner.next();
                } 
                catch (Exception e) 
                {
                    System.out.println("Input tidak sesuai!");
                }
                System.out.println("\nData berhasil diubah!");
                flag = 1;
                break;
            }
        }
        if (flag != 1) 
        {
            System.out.println("\nID tidak ditemukan!");
        }
    }
    //menghapus data anggota dpr
    public void hapus(Dpr data[], int n)
    {
        int cari = 0, flag = 0;
        clearScreen();
        tampil(data, n);
        //input user
        System.out.println("+------------------------+");
        System.out.println("| Hapus Data Anggota DPR |");
        System.out.println("+------------------------+");

        System.out.print("Masukkan ID DPR yang ingin dihapus : ");
        try 
        {
            cari = scanner.nextInt();    
        } 
        catch (Exception e) 
        {
            System.out.println("Input tidak sesuai!");
        }

        for (int i = 0; i < n; i++) 
        {
            //kalau yang dicari ada
            if (cari == data[i].getId()) 
            {
                for (int j = 0; j < n; j++) 
                {
                    data[j] = data[j+1];
                }
                n--;
                System.out.println("\nData berhasil dihapus!");
                flag = 1;
                break;
            }   
        }
        if (flag != 1) 
        {
            System.out.println("\nID tidak ditemukan!");
        }
    }
    //membersihkan layar
    public void clearScreen()
    {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    //buat garis tabel biar sesuai input
    public void garisTabel(int a, int b, int c, int d)
    {
        System.out.print("+-");
        for (int i = 0; i < a; i++) 
        {
            System.out.print("-");
        }
        System.out.print("-+-");
        for (int i = 0; i < b; i++) 
        {
            System.out.print("-");
        }
        System.out.print("-+-");
        for (int i = 0; i < c; i++) 
        {
            System.out.print("-");
        }
        System.out.print("-+-");
        for (int i = 0; i < d; i++) 
        {
            System.out.print("-");
        }
        System.out.println("-+");
    }
}
