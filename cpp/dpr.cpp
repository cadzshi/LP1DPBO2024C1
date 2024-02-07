/*
Saya Sabila Rosad NIM 2106000 mengerjakan latihan 1
dalam mata kuliah Desain Pemrograman Berorientasi Objek
untuk keberkahanNya maka saya tidak melakukan
kecurangan seperti yang telah dispesifikasikan
*/

//library
#include <iostream>
#include <string>

using namespace std;

//deklarasi class
class Dpr
{
    private:
        int id;         //id dpr
        string nama;    //nama dpr
        string nbidang; //nama bidang dpr
        string npartai; //nama partai dpr
    
    public:
        //constructor
        Dpr()
        {
            this->id = 0;
            this->nama = "";
            this->nbidang = "";
            this->npartai = "";
        }
        Dpr(int n, string nama, string nbidang, string npartai)
        {
            this->id = n;
            this->nama = nama;
            this->nbidang = nbidang;
            this->npartai = npartai;
        }

        //setter
        void setId(int n)
        {
            this->id = n;
        }
        void setNama(string nama)
        {
            this->nama = nama;
        }
        void setNbidang(string nbidang)
        {
            this->nbidang = nbidang;
        }
        void setNpartai(string npartai)
        {
            this->npartai = npartai;
        }

        //getter
        int getId()
        {
            return this->id;
        }
        string getNama()
        {
            return this->nama;
        }
        string getNbidang()
        {
            return this->nbidang;
        }
        string getNpartai()
        {
            return this->npartai;
        }

        //methods
        //menambahkan data anggota dpr
        void tambah()
        {
            system("cls");
            cout << "= = = = Menambahkan Data Baru = = = =" << endl;
            cout << "Masukkan ID Anggota DPR          : ";  
            cin >> this->id;
            cout << "Masukkan Nama Anggota DPR        : ";
            cin >> this->nama;
            cout << "Masukkan Nama Bidang Anggota DPR : ";
            cin >> this->nbidang;
            cout << "Masukkan Nama Partai Anggota DPR : ";
            cin >> this->npartai;
            cout << "\nData berhasil ditambahkan!" << endl;
            cout << "= = = = = = = = = = = = = = = = = = =\n" << endl;
        }

        //menampilkan data anggota dpr
        void tampil(Dpr data[], int n)
        {
            system("cls");
            cout << "= = =  = List Anggota DPR = = = =" << endl;
            
            if (n == 0) //kalau datanya kosong
            {
                cout << "Kosong brok...\n" << endl;
            }
            else        //kalo ngga tampilin datanya
            {
                for (int i = 0; i < n; i++) 
                {
                    cout << "=================================" << endl;
                    cout << "ID Anggota          : " << data[i].id << endl;
                    cout << "Nama Anggota        : " << data[i].nama << endl;
                    cout << "Nama Bidang Anggota : " << data[i].nbidang << endl;
                    cout << "Nama Partai Anggota : " << data[i].npartai << endl;                  
                    cout << "=================================\n" << endl;
                }
            }
        }

        //update data anggota dpr
        void ubah(Dpr data[], int n)
        {
            system("cls");
            tampil(data, n);

            int cari, flag = 0;
            //input user 
            cout << "= = = Update Data Anggota DPR = = =" << endl;
            cout << "Masukkan ID DPR yang akan diubah : ";
            cin >> cari;
            //update setiap atribut
            for (int i = 0; i < n; i++)
            {   
                //kalau data id sama dengan yg dicari
                if (cari == data[i].getId())
                {
                    cout << "\n";
                    cout << "Masukkan Nama Anggota DPR        : ";
                    cin >> data[i].nama;
                    cout << "Masukkan Nama Bidang Anggota DPR : ";
                    cin >> data[i].nbidang;
                    cout << "Masukkan Nama Partai Anggota DPR : ";
                    cin >> data[i].npartai;
                    cout << "\nData berhasil diubah!" << endl;
                    //flag menjadi 1
                    flag = 1;
                    break;
                }
            }
            //kalau flag != 1 maka
            if (flag != 1)
            {
                cout << "\nID tidak ditemukan!" << endl;
            }
            cout << "= = = = = = = = = = = = = = = = = =\n" << endl;
        }

        //mengahpus data anggota dpr
        void hapus(Dpr data[], int &n)
        {
            system("cls");
            tampil(data, n);

            int cari, flag = 0;
            //input user
            cout << "= = = = = = Hapus data Anggota DPR = = = = = =" << endl;
            cout << "Masukkan ID Anggota DPR yang ingin dihapus : ";
            cin >> cari;
            //hapus semua atribut
            for (int i = 0; i < n; i++)
            {
                //kalau data id sama dengan yang dicari
                if (cari == data[i].getId())
                {
                    for (int j = i; j < n; j++)
                    {
                        data[j] = data[j+1];
                    }
                    n--;

                    cout << "\nData berhasil dihapus!" << endl;
                    //flag menjadi 1
                    flag = 1;   
                    break;
                }
            }
            //selain 1 maka
            if (flag != 1)
            {
                cout << "\nID tidak ditemukan!" << endl;
            }
            cout << "= = = = = = = = = = = = = = = = = = = = = = = =" << endl;
        }
        //destructors
        ~Dpr()
        {

        }
};
