package BT;
import java.util.ArrayList;
public interface IQuanLySach {
    ArrayList<Sach> getdanhSach();
    public void themSach(Sach s);
    public void xoaSach(String maSach);
    public Sach timSachTheoMa(String mat);
    public Boolean capNhatSach(Sach s);
    public void hienThiTatCa();
}

