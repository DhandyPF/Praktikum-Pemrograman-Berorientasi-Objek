public class Main {
    public static void main(String[] args) {
        SepedaGunung poligon = new SepedaGunung();
        poligon.gear = 1;
        poligon.pedal = 2;
        poligon.kecepatan = 40;
        poligon.setLampu(1);
        poligon.setShockbreaker(2);
        poligon.setTempatMinum(1);

        System.out.println("Jumlah gear: " + poligon.gear +
                ", Jumlah Pedal: " + poligon.pedal +
                ", kecepatan: " + poligon.kecepatan +
                ", Lampu: " + poligon.getLampu() +
                ", Shockbreaker: " + poligon.getShockbreaker());
    }
}