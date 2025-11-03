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
    public SachTieuThuyet(String MaSach, String TieuDe, String TheLoai, Boolean LaSachSeries, String TacGia, int NamXuatBan, int SoLuong)
    {
        super(MaSach, TieuDe, TacGia, NamXuatBan, SoLuong);
        this.TheLoai=TheLoai;
        this.LaSachSeries=LaSachSeries;
    }
    @Override
    public String toString()
    {
        return super.toString() + "| The loai: " + TheLoai + "| La sach serires? " +LaSachSeries;
    }
}
