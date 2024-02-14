<?php
/* 
Saya Sabila Rosad NIM 2106000 mengerjakan latihan 1
dalam mata kuliah Desain Pemrograman Berorientasi Objek
untuk keberkahanNya maka saya tidak melakukan
kecurangan seperti yang telah dispesifikasikan 
*/

//deklarasi class
class Dpr
{
    //private atribut
    private $id;
    private $nama;
    private $nbidang;
    private $npartai;
    private $foto;

    //constructor
    public function __construct($id = 0, $nama = '', $nbidang = '', $npartai = '', $foto = '')
    {
        $this->id = $id;
        $this->nama = $nama;
        $this->nbidang = $nbidang;
        $this->npartai = $npartai;
        $this->foto = $foto;
    }

    //setter
    public function setId($id)
    {
        $this->id = $id;
    }
    public function setNama($nama)
    {
        $this->nama = $nama;
    }
    public function setNbidang($nbidang)
    {
        $this->nbidang = $nbidang;
    }
    public function setNpartai($npartai)
    {
        $this->npartai = $npartai;
    }
    public function setFoto($foto)
    {
        $this->foto = $foto;
    }

    //getter
    public function getId()
    {
        return $this->id;
    }
    public function getNama()
    {
        return $this->nama;
    }
    public function getNbidang()
    {
        return $this->nbidang;
    }
    public function getNpartai()
    {
        return $this->npartai;
    }
    public function getFoto()
    {
        return $this->foto;
    }

    //methods
    public function tampil()
    {
        //instansiasi
        $dpr1 = new Dpr("1", "Ahmad", "Ketua", "PDIP", "dpr.jpg");
        $dpr2 = new Dpr("2", "Wati", "Bendahara", "PKB", "dpr.jpg");
        $dpr3 = new Dpr("3", "Budi", "Anggota", "PAN", "dpr.jpg");
        $dpr4 = new Dpr("4", "Nino", "Anggota", "Demokrat", "dpr.jpg");
        $dpr5 = new Dpr("5", "Rahma", "Wakil", "Gerindra", "dpr.jpg");
        //masukin objek ke array
        $dpr = array($dpr1, $dpr2, $dpr3, $dpr4, $dpr5);

        //output data anggota dpr
        echo "<br> +-----------------------+ <br>";
        echo "| Data Anggota DPR | <br>";
        echo "+-----------------------+ <br>";
        //buat table
        echo "<table>";
        echo "<tr>
                <th>ID</th>
                <th>Nama</th>
                <th>Bidang</th>
                <th>Partai</th>
                <th>Foto</th>
            </tr>";
        //nampilin isinya
        for ($i = 0; $i < 5; $i++) {
            echo "<tr>";
            echo "<td>" . $dpr[$i]->getId() . "</td>";
            echo "<td>" . $dpr[$i]->getNama() . "</td>";
            echo "<td>" . $dpr[$i]->getNbidang() . "</td>";
            echo "<td>" . $dpr[$i]->getNpartai() . "</td>";
            echo "<td><img src='image/dpr.jpg'" . $dpr[$i]->getFoto() . "'></td>";
            echo "</tr>";
        }
        echo "</table>";
        //instansiasi
        $dpr6 = new Dpr("6", "Janggar", "Sekretaris", "PKS", "dpr.jpg");
        //masukin objek baru ke array
        array_push($dpr, $dpr6);
        //output data terbaru
        echo "<br> +---------------------------------+ <br>";
        echo "| Data Anggota DPR Terbaru | <br>";
        echo "+---------------------------------+ <br>";
        //table lagi
        echo "<table>";
        echo "<tr>
                <th>ID</th>
                <th>Nama</th>
                <th>Bidang</th>
                <th>Partai</th>
                <th>Foto</th>
            </tr>";

        for ($i = 0; $i < 6; $i++) {
            echo "<tr>";
            echo "<td>" . $dpr[$i]->getId() . "</td>";
            echo "<td>" . $dpr[$i]->getNama() . "</td>";
            echo "<td>" . $dpr[$i]->getNbidang() . "</td>";
            echo "<td>" . $dpr[$i]->getNpartai() . "</td>";
            echo "<td><img src='image/dpr.jpg'" . $dpr[$i]->getFoto() . "'></td>";
            echo "</tr>";
        }
        echo "</table>";
        //menghapus objek dari array
        array_splice($dpr, 6, 1);
        //output yang telah dihapus
        echo "<br> +----------------------------------------+ <br>";
        echo "| Data Anggota DPR yang Dihapus | <br>";
        echo "+----------------------------------------+ <br>";

        echo "<table>";
        echo "<tr>
                <th>ID</th>
                <th>Nama</th>
                <th>Bidang</th>
                <th>Partai</th>
                <th>Foto</th>
            </tr>";

        for ($i = 0; $i < 5; $i++) {
            echo "<tr>";
            echo "<td>" . $dpr[$i]->getId() . "</td>";
            echo "<td>" . $dpr[$i]->getNama() . "</td>";
            echo "<td>" . $dpr[$i]->getNbidang() . "</td>";
            echo "<td>" . $dpr[$i]->getNpartai() . "</td>";
            echo "<td><img src='image/dpr.jpg'" . $dpr[$i]->getFoto() . "'></td>";
            echo "</tr>";
        }
        echo "</table>";

    }
}
?>