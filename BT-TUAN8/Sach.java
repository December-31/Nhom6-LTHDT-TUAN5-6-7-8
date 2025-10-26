/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author ACER
 */
public abstract class Sach implements IGiaBan, IKiemKe
{
    protected String MaSach, TieuDe, TacGia, ViTri;
    protected int NamXuatBan, SoLuong;
    protected double GiaCoBan;
    public Sach(){}
    public Sach(String MaSach, String TieuDe, String TacGia, String ViTri, int NamXuatBan, double GiaCoBan, int SoLuong)
    {
        this.MaSach=MaSach;
        this.TieuDe=TieuDe;
        this.TacGia=TacGia;
        this.ViTri=ViTri;
        this.NamXuatBan=NamXuatBan;
        this.SoLuong=SoLuong;
        this.GiaCoBan=GiaCoBan;
    }
    public Sach(String MaSach, String TieuDe, String TacGia, String ViTri)
    {
        this.MaSach=MaSach;
        this.TieuDe=TieuDe;
        this.TacGia=TacGia;
        this.ViTri=ViTri;
    }
    public Sach(Sach book)
    {
        this.MaSach=book.MaSach;
        this.TieuDe=book.TieuDe;
    }
    
    public void setMaSach(String MaSach)
    {
        this.MaSach=MaSach;
    }
    public String getMaSach() 
    {
        return MaSach;
    }
    public void setTieuDe(String TieuDe) 
    {
        this.TieuDe=TieuDe;
    }
    public String getTieuDe() 
    {
        return TieuDe;
    }
    public void setTacGia(String TacGia) 
    {
        this.TacGia=TacGia;
    }
    public String getTacGia() 
    {
        return TacGia;
    }
    public void setViTri(String ViTri) 
    {
        this.ViTri = ViTri;
    }
    public String getViTri() 
    {
        return ViTri;
    }
    public void setNamXuatBan(int NamXuatBan) 
    {
        this.NamXuatBan=NamXuatBan;
    }
    public int getNamXuatBan() 
    {
        return NamXuatBan;
    }
    public void setSoLuong(int SoLuong) 
    {
        this.SoLuong=SoLuong;
    }
    public int getSoLuong() 
    {
        return SoLuong;
    }
    public void setGiaCoBan(double GiaCoBan)
    {
        this.GiaCoBan=GiaCoBan;
    }
    public double getGiaCoBan()
    {
        return GiaCoBan;
    }
    public abstract double tinhGiaBan();
    public abstract boolean kiemTraTonKho(int soLuongToiThieu);
    public abstract void capNhatViTri(String viTriMoi);
    public void hienThiThongTin() 
    {
        System.out.println("----------------------------");
        System.out.println("Ma sach: "+ MaSach);
        System.out.println("Tieu de: "+ TieuDe);
        System.out.println("Tac gia: "+ TacGia);
        System.out.println("Vi tri: "+ ViTri);
        System.out.println("Nam xuat ban: "+ NamXuatBan);
        System.out.println("So luong: "+ SoLuong);
        System.out.println("Gia co ban: "+ GiaCoBan);
        System.out.println("Gia ban ra: "+tinhGiaBan());
        System.out.println("----------------------------");
    }
    @Override
    public String toString()
    {
        return "Ma sach: "+ MaSach +"| Tieu de: "+ TieuDe+"| Tac gia: "+ TacGia +"| Vi tri: "+ViTri+"| Nam xuat ban: "+ NamXuatBan +"| Gia co ban: "+ GiaCoBan +"| So luong: "+ SoLuong;
    }
}
