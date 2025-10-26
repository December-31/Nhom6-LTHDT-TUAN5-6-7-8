/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ACER
 */
public class SachTieuThuyet extends Sach
{
    private String TheLoai;
    private Boolean LaSachSeries;
    public SachTieuThuyet() {super();};
    public SachTieuThuyet(String MaSach, String TieuDe, String TheLoai, Boolean LaSachSeries, String TacGia, String ViTri, int NamXuatBan, double GiaCoBan, int SoLuong)
    {
        super(MaSach, TieuDe, TacGia, ViTri, NamXuatBan, GiaCoBan, SoLuong);
        this.TheLoai=TheLoai;
        this.LaSachSeries=LaSachSeries;
    }

    public void setTheLoai(String TheLoai) 
    {
        this.TheLoai = TheLoai;
    }
    
    public String getTheLoai() 
    {
        return TheLoai;
    }

    public void setLaSachSeries(Boolean LaSachSeries) 
    {
        this.LaSachSeries = LaSachSeries;
    }
    
    public Boolean getLaSachSeries() 
    {
        return LaSachSeries;
    }
    
    @Override
    public double tinhGiaBan()
    {
        if (LaSachSeries==true)
            return GiaCoBan+15000;
        else
            return GiaCoBan;
    }
    @Override
    public boolean kiemTraTonKho(int soLuongToiThieu)
    {
        if (SoLuong>=soLuongToiThieu)
            return true;
        else
            return false;
    }
    @Override
    public void capNhatViTri(String viTriMoi)
    {
        this.ViTri=viTriMoi;
        System.out.println("Da chuyen sach "+ TieuDe +" den khu vuc: "+ viTriMoi);
    }
    @Override
    public void hienThiThongTin() 
    {
        System.out.println("----------------------------");
        System.out.println("Ma sach: "+ MaSach);
        System.out.println("Tieu de: "+ TieuDe);
        System.out.println("The loai: "+ TheLoai);
        System.out.println("La sach series?: "+ LaSachSeries);
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
        return super.toString() + "| The loai: " + TheLoai + "| La sach serires? " +LaSachSeries +"| Gia ban: "+ tinhGiaBan();
    }
}
