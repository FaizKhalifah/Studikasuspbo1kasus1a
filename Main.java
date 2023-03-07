public class Main {
    public static void main(String[] args) {
          Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        input.nextLine();
        Karyawan[] listkaryawan = new Karyawan[a];
        for (int i =0;i<a;i++){
            String nama= input.nextLine();
            String alamat = input.nextLine();
            String noTelepon = input.nextLine();
            String jenisKelamin = input.nextLine();
            String kategori = input.nextLine();
            double pendapatan = input.nextDouble();
            input.nextLine();
            listkaryawan[i] = new Karyawan(nama,alamat,noTelepon,jenisKelamin,kategori,pendapatan);
            listkaryawan[i].cetakInfo();
        }
    }
}
