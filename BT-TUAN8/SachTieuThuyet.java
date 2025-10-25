/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BT_TUAN5;

/**
 *
 * @author LENOVO
 */
public class SachTieuThuyet extends Sach {
    private String TheLoai;
    private Boolean LaSachSeries;
    public SachTieuThuyet (String MaSach, String TieuDe, String TacGia,String ViTri, int NamXuatBan, int SoLuong, double giaCoBan, String TheLoai, Boolean LaSachSeries){
        super(MaSach, TieuDe, TacGia,ViTri, NamXuatBan, SoLuong, giaCoBan);
        this.TheLoai=TheLoai;
        this.LaSachSeries=LaSachSeries;
    }
    public String getTheLoai(){
        return TheLoai;
    }
    public void setTheLoai(String TheLoai){
        this.TheLoai=TheLoai;
    }
    public Boolean getLaSachSeries(){
        return LaSachSeries;
    }
    public void setLaSachSeries(Boolean LaSachSeries){
        this.LaSachSeries=LaSachSeries;
    }
    @Override
    public double tinhGiaBan(){
        return this.giaCoBan + (LaSachSeries ? 15000:0);
    }
    @Override
    public String toString(){
        return "SachTieuThuyet:"+ super.toString()+" | The loai: " + TheLoai + " | La sach series: " + LaSachSeries + " | Gia ban: " + this.tinhGiaBan();
    }
}
