/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

/**
 *
 * @author ACER
 */
public interface IQuanLySach 
{
    public Sach TimKiem(String MaSach);
    public void KQTimKiem(Sach KQ);
    public void ThemSach(Sach sach);
    public void XoaSach(String MaSach);
    public void CapNhapSach(String MaSach, String TieuDe, String TacGia, int NamXuatBan, double GiaCoBan, int SoLuong);    
    public void HienThiDS();
}
