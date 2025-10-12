/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ACER
 */
import java.util.Scanner;
public class Test 
{
    static Scanner sc = new Scanner(System.in);
    public static void main(String args[]) 
    {
        QuanLySach QL = new QuanLySach();

        Sach Cuon1 = new Sach("B0001","Dao giau vang","Robert Louis Stevenson",1883,7);
        Cuon1.hienThiThongTin();
        QL.ThemSach(Cuon1);
        
        Sach Cuon2 = new Sach("B0002","De men phieu luu ki","To Hoai");
        Cuon2.hienThiThongTin();
        QL.ThemSach(Cuon2);
        
        Sach Cuon3 = new Sach();
        Cuon3.setMaSach("B0003");
        Cuon3.setTieuDe("Tay Du Ki");
        Cuon3.setTacGia("Ngo Thua An");
        Cuon3.setNamXuatBan(1590);
        Cuon3.setSoLuong(10);
        Cuon3.hienThiThongTin();
        QL.ThemSach(Cuon3);
        
        Sach Cuon4 = new SachGiaoTrinh("B0004", "Giai Phau", "Y", "Dai Hoc", "Dai hoc Y Ha Noi", 2022, 1);
        Cuon4.hienThiThongTin();
        QL.ThemSach(Cuon4);
        
        Sach Cuon5 = new SachTieuThuyet("B0005", "Harry Potter", "Ky ao", true, "J. K. Rowling", 1997, 7);
        Cuon5.hienThiThongTin();
        QL.ThemSach(Cuon5);
        
        QL.HienThiDS();
        
        QL.XoaSach("B0005");
        
        QL.HienThiDS();
                
        QL.CapNhapSach("B0004", "Nguyen Van Huy", "Giai Phau Nguoi", 2);
        
        System.out.print("Nhap ma sach can tim: ");
        String STimKiem = sc.nextLine();

        Sach x = QL.TimKiem(STimKiem);
        QL.KQTimKiem(x);
    }


}
