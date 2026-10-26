public class Main {
    static void main() {
        BujurSangkar kotak = new BujurSangkar(4);
        PersegiPanjang kotakPanjang = new PersegiPanjang(4, 2);
        kotak.cetakLuas();
        kotak.cetakKeliling();
        kotakPanjang.cetakLuas();
        kotakPanjang.cetakKeliling();
    }
}
