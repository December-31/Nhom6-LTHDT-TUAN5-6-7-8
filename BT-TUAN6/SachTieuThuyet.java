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
    public SachTieuThuyet (String MaSach, String TieuDe, String TacGia, int NamXuatBan, int SoLuong, String TheLoai, Boolean LaSachSeries){
        super(MaSach, TieuDe, TacGia, NamXuatBan, SoLuong);
        this.TheLoai=TheLoai;
        this.LaSachSeries=LaSachSeries;
    }
    public String getTheLoai(){
        return TheLoai;
    }
    public void setTheLoai(){
        this.TheLoai=TheLoai;
    }
    public Boolean getLaSachSeries(){
        return LaSachSeries;
    }
    public void setLaSachSeries(){
        this.LaSachSeries=LaSachSeries;
    }
    @Override
    public String toString(){
        return "Ma sach: " + MaSach + " | Tieu de: " + TieuDe + " | Tacgia: " + TacGia + " | Nam xuat ban: " + NamXuatBan + " | So luong: " + " | The loai: " + TheLoai + " | La sach series: " + LaSachSeries;
    }
}
