package models.user;

public class Dosen extends User {
    private String nidn;

    public Dosen(String nama, String nidn) {
        super(nama);
        this.nidn = nidn;
    }

    @Override
    public void info() {
        System.out.println("[Dosen] " + nama + " | NIDN: " + nidn);
    }
}
