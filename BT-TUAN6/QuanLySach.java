
import java.util.ArrayList;
import java.util.List;

public class QuanLySach {

    private List<Sach> danhSach = new ArrayList<>();

    public void themSach(Sach s) {
        danhSach.add(s);
    }

    public boolean xoaSach(String ma) {
        for (Sach s : danhSach) {
            if (s.getmaSach().equalsIgnoreCase(ma)) {
                danhSach.remove(s);
                return true;
            }
        }
        return false;
    }

    public boolean capNhatSach(String ma, String tenMoi, String tacGiaMoi, int nam, int sl) {
        for (Sach s : danhSach) {
            if (s.getmaSach().equalsIgnoreCase(ma)) {
                s.settieuDe(tenMoi);
                s.settacGia(tacGiaMoi);
                s.setnamXuatBan(nam);
                s.setsoLuong(sl);
                return true;
            }
        }
        return false;
    }

    public Sach timKiemTheoMa(String ma) {
        for (Sach s : danhSach) {
            if (s.getmaSach().equalsIgnoreCase(ma)) {
                return s;
            }
        }
        return null;
    }

    public void hienThiDanhSach() {
        if (danhSach.isEmpty()) {
            System.out.println("Danh sách rỗng!");
            return;
        }

        System.out.println("\n=== DANH SÁCH SÁCH ===");
        for (Sach s : danhSach) {
            System.out.println(s.toString());
        }
    }
}
