"""""
Saya Sabila Rosad NIM 2106000 mengerjakan latihan 1
dalam mata kuliah Desain Pemrograman Berorientasi Objek
untuk keberkahanNya maka saya tidak melakukan
kecurangan seperti yang telah dispesifikasikan
"""""
#library
import os
#deklarasi class
class Dpr:

    #constructor
    def __init__(self, n = 0, nama = "", nbidang = "", npartai = ""):
        self.id = n             #id dpr
        self.nama = nama        #nama dpr
        self.nbidang = nbidang  #nama bidang dpr
        self.npartai = npartai  #nama partau
    
    #methods
    def tambah(self): #menambahkan data anggota
        os.system('cls' if os.name == 'nt' else 'clear')
        print("+------------------------------+")
        print("| Menambahkan Data Aggota Baru |")
        print("+------------------------------+")

        self.id = int(input("Masukkan ID Anggota DPR           : "))
        self.nama = input("Masukkan Nama Anggota DPR           : ")
        self.nbidang = input("Masukkan Nama Bidang Anggota DPR : ")
        self.npartai = input("Masukkan Nama Partai Anggota DPR : ")

        print("\nData berhasil ditambahkan!")

    def tampil(self, data, n): #menampilkan data anggota dengan tabel
        #penanda kata terpanjang
        temp = 2
        longestId = 0
        longestNama = 4
        longestNbidang = 11
        longestNpartai = 11

        os.system('cls' if os.name == 'nt' else 'clear')
        
        if n > 0: #kalau data ada isinya
            for i in range(n):  #cari kata terpanjang
                if data[i].id > temp:   
                    temp = data[i].id
                    longestId = temp - data[i].id
                if len(data[i].nama) > longestNama:
                    longestNama = len(data[i].nama)
                if len(data[i].nbidang) > longestNbidang:
                    longestNbidang = len(data[i].nbidang)
                if len(data[i].npartai) > longestNpartai:
                    longestNpartai = len(data[i].npartai)
            #print tabel beserta isinya
            self.garisTabel(longestId + 2, longestNama + 2, longestNbidang + 1, longestNpartai + 1)
            print("| ID", "| Nama ", " " * (longestNama - 4), "| Nama Bidang", " " * (longestNbidang - 11), "| Nama Partai", " " * (longestNpartai - 11), "|")
            self.garisTabel(longestId + 2, longestNama + 2, longestNbidang + 1, longestNpartai + 1)

            for i in range(n):
                #kalau si id kurang dari 10 (beda spasi aja)
                if data[i].id < 10: 
                    print(f"| {data[i].id}", " " * ((longestId - len(str(data[i].id))) - 1), f"| {data[i].nama} ", " " * (longestNama - len(data[i].nama)), f"| {data[i].nbidang}", " " * (longestNbidang - len(data[i].nbidang)), f"| {data[i].npartai}", " " * (longestNpartai - len(data[i].npartai)), "|")
                else:
                    print(f"| {data[i].id}", f"| {data[i].nama} ", " " * (longestNama - len(data[i].nama)), f"| {data[i].nbidang}", " " * (longestNbidang - len(data[i].nbidang)), f"| {data[i].npartai}", " " * (longestNpartai - len(data[i].npartai)), "|")
                    
            self.garisTabel(longestId + 2, longestNama + 2, longestNbidang + 1, longestNpartai + 1)
        else:
            #kalau datanya kosong
            print("+-------------------+")
            print("| Data masih kosong |")
            print("+-------------------+")
    
    def ubah(self, data, n): #untuk mengubah data anggota
        
        cari = 0 
        flag = 0
        os.system('cls' if os.name == 'nt' else 'clear')
        temp = Dpr()
        temp.tampil(data, n)
        #input user
        print("+-----------------------+")
        print("| Ubah Data Anggota DPR |")
        print("+-----------------------+")
        cari = int(input("Masukkan ID DPR yang ingin diubah : "))
        #proses pengubahan
        for i in range(n):
            if cari == data[i].id:
                data[i].nama = input("Masukkan Nama Anggota DPR : ") 
                data[i].nbidang = input("Masukkan Nama Bidang Anggota DPR : ") 
                data[i].npartai = input("Masukkan Nama Partai Anggota DPR : ") 

                print("\nData berhasil diubah!")
                flag = 1
                return
        #kalau gada
        if flag != 1:
            print("\nID tidak ditemukan!")
    
    def hapus(self, data, n): #mengahpus data anggota dpr
        cari = 0 
        flag = 0
        os.system('cls' if os.name == 'nt' else 'clear')
        temp = Dpr()
        temp.tampil(data, n)
        #input user
        print("+------------------------+")
        print("| Hapus Data Anggota DPR |")
        print("+------------------------+")
        cari = int(input("Masukkan ID DPR yang ingin diubah : "))
        #proses penghapusan
        for i in range(n): 
            if cari == data[i].id:
                for j in range(i, n-1):
                    data[j] = data[j+1]
                print("\nData berhasil dihapus!") 
                flag = 1
                return
        #kalau gada    
        if flag != 1:
            print("\nID tidak ditemukan!")
    #bikin garis tabel
    def garisTabel(self, a, b, c, d):
        print(f"+-{'-' * a}-+-{'-' * b}-+-{'-' * c}-+-{'-' * d}-+")

    
