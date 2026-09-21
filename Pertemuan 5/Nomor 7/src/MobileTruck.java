public class MobileTruck extends Mobil {
    private int bakPasir;
    private int gandengan;

    public MobileTruck(String merek, int roda, int kursi, int transmisi, int bakPasir, int gandengan) {
        super(merek, roda, kursi, transmisi);
        this.bakPasir = bakPasir;
        this.gandengan = gandengan;
    }

    public int getBakPasir() {
        return bakPasir;
    }

    public void setBakPasir(int bakPasir) {
        this.bakPasir = bakPasir;
    }

    public int getGandengan() {
        return gandengan;
    }

    public void setGandengan(int gandengan) {
        this.gandengan = gandengan;
    }

    public void tampilkanTruck() {
        System.out.println("mobil dengan merek: " + getMerek());
        System.out.println("mempunyai roda: " + getRoda());
        System.out.println("transmisi: " + getTransmisi());
        System.out.println("dilengkapi bak pasir: " + bakPasir);
        System.out.println("dilengkapi gandengan: " + gandengan);
    }
}