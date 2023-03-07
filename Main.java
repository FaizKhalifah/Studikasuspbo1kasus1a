public class Main {
    public static void main(String[] args) {
        Karyawan karyawan1 = new Karyawan();
        karyawan1.setNama("Yasin");
        karyawan1.setAlamat("Duren Sawit");
        karyawan1.setNoTelepon("0892828292");
        karyawan1.setJenisKelamin("Laki laki");
        karyawan1.setKategoriKaryawan("groomer");
        karyawan1.setPendapatan(90);
        karyawan1.cetakInfo();

        Karyawan karyawan2 = new Karyawan("Ravi","Sleman","09898998","laki laki","dokter hewan", 100);
        karyawan2.cetakInfo();
    }
}