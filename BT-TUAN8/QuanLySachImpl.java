import java.util.ArrayList;
import java.util.List;
public class QuanLySachImpl implements IQuanLySach
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
    public List<Sach> hienThiDanhSach()
    {
        return danhSach;
    }
}
