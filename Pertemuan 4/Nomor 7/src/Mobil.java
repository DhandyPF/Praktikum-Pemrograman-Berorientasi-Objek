public class Mobil {
    private String merek;
    private int roda;
    private int kursi;
    private int transmisi;

    public Mobil(String merek, int roda, int kursi, int transmisi) {
        this.merek = merek;
        this.roda = roda;
        this.kursi = kursi;
        this.transmisi = transmisi;
    }

    public String getMerek() {
        return merek;
    }

    public void setMerek(String merek) {
        this.merek = merek;
    }

    public int getRoda() {
        return roda;
    }

    public void setRoda(int roda) {
        this.roda = roda;
    }

    public int getKursi() {
        return kursi;
    }

    public void setKursi(int kursi) {
        this.kursi = kursi;
    }

    public int getTransmisi() {
        return transmisi;
    }

    public void setTransmisi(int transmisi) {
        this.transmisi = transmisi;
    }
}