public abstract class SuatuMesin {
    private boolean hidup;
    private String nama;
    public abstract void hidupkanMesin();
    public abstract void matikanMesin();

    public SuatuMesin(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public boolean isHidup() {
        return hidup;
    }

    public void setHidup(boolean hidup) {
        this.hidup = hidup;
    }
}
