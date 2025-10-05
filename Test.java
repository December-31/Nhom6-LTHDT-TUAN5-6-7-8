/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ACER
 */
public class Test 
{
    public static void main(String args[]) 
    {
        Sach Cuon1 = new Sach("B0001","Dao giau vang","Robert Louis Stevenson",1883,7);
        Cuon1.hienThiThongTin();
        Sach Cuon2 = new Sach("B0002","De men phieu luu ki","To Hoai");
        Cuon2.hienThiThongTin();
        Sach Cuon3 = new Sach();
        Cuon3.setMaSach("B0003");
        Cuon3.setTieuDe("Tay Du Ki");
        Cuon3.setTacGia("Ngo Thua An");
        Cuon3.setNamXuatBan(1590);
        Cuon3.setSoLuong(10);
        Cuon3.hienThiThongTin();
    }
}
