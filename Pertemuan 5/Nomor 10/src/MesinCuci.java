public class MesinCuci extends SuatuMesin {
    public MesinCuci(String nama) {
        super(nama);
    }

    public void hidupkanMesin() {
        if (isHidup()) {
            System.out.println(getNama() + " Sudah Hidup");
        } else {
            setHidup(true);
            System.out.println(getNama() + " Dihidupkan");
        }
    }

    public void matikanMesin() {
        if (isHidup()) {
            setHidup(false);
            System.out.println(getNama() + " Dimatikan");
        } else {
            setHidup(true);
            System.out.println(getNama() + " Keadaan Mati");
        }
    }
}
