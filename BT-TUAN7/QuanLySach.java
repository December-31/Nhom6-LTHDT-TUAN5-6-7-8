package BT_TUAN5;
import java.util.ArrayList;
import java.util.Iterator;
public class QuanLySach {
    protected ArrayList<Sach> danhSach;
    public QuanLySach() {
        danhSach = new ArrayList<>();
    }
    public void themSach(Sach s) {
        danhSach.add(s);
    }
public boolean xoaSach(String maSach) {
        Iterator<Sach> iterator = danhSach.iterator();
        while (iterator.hasNext()) {
            Sach s = iterator.next();
            if (s.getMaSach().equalsIgnoreCase(maSach)) {
                iterator.remove();
                return true;
            }
        }
        return false;
    }
 public Sach timSachTheoMa(String maSach) {
        for (Sach s : danhSach) {
            if (s.getMaSach().equalsIgnoreCase(maSach)) {
                return s;
            }
        }
        return null;
    }
    public boolean capNhatSach(String maSach, String MaSach, String TacGia, String TieuDeMoi, int SoLuongMoi, double giaCoBan) {
        Sach s = timSachTheoMa(maSach);
            if (s != null) {
                s.setMaSach(MaSach);
                s.setTacGia(TacGia);
                s.setTieuDe(TieuDeMoi);
                s.setSoLuong(SoLuongMoi);  
                s.setgiaCoBan(giaCoBan);
                return true;
            }
        return false;
    }
   
    public void hienThiTatCa() {
        for (Sach s : danhSach) {
            System.out.println(s.toString());
        }
    }
}
