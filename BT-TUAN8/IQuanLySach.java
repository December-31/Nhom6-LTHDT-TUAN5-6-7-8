import java.util.List;
public interface IQuanLySach 
{
    public void themSach(Sach sach); 
    public boolean capNhatSach(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong);
    public Sach timKiemSach(String maSach);         
    public boolean xoaSach(String maSach);
    public List<Sach> hienThiDanhSach();
}