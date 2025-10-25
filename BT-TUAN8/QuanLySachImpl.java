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
import java.util.Iterator;
public class QuanLySachImpl implements IQuanLySach{
    protected ArrayList<Sach> danhSach;
    public QuanLySachImpl() {
        danhSach = new ArrayList<>();
    }
    public ArrayList<Sach> getdanhSach() 
    {
        return danhSach;
    }
    @Override
    public void themSach(Sach s) {
        danhSach.add(s);
    }
    @Override
    public boolean xoaSach(String maSach) {
        Iterator<Sach> iterator = danhSach.iterator();
        while (iterator.hasNext()) {
            Sach s = iterator.next();
            if (s.getMaSach().equalsIgnoreCase(maSach)) {
                iterator.remove();
                return true;
            }
        }
        return false;
    }
    @Override
 public Sach timSachTheoMa(String maSach) {
        for (Sach s : danhSach) {
            if (s.getMaSach().equalsIgnoreCase(maSach)) {
                return s;
            }
        }
        return null;
    }
    @Override
    public void capNhatSach(Sach s, String MaSachmoi, String TieuDeMoi, String TacGiamoi, int NamXuatBanmoi, int SoLuongMoi, double giaCoBanmoi) {
            s.setMaSach(MaSachmoi);
            s.setTieuDe(TieuDeMoi);
            s.setTacGia(TacGiamoi);
            s.setNamXuatBan(NamXuatBanmoi);
            s.setSoLuong(SoLuongMoi);  
            s.setgiaCoBan(giaCoBanmoi);            
    }
    @Override
    public void capNhatSachGiaoTrinh(String maSach, String MaSachmoi, String TieuDeMoi, String TacGiamoi, int NamXuatBanmoi, int SoLuongMoi, double giaCoBanmoi, String CapDomoi, String MonHocmoi){
        Sach s = timSachTheoMa(maSach);
        capNhatSach(s, MaSachmoi,TieuDeMoi,TacGiamoi,NamXuatBanmoi,SoLuongMoi,giaCoBanmoi);
        SachGiaoTrinh sgt=(SachGiaoTrinh) s;
        sgt.setCapDo(CapDomoi);
        sgt.setMonHoc(MonHocmoi);       
    }
    @Override
    public void capNhatSachTieuThuyet(String maSach, String MaSachmoi, String TieuDeMoi, String TacGiamoi, int NamXuatBanmoi, int SoLuongMoi, double giaCoBanmoi, String TheLoaimoi, Boolean LaSachSeriesmoi){
        Sach s = timSachTheoMa(maSach);
        capNhatSach(s, MaSachmoi,TieuDeMoi,TacGiamoi,NamXuatBanmoi,SoLuongMoi,giaCoBanmoi);
        SachTieuThuyet stt=(SachTieuThuyet) s;
        stt.setTheLoai(TheLoaimoi);
        stt.setLaSachSeries(LaSachSeriesmoi);        
    }
    @Override
    public void hienThiTatCa() {
        for (Sach s : danhSach) {
            System.out.println(s.toString());
        }
    }
}
