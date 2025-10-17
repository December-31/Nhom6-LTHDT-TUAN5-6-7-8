import java.util.ArrayList;
public class QuanLySach 
{
    private final ArrayList<Sach> danhSach;
    public QuanLySach() 
    {
        this.danhSach = new ArrayList<>();
    }
    public Sach timKiemSach(String ma) 
    {
        for (Sach sach:danhSach) 
            if (sach.getmaSach().equalsIgnoreCase(ma)) 
                return sach;
        return null;
    }
    public void kquaTimKiem(String ma)
    {
        if (timKiemSach(ma)==null)
            System.out.println("Khong tim thay ma sach "+ma+"");
        else
        {
            System.out.println("Tim thay ma sach "+ma+":");
            System.out.println(timKiemSach(ma).toString());
        }
    }
    public void themSach(Sach sach) 
    {
        if (timKiemSach(sach.getmaSach())!= null) 
             System.out.println("Khong the them sach vi "+sach.getmaSach()+" da ton tai trong danh sach");
        else
        {
            this.danhSach.add(sach);
            System.out.println("Da them sach co ma:" + sach.getmaSach());
        }
    }
    public void capNhat(String ma,Sach sachmoi)
    {
        Sach sachCapNhat=timKiemSach(ma);
         if (sachCapNhat!=null)
        {
            sachCapNhat.setmaSach(sachmoi.getmaSach());
            sachCapNhat.settieuDe(sachmoi.gettieuDe());
            sachCapNhat.settacGia(sachmoi.gettacGia());
            sachCapNhat.setnamXuatBan(sachmoi.getnamXuatBan());
            sachCapNhat.setsoLuong(sachmoi.getsoLuong());
            sachCapNhat.setgiaCoBan(sachmoi.getgiaCoBan());
            if (sachCapNhat instanceof SachTieuThuyet && sachmoi instanceof SachTieuThuyet)
            {
                SachTieuThuyet s1=(SachTieuThuyet) sachCapNhat;
                SachTieuThuyet s2=(SachTieuThuyet) sachmoi;
                s1.setTheLoai(s2.getTheLoai());
                s1.setLaSachSeries(s2.isLaSachSeries());
            }
            else 
                if (sachCapNhat instanceof SachGiaoTrinh && sachmoi instanceof SachGiaoTrinh) 
                {
                    SachGiaoTrinh s1=(SachGiaoTrinh) sachCapNhat;
                    SachGiaoTrinh s2=(SachGiaoTrinh) sachmoi;
                    s1.setMonHoc(s2.getMonHoc());
                    s1.setCapDo(s2.getCapDo());
                }
            System.out.println("Da cap nhat sach co ma "+ma);
        }
        else
            System.out.println("Khong tim thay sach co ma "+ma+" de cap nhat");
    }
    public void xoaSach(String ma) 
    {
        Sach sachXoa = timKiemSach(ma);
        if (sachXoa != null) 
        {
            danhSach.remove(sachXoa);
            System.out.println("Da xoa sach co ma "+ma);
        } 
        else 
            System.out.println("Khong tim thay sach co ma "+ma+" de xoa");
    }
    public void xuatSach() 
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