/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BT_TUAN5;

/**
 *
 * @author LENOVO
 */
public class Sach 
{
    private String  maSach;
    private String tieuDe;
    private String tacGia;
    private int namXuatban;
    private int soLuong;
    public void hienthithongtin()
    {
        System.out.println("Ma sach: "+ maSach);
        System.out.println("Tieu de: "+tieuDe);
        System.out.println(" Tac gia: "+tacGia);
        System.out.println("Nam xuat ban: " + namXuatban);
        System.out.println("So luong: " + soLuong);
    }
    public Sach(String maSach, String tieuDe, String tacGia, int namXuatban, int soLuong)
    {
        this.maSach = maSach;
        this.tieuDe = tieuDe;
        this.tacGia = tacGia;
        this.namXuatban = namXuatban;
        this.soLuong = soLuong;
    }
     public Sach() 
    {
    }
    public String getMaSach() {
        return maSach;
    }
    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }
    public String getTieuDe() {
        return tieuDe;
    }
    public void setTieuDe(String tieuDe) {
        this.tieuDe = tieuDe;
    }
    public String getTacGia() {
        return tacGia;
    }
    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
     }
    public int getNamXuatBan() {
        return namXuatban;
    }
    public void setNamXuatBan(int namXuatBan) {
        this.namXuatban = namXuatBan;
    }
    public int getSoLuong() {
        return soLuong;
    }
    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }    
}