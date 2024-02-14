"""""
Saya Sabila Rosad NIM 2106000 mengerjakan latihan 1
dalam mata kuliah Desain Pemrograman Berorientasi Objek
untuk keberkahanNya maka saya tidak melakukan
kecurangan seperti yang telah dispesifikasikan
"""""
#library
from dpr import Dpr
import os

os.system('cls' if os.name == 'nt' else 'clear')
#instansiasi
data = [Dpr() for i in range(99)]
temp = Dpr()
#inisialisasi
menu = 0
n = 0
#selama menu bukan 5 alias exit program
while menu != 5:
    #output
    print("+-------------------------------+")
    print("| Latihan Praktikum DPBO 1 2024 |")
    print("+-------------------------------+")
    print("Pilihan Menu :")
    print("1. Menambahkan Data Anggota DPR")
    print("2. Menampilkan Data Anggota DPR")
    print("3. Mengubah Data Anggota DPR")
    print("4. Menghapus Data Anggota DPR")
    print("5. Keluar dari Program")
    #input user
    menu = int(input("Masukkan menu pilihan : "))
    #kalau 1 tambah data
    if menu == 1:
        temp = Dpr()
        temp.tambah()
        data[n] = temp
        n += 1
    #kalau 2 tampil data
    elif menu == 2:
        temp = Dpr()
        temp.tampil(data, n)
    #kalau 3 ubah data
    elif menu == 3:
        temp = Dpr()
        temp.ubah(data, n)
    #kalau 4 hapus data
    elif menu == 4:
        temp = Dpr()
        temp.hapus(data, n)
        n-= 1

#hapusnya masih eror btw :(