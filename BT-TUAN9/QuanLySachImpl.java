/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ACER
 */
import java.util.ArrayList;
public class QuanLySachImpl implements IQuanLySach, IQuanLyKho
{
    private final ArrayList<Sach> DS = new ArrayList<>();
    private int n=0;
    public QuanLySachImpl(){}
    
    public ArrayList<Sach> getDS() 
    {
        return DS;
    }
    
    @Override
    public Sach TimKiem(String MaSach) 
    {
        for (int i=0; i<=n-1; i++) 
        {
            if (DS.get(i).getMaSach().equals(MaSach)) 
                return DS.get(i);
        }
        return null;
    }
    
    @Override
    public void KQTimKiem(Sach KQ)
    {
        if (KQ != null) 
        {
            System.out.println("Da tim thay sach");
            KQ.hienThiThongTin();
        } 
        else
            System.out.println("Khong co trong danh sach"); 
    }
    
    @Override
    public void ThemSach(Sach sach)
    {
        if (TimKiem(sach.MaSach)==null)
        {
            DS.add(sach);
            n++;
            System.out.println("Da them ma sach: " + sach.MaSach);
            System.out.println("----------------------------");
        }
        else
            System.out.println("Da co ma sach trong thu vien.");
    }
    
    @Override
    public void XoaSach(String MaSach)  
    {
        Sach sachCanXoa = TimKiem(MaSach);
        if (sachCanXoa != null) 
        {
            DS.remove(sachCanXoa);
            n--;
            System.out.println("Da xoa ma sach: " + MaSach);
        }
        else
            System.out.println("Khong tim thay ma sach: " + MaSach);
        System.out.println("----------------------------");
    }
    
    @Override
    public void CapNhapSach(String MaSach, String TieuDe, String TacGia, int NamXuatBan, double GiaCoBan, int SoLuong)
    {
        Sach sach = TimKiem(MaSach);
        if (sach!=null)
        {
            sach.setTieuDe(TieuDe);
            sach.setTacGia(TacGia);
            sach.setNamXuatBan(NamXuatBan);
            sach.setGiaCoBan(GiaCoBan);
            sach.setSoLuong(SoLuong);
        }
        else
            System.out.println("Khong tim thay ma sach: " + MaSach);
    }
    
    @Override
    public boolean NhapKho(String MaSach, int SoLuongNhap)
    {
        Sach sach = TimKiem(MaSach);
        if (sach!=null && SoLuongNhap>=0)
        {
            sach.setSoLuong(SoLuongNhap+sach.SoLuong);
            return true;
        }
        return false;
    }
    public void KQNhapKho(boolean x)
    {
        if (x==true)
            System.out.println("Nhap thanh cong.");
        else
            System.out.println("Loi: Ma sach khong ton tai hoac so luong nhap be hon 0.");
    }
    
    @Override
    public int XuatKho(String MaSach, int SoLuongXuat)
    {
        Sach sach = TimKiem(MaSach);
        if (sach!=null)
        {
            if (SoLuongXuat<=sach.SoLuong)
            {
                sach.setSoLuong(sach.SoLuong-SoLuongXuat);
                return sach.SoLuong;
            }
        }
        return -1;
    }
    public void KQXuatKho(int x)
    {
        if (x==-1)
            System.out.println("Loi: Ma sach khong ton tai hoac so luong xuat vuot qua so luong ton.");
        else
            System.out.println("Xuat thanh cong.");
    }
    
    @Override
    public int KiemTraSoLuong(String MaSach)
    {
        Sach sach = TimKiem(MaSach);
        if (sach!=null)
        {
            return sach.SoLuong;
        }
        else
            return -1;
    }
    
    @Override  
    public void HienThiDS() 
    {
        System.out.println("Hien thi danh sach:");
        for (Sach s: DS) 
        {
            System.out.println(s.toString());
            System.out.println("-----------------------------------");
        }
    }
}
