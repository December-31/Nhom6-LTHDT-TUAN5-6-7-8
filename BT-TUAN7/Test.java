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

        Sach Cuon1 = new SachTieuThuyet("B0001","Dao giau vang","Phieu luu", false, "Robert Louis Stevenson",1883,17000,7);
        Cuon1.hienThiThongTin();
        QL.ThemSach(Cuon1);
        
        SachGiaoTrinh Cuon2 = new SachGiaoTrinh("B0002","Giai Tich","Chuyen nganh Toan","Dai hoc","Nguyen Dinh Huy", 2015,12000,3);
        Cuon2.hienThiThongTin();
        QL.ThemSach(Cuon2);
        
        SachTieuThuyet Cuon3 = new SachTieuThuyet();
        Cuon3.setMaSach("B0003");
        Cuon3.setTieuDe("Hat bui trong mua");
        Cuon3.setTheLoai("Tinh cam lang man");
        Cuon3.setLaSachSeries(false);
        Cuon3.setTacGia("Petrichor");
        Cuon3.setNamXuatBan(1773);
        Cuon3.setGiaCoBan(50000);
        Cuon3.setSoLuong(2);
        Cuon3.hienThiThongTin();
        QL.ThemSach(Cuon3);
        
        Sach Cuon4 = new SachGiaoTrinh("B0004", "Giai Phau", "Y", "Dai Hoc", "Dai hoc Y Ha Noi", 2022, 12000,1);
        Cuon4.hienThiThongTin();
        QL.ThemSach(Cuon4);
        
        Sach Cuon5 = new SachTieuThuyet("B0005", "Harry Potter", "Ky ao", true, "J. K. Rowling", 1997, 30000,7);
        Cuon5.hienThiThongTin();
        QL.ThemSach(Cuon5);
        
        QL.HienThiDS();
        
        System.out.println("Xoa ma sach co ma la: B0005");
        QL.XoaSach("B0005");
        QL.HienThiDS();
        
        System.out.println("Cap nhap thong tin sach co ma B0004: ");
        QL.CapNhapSach("B0004", "Nguyen Van Huy", "Giai Phau Nguoi", 2, 17000);
        Cuon4.hienThiThongTin();
        QL.HienThiDS();
        
        System.out.print("Nhap ma sach can tim: ");
        String STimKiem = sc.nextLine();

        Sach x = QL.TimKiem(STimKiem);
        QL.KQTimKiem(x);
    }


}
