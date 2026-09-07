public class UjiMahasiswa {
    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa("Daplun", "H1L009002");
        mhs1.cetakInformasi();

        Mahasiswa mhs2 = new Mahasiswa("Daplun", "H1L009002", "Purwokerto");
        System.out.println(mhs2.getNama());

        Mahasiswa mhs3 = new Mahasiswa("Daplun", "H1L009002", "Purbalingga");
        mhs3.setAlamat("Semarang");
        System.out.println(mhs3.getAlamat());

        Mahasiswa mhs4 = new Mahasiswa("Daplun", "H1L009002", "Purwokerto");
        mhs4.cetakInformasi();
    }
}
