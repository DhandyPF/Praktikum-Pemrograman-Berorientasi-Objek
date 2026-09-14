public class Sepeda {
    public int pedal;
    public int gear;
    public int kecepatan;
    private int standar;

    public Sepeda() {
    }

    public Sepeda(int pedal, int gear, int kecepatan) {
        this.pedal = pedal;
        this.gear = gear;
        this.kecepatan = kecepatan;
    }

    public void remSepeda(int nilaiPengereman) {
        this.kecepatan -= nilaiPengereman;
    }

    public void tambahKecepatan(int nilaiTambah) {
        this.kecepatan += nilaiTambah;
    }

    public int getStandar() {
        return standar;
    }

    public void setStandar(int standar) {
        this.standar = standar;
    }
}