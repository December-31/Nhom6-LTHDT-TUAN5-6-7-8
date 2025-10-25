/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BT_TUAN5;

/**
 *
 * @author LENOVO
 */
import java.util.ArrayList;
public interface IQuanLySach {
    ArrayList<Sach> getdanhSach();
    public void themSach(Sach s);
    public boolean xoaSach(String maSach);
    public Sach timSachTheoMa(String maSach);
    public void capNhatSach(Sach s, String MaSachmoi, String TieuDeMoi, String TacGiamoi, int NamXuatBanmoi, int SoLuongMoi, double giaCoBanmoi);
    public void capNhatSachGiaoTrinh(String maSach, String MaSachmoi, String TieuDeMoi, String TacGiamoi, int NamXuatBanmoi, int SoLuongMoi, double giaCoBanmoi, String CapDomoi, String MonHocmoi);
    public void capNhatSachTieuThuyet(String maSach, String MaSachmoi, String TieuDeMoi, String TacGiamoi, int NamXuatBanmoi, int SoLuongMoi, double giaCoBanmoi, String TheLoaimoi, Boolean LaSachSeriesmoi);
    public void hienThiTatCa();
}

