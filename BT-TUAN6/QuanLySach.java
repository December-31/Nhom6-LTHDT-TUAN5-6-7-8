/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ACER
 */
public class QuanLySach 
{
    private Sach[] DS = new Sach[100];
    private int n;
    public QuanLySach(){}
    
    public void ThemSach(Sach sach)
    {
            n++;
            DS[n] = sach;
            System.out.println("Da them ma sach: " + sach.MaSach);
            System.out.println("----------------------------");
    }
    
    public void XoaSach(String MaSach)  
    {
        for (int i=1; i<=n; i++) 
        {
            if (DS[i].getMaSach().equals(MaSach)) 
            {
                for (int j=i; j<n; j++)
                    DS[j] = DS[j+1];
                n--;
            }
        }
        System.out.println("Da xoa ma sach: " + MaSach);
        System.out.println("----------------------------");
    }
    
    public void CapNhapSach(String MaSach, String TacGia, String TieuDe, int SoLuong) 
    {
        for (int i=1; i<=n; i++) 
        {
            if (DS[i].getMaSach().equals(MaSach)) 
            {
                DS[i].setTieuDe(TacGia);
                DS[i].setTieuDe(TieuDe);
                DS[i].setSoLuong(SoLuong);
            }
        }
    }
    
    public Sach TimKiem(String MaSach) 
    {
        for (int i=1; i<=n; i++) 
        {
            if (DS[i].getMaSach().equals(MaSach)) 
                return DS[i];
        }
        return null;
    }
    public void KQTimKiem(Sach Result)
    {
        if (Result != null) 
        {
            System.out.println("Da tim thay sach");
            System.out.println(Result.toString());
        } 
        else
            System.out.println("Khong co trong danh sach"); 
    }
    
    public void HienThiDS() 
    {
        System.out.println("Hien thi danh sach:");
        for (int i=1; i<=n; i++) 
        {
            System.out.println(DS[i].toString());
            System.out.println("-----------------------------------");
        }
    }
}
