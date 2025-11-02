import java.util.ArrayList;
public interface IQuanLySach 
{
    ArrayList<Sach> getdanhSach();
    Sach themSach(Sach sach);
    Sach timKiemSach(String maSach);
    void kquaTimKiem(String maSach);
    boolean xoaSach(String maSach);
    Sach capNhat(String maSach, Sach sachMoi);
    void hienThiDanhSach();
}
