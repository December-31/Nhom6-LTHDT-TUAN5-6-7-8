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
    public SachTieuThuyet(String MaSach, String TieuDe, String TheLoai, Boolean LaSachSeries, String TacGia, int NamXuatBan, double GiaCoBan, int SoLuong)
    {
        super(MaSach, TieuDe, TacGia, NamXuatBan, GiaCoBan, SoLuong);
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
    public String toString()
    {
        return super.toString() + "| The loai: " + TheLoai + "| La sach serires? " +LaSachSeries +"| Gia ban: "+ tinhGiaBan();
    }
}
