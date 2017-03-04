
package crud.DataAdapter;

import crud.DataProvider.TidakMampu_Provider;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class Data_Adapter extends AbstractTableModel {
    private List<TidakMampu_Provider> list;

    public Data_Adapter(List<TidakMampu_Provider> list) {
        this.list = list;
    }

    public int getRowCount() {
        return list.size();
    }

    public int getColumnCount() {
        return 7;
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
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
                return list.get(rowIndex).getJenisKelamin();//Jenis Kelamin
                
            default:
                return null;
        }
    }
    
    /***
     * 
     * Pastikan jumlah kolom sesuai dengan database dan getColumCount
     * 
     */
    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "NIK";
            case 1:
                return "Nama Lengkap";
            case 2:
                return "Tempat Lahir";
            case 3 :
                return "Tanggal Lahir";
            case 4 :
                return "Agama";
            case 5 :
                return "Pekerjaan";
            case 6 :
                return "Jenis Kelamin";
                
            default:
                return null;
        }
    }
}
