
package crud;

import java.util.List;
import javax.swing.table.AbstractTableModel;

public class TmodelPegawai extends AbstractTableModel {
    private List<L_Pegawai> list;

    public TmodelPegawai(List<L_Pegawai> list) {
        this.list = list;
    }

    public int getRowCount() {
        return list.size();
    }

    public int getColumnCount() {
        return 6;
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return list.get(rowIndex).getKodePegawai();
            case 1:
                return list.get(rowIndex).getNamaPegawai();
            case 2:
                return list.get(rowIndex).getJenisKelamin();
            case 3:
                return list.get(rowIndex).getAlamat();
            case 4:
                return list.get(rowIndex).getNopenduduk();
            case 5:
                return list.get(rowIndex).getStatus();
                
            default:
                return null;
        }
    }
    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "Kode Pegawai";
            case 1:
                return "Nama Pegawai";
            case 2:
                return "Jenis Kelamin";
            case 3 :
                return "Alamat";
            case 4 :
                return "No Penduduk";
            case 5 :
                return "Status";
            default:
                return null;
        }
    }
}
