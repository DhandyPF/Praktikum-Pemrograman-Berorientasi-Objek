public class Televisi {
    private int Channel;

    public Televisi(String Merk, String Harga){
        System.out.println("Televisi " + Merk + " Harga " + Harga);
    }

    void hidupkanTV() {
        System.out.println("Televisi Hidup");
    }

    void matikanTV(){
        System.out.println("Televisi Mati");
    }

    void informasiTV(){
    }

    public int getChannel() {
        return Channel;
    }

    public void setChannel(int Channel) {
        this.Channel = Channel;
    }
}
