import java.util.ArrayList;
public class QuanLySachImpl implements IQuanLySach
{
    private final ArrayList<Sach> danhSach;
    public QuanLySachImpl() 
    {
        this.danhSach = new ArrayList<>();
    }
    public ArrayList<Sach> getdanhSach() 
    {
        return danhSach;
    }
    public Sach timKiemSach(String maSach) 
    {
        for (Sach sach:danhSach) 
            if (sach.getmaSach().equalsIgnoreCase(maSach)) 
                return sach;
        return null;
    }
    public void kquaTimKiem(String maSach)
    {
        if (timKiemSach(maSach)==null)
            System.out.println("Khong tim thay ma sach "+maSach+"");
        else
        {
            System.out.println("Tim thay ma sach "+maSach+":");
            System.out.println(timKiemSach(maSach).toString());
        }
    }
    public Sach themSach(Sach sach) 
    {
        if (timKiemSach(sach.getmaSach())!= null) 
        {
            return null;
        }
        this.danhSach.add(sach);
        return sach;
        
    }
    public Sach capNhat(String maSach,Sach sachMoi)
    {
        Sach sachCapNhat=timKiemSach(maSach);
        if (sachCapNhat!=null)
        {
            sachCapNhat.settieuDe(sachMoi.gettieuDe());
            sachCapNhat.settacGia(sachMoi.gettacGia());
            sachCapNhat.setnamXuatBan(sachMoi.getnamXuatBan());
            sachCapNhat.setsoLuong(sachMoi.getsoLuong());
            sachCapNhat.setviTri(sachMoi.getviTri());
            sachCapNhat.setgiaCoBan(sachMoi.getgiaCoBan());
            if (sachCapNhat instanceof SachTieuThuyet && sachMoi instanceof SachTieuThuyet)
            {
                SachTieuThuyet s1=(SachTieuThuyet) sachCapNhat;
                SachTieuThuyet s2=(SachTieuThuyet) sachMoi;
                s1.setTheLoai(s2.getTheLoai());
                s1.setLaSachSeries(s2.isLaSachSeries());
            }
            else 
                if (sachCapNhat instanceof SachGiaoTrinh && sachMoi instanceof SachGiaoTrinh) 
                {
                    SachGiaoTrinh s1=(SachGiaoTrinh) sachCapNhat;
                    SachGiaoTrinh s2=(SachGiaoTrinh) sachMoi;
                    s1.setMonHoc(s2.getMonHoc());
                    s1.setCapDo(s2.getCapDo());
                }
            return sachMoi;
        }
        return null;
    }
    public Sach xoaSach(String maSach) 
    {
        Sach sachXoa = timKiemSach(maSach);
        if (sachXoa != null) 
        {
            danhSach.remove(sachXoa);
            return sachXoa;
        } 
        return null;
    }
    public void hienThiDanhSach() 
    {
        if (danhSach.size()==0) 
        {
            System.out.println("Danh sach rong vui long them sach!");
            System.out.println("--------------------------------------------------");
        }
        else
        {
            System.out.println("---Danh sach hien co ("+danhSach.size()+" cuon)---");
            for (int i=0;i<danhSach.size();i++)
                System.out.println((i+1)+"."+danhSach.get(i).toString());
            System.out.println("--------------------------------------------------");
        }
    }
}