package crud.DataAdapter;

import crud.DataProvider.Data_Provider;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class Data_Adapter extends AbstractTableModel {

    private List<Data_Provider> list;

    public Data_Adapter(List<Data_Provider> list) {
        this.list = list;
    }

    public int getRowCount() {
        return list.size();
    }

    public int getColumnCount() {
        return 16;
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            //`nik`, `namalengkap`, `tempatlahir`, `tanggallahir`, `agama`, `pekerjaan`, `pendidikan`, `alamat`, `rt`, `rw`, `jeniskelamin`, `statuskawin`, `namaayah`, `namaibu`, `goldarah`, 'warganegara'
            case 0:
                return list.get(rowIndex).getNomorIndukKependudukan();//NIK
            case 1:
                return list.get(rowIndex).getNamaWarga();//Nama Lengkap
            case 2:
                return list.get(rowIndex).getTempatLahir();//Tempat Lahir
            case 3:
                return list.get(rowIndex).getTanggalLahir();//Tanggal Lahir
            case 4:
                return list.get(rowIndex).getAgama();//Agama
            case 5:
                return list.get(rowIndex).getPekerjaanWarga();//Pekerjaan
            case 6:
                return list.get(rowIndex).getPendidikan();//Pendidikan
            case 7:
                return list.get(rowIndex).getAlamat();//Alamat  
            case 8:
                return list.get(rowIndex).getRt();//Rt
            case 9:
                return list.get(rowIndex).getRw();//Rw
            case 10:
                return list.get(rowIndex).getJenisKelamin();//Jenis Kelamin
            case 11:
                return list.get(rowIndex).getStatuskawin();//Status Kawin
            case 12:
                return list.get(rowIndex).getNamaayah();//Pendidikan
            case 13:
                return list.get(rowIndex).getNamaibu();//Pendidikan
            case 14:
                return list.get(rowIndex).getGoldarah();//Golongan Darah
            case 15:
                return list.get(rowIndex).getWarganegara();//Warga Negara
            default:
                return null;
        }
    }

    /**
     * *
     *
     * Pastikan jumlah kolom sesuai dengan database dan getColumCount
     *
     */
    @Override
    public String getColumnName(int column) {
        switch (column) {

            //`nik`, `namalengkap`, `tempatlahir`, `tanggallahir`, `agama`, `pekerjaan`, `pendidikan`, `alamat`
            //`rt`, `rw`, `jeniskelamin`, `statuskawin`, `namaayah`, `namaibu`, `goldarah`, 'warganegara'
            case 0:
                return "NIK";
            case 1:
                return "Nama Lengkap";
            case 2:
                return "Tempat Lahir";
            case 3:
                return "Tanggal Lahir";
            case 4:
                return "Agama";
            case 5:
                return "Pekerjaan";
            case 6:
                return "Pendidikan";
            case 7:
                return "Alamat";
            case 8:
                return "Rt";
            case 9:
                return "Rw";
            case 10:
                return "Jenis Kelamin";
            case 11:
                return "Status Kawin";
            case 12:
                return "Nama Ayah";
            case 13:
                return "Nama Ibu";
            case 14:
                return "Golongan Darah";
            case 15:
                return "Warga Negara";
            default:
                return null;
        }
    }
}
