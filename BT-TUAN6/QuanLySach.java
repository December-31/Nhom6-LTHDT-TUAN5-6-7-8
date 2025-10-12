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
public class QuanLySach {
    private ArrayList<Sach> danhSach;

    public QuanLySach() {
        danhSach = new ArrayList<>();
    }
    public void themSach(Sach s) {
        danhSach.add(s);
    }
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
    public boolean capNhatSach(String maSach, String TieuDeMoi, int SoLuongMoi) {
        for (Sach s : danhSach) {
            if (s.getMaSach().equalsIgnoreCase(maSach)) {
                s.setTieuDe(TieuDeMoi);
                s.setSoLuong(SoLuongMoi);   
                return true;
            }
        }
        return false;
    }
    public Sach timSachTheoMa(String maSach) {
        for (Sach s : danhSach) {
            if (s.getMaSach().equalsIgnoreCase(maSach)) {
                return s;
            }
        }
        return null;
    }
    public void hienThiTatCa() {
        for (Sach s : danhSach) {
            System.out.println(s.toString());
        }
    }
}
