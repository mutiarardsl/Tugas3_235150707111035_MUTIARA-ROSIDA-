public class PegawaiHarian extends Pegawai{
    private double upahPerJam;
    private int totalJam;

    public PegawaiHarian(String nama, String noKTP, double upahPerJam, int totalJam) {
        super(nama, noKTP);
        this.upahPerJam = upahPerJam;
        this.totalJam = totalJam;
    }

    public double getUpahPerJam() {
        return upahPerJam;
    }

    public int getTotalJam() {
        return totalJam;
    }

    public double gaji() {
        if (totalJam <= 40) {
            return upahPerJam * totalJam;
        } else {
            int normalJam = 40;
            int overtimeJam = totalJam - normalJam;
            return (upahPerJam * normalJam) + (overtimeJam * upahPerJam * 1.5);
        }
    }

}
