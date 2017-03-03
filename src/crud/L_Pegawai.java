
package crud;

public class L_Pegawai {
    private String kodepagawai,namapegawai,jeniskelamin, alamat, nopenduduk, status;

    public void setKodePegawai(String kodepagawai){
        this.kodepagawai = kodepagawai;
    }

    public String getKodePegawai(){
        return this.kodepagawai;
    }

    public void setNamaPegawai(String namapegawai){
        this.namapegawai = namapegawai;
    }

    public String getNamaPegawai(){
        return this.namapegawai;
    }

    public void setJenisKelamin(String jeniskelamin){
        this.jeniskelamin = jeniskelamin;
    }

    public String getJenisKelamin(){
        return this.jeniskelamin;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getNopenduduk() {
        return nopenduduk;
    }

    public void setNopenduduk(String nopenduduk) {
        this.nopenduduk = nopenduduk;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    
}
