public class Main {
    public static void main(String[] args) {
        Televisi tvFlat = new  Televisi("Sharp", "3 Juta");
        tvFlat.informasiTV();
        tvFlat.hidupkanTV();
        tvFlat.setChannel(1);
        System.out.println("Televisi diset pada channel : " + tvFlat.getChannel());
        tvFlat.matikanTV();
    }
}
