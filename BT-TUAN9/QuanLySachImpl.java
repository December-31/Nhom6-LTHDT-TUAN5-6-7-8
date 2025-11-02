import java.util.ArrayList;
import java.util.List;
public class QuanLySachImpl implements IQuanLySach,IQuanLyKho
{
    private List<Sach> danhSach = new ArrayList<>();
    @Override
    public void themSach(Sach sach)
    {
        danhSach.add(sach);
    }
    @Override
    public boolean capNhatSach(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong)
    {
        for(Sach sach:danhSach)
        {
            if(sach.getmaSach().equalsIgnoreCase(maSach))
            {
                sach.settieuDe(tieuDe);
                sach.settacGia(tacGia);
                sach.setnamXuatBan(namXuatBan);
                sach.setsoLuong(soLuong);
                return true;
            }
        }
        return false;
    } 
    @Override
    public Sach timKiemSach(String maSach)
    {
        for(Sach sach:danhSach)
        {
            if (sach.getmaSach().equalsIgnoreCase(maSach))
            {
                return sach;
            }
        }
        return null;
    }
    @Override
    public boolean xoaSach(String maSach)
    {
        for (int i = 0; i < danhSach.size(); i++) 
        {
            if (danhSach.get(i).getmaSach().equalsIgnoreCase(maSach)) 
            {
                danhSach.remove(i);
                return true;
            }
        }
        return false;
    } 
    @Override
    public boolean nhapKho(String maSach, int soLuongNhap)
    {
        for (Sach s : danhSach)
            if (s.getmaSach().equalsIgnoreCase(maSach)) 
            {
                s.setsoLuong(s.getsoLuong() + soLuongNhap);
                return true;
            }
        return false; 
    }
    @Override
    public int xuatKho(String maSach, int soLuongXuat)
    {
        for (Sach s : danhSach) 
        if (s.getmaSach().equalsIgnoreCase(maSach))
            if (s.getsoLuong() >= soLuongXuat) 
            {
                s.setsoLuong(s.getsoLuong() - soLuongXuat);
                return s.getsoLuong();
            } 
            else
                return -1;
        return -1;
    }
    @Override
    public int kiemTraSoLuong(String maSach)
    {
        for (Sach s : danhSach)
            if (s.getmaSach().equalsIgnoreCase(maSach))
                return s.getsoLuong();
        return -1;
    }
    @Override
    public List<Sach> hienThiDanhSach()
    {
        return danhSach;
    }
}
