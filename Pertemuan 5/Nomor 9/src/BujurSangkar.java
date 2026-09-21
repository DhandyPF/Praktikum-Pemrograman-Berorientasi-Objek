public class BujurSangkar extends Bentuk2D {
    private int sisi;
    private int luas;
    private int keliling;

    public BujurSangkar(int sisi) {
        this.sisi = sisi;
    }

    public void cetakLuas() {
        luas = sisi * sisi;
        System.out.println("Luas Bujur Sangkar adalah = " + luas);
    }

    public void cetakKeliling() {
        keliling = 4 * sisi;
        System.out.println("Keliling Bujur Sangkar = " + keliling);
    }
}
