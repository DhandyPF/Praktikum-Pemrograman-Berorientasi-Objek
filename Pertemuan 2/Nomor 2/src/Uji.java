class Uji {
    private static int x;
    static void main() {
        // Bujur Sangkar
        BujurSangkar bujur = new BujurSangkar();
        x = bujur.hitungLuas(4);
        System.out.println("Luas Bujur Sangkar = " + x);
        x = bujur.hitungKeliling(5);
        System.out.println("Keliling Bujur Sangkar = " + x);

        // Persegi Panjang
        PersegiPanjang persegiPanjang = new PersegiPanjang();
        x = persegiPanjang.hitungLuas(6, 4);
        System.out.println("Luas Persegi Panjang = " + x);
        x = persegiPanjang.hitungKeliling(6, 4);
        System.out.println("Keliling Persegi  Panjang = " + x);
    }
}