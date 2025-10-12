/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BT_TUAN5;

import static javax.swing.text.html.HTML.Attribute.N;

/**
 *
 * @author LENOVO
 */
public class Test {
    public static void main(String[] args) {
        QuanLySach ql = new QuanLySach();
        
        SachGiaoTrinh gt1 = new SachGiaoTrinh("GT01", "Lap trinh Java", "Nguyen Van A", 2022, 10, "Dai hoc", "CNTT");
        SachGiaoTrinh gt2 = new SachGiaoTrinh("GT02", "Toan cao cap", "Le Thi B", 2021, 5, "Dai hoc", "Toan hoc");

        SachTieuThuyet tt1 = new SachTieuThuyet("TT01", "harry potter", "j.r. rowling", 1997, 20, "fantasy", true);
        SachTieuThuyet tt2 = new SachTieuThuyet("TT02", "doraemon", "Fujiko F. Fujio", 1980, 15, "thieu nhi", true);

        ql.themSach(gt1);
        ql.themSach(gt2);
        ql.themSach(tt1);
        ql.themSach(tt2);

        System.out.println("=== Danh sach ban dau ===");
        ql.hienThiTatCa();

        System.out.println("\n=== Tem sach ma TT01 ===");
        System.out.println(ql.timSachTheoMa("TT01"));

        System.out.println("\n=== Cap nhat tieu de GT02 ===");
        ql.capNhatSach("GT02", "Toan cao cap 1",16);
        ql.hienThiTatCa();

        System.out.println("\n=== Xoa sach ma TT02 ===");
        ql.xoaSach("TT02");
        ql.hienThiTatCa();
    }
}
