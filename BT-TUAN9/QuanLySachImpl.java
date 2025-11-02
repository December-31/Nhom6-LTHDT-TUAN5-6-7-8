import java.util.ArrayList;
public class QuanLySachImpl implements IQuanLySach,IQuanLyKho
{
    private final ArrayList<Sach> danhSach;
    public QuanLySachImpl() 
    {
        this.danhSach = new ArrayList<>();
    }
    @Override
    public ArrayList<Sach> getdanhSach() 
    {
        return danhSach;
    }
    @Override
    public Sach timKiemSach(String maSach) 
    {
        for (Sach sach:danhSach) 
            if (sach.getmaSach().equalsIgnoreCase(maSach)) 
                return sach;
        return null;
    }
    @Override
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
    @Override
    public Sach themSach(Sach sach) 
    {
        if (timKiemSach(sach.getmaSach())!= null) 
        {
            return null;
        }
        this.danhSach.add(sach);
        return sach;
        
    }
    @Override
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
    @Override
    public boolean xoaSach(String maSach) 
    {
        Sach sachXoa = timKiemSach(maSach);
        if (sachXoa != null) 
        {
            danhSach.remove(sachXoa);
            return true;
        } 
        return false;
    }
    @Override
    public boolean nhapKho(String maSach, int soLuongNhap)
    {
        Sach sach = timKiemSach(maSach);
        if (sach == null) 
        {
            return false;
        }
        if (soLuongNhap <= 0) 
        {
            System.out.println("Loi: So luong nhap phai lon hon 0.");
            return false;
        }
        sach.setsoLuong(sach.getsoLuong() + soLuongNhap);
        System.out.println("Da nhap them " + soLuongNhap + " cuon cho sach '" + sach.gettieuDe() + "'.");
        System.out.println("So luong moi: " + sach.getsoLuong());
        return true;
    }
    @Override
    public int xuatKho(String maSach, int soLuongXuat) 
    {
        Sach sach = timKiemSach(maSach);
        if (sach == null) 
        {
            return 1;
        }
        if (sach.getsoLuong() < soLuongXuat) 
        {
            return 2;
        }
        sach.setsoLuong(sach.getsoLuong() - soLuongXuat);
        System.out.println("Da ban " + soLuongXuat + " cuon sach '" + sach.gettieuDe() + "'.");
        System.out.println("So luong con lai: " + sach.getsoLuong());
        return 0;
    }
    @Override
    public int kiemTraSoLuong(String maSach) 
    {
        Sach sach = timKiemSach(maSach);
        if (sach == null) 
        {
            return -1; 
        }
        return sach.getsoLuong();
    }
    @Override
    public void hienThiDanhSach() 
    {
        if (danhSach.isEmpty()) 
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