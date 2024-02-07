/*
Saya Sabila Rosad NIM 2106000 mengerjakan latihan 1
dalam mata kuliah Desain Pemrograman Berorientasi Objek
untuk keberkahanNya maka saya tidak melakukan
kecurangan seperti yang telah dispesifikasikan
*/

//library
#include <bits/stdc++.h>
#include "dpr.cpp"

using namespace std;

int main()
{
    system("cls");

    Dpr data[99];
    int menu, n = 0;

    cout << "Latihan Praktikum DPBO 1 2024\n" << endl;
    do
    {
        //output pilihan menu
        cout << "Pilihan Menu :" << endl;
        cout << "1. Menambahkan data Anggota DPR" << endl;
        cout << "2. Menampilkan data Anggota DPR" << endl;
        cout << "3. Mengubah data Anggota DPR" << endl;
        cout << "4. Menghapus data Anggota DPR" << endl;
        cout << "5. Keluar dari Program" << endl;
        cout << "\n";

        //input user untuk menu diatas
        cout << "Masukkan menu pilihan : ";
        cin >> menu;

        switch (menu)
        {
            //case 1 untuk menambahkan data
            case 1:
                data[n].tambah();
                n++;
                break;
            //case 2 untuk menampilkan semua data
            case 2:
                data->tampil(data, n);
                break;
            //case 3 untuk mengupdate data berdasarkan id
            case 3:
                data->ubah(data, n);
                break;
            case 4:
            //case 4 untuk menghapus data berdasarkan id
                data->hapus(data, n);
                break;
            default:
                break;
        }
    //5 untuk keluar dari program (stop looping)
    } while (menu != 5);
    
    return 0;
}