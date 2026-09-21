public class PersegiPanjang extends Bentuk2D {
    private int panjang;
    private int lebar;
    private int keliling;
    private double luas;

    public PersegiPanjang(int panjang, int lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public void cetakLuas() {
        luas = panjang * lebar;
        System.out.println("Luas Persegi Panjang = " + luas);
    }

    public void cetakKeliling() {
        keliling = 2 * (panjang + lebar);
        System.out.println("Keliling Persegi Panjang = " + keliling);
    }
}
