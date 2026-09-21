public class Turunan extends Dasar {
    private int y;

    public Turunan(int x, int y) {
        super(x);
        this.y = y;
    }

    public void tampilkanInformasi() {
        System.out.println("Method dari class turunan");
        System.out.println("Nilai x = " + getX());
        System.out.println("Nilai y = " + y);
    }
}
