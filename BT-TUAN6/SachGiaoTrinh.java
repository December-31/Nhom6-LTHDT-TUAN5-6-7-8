/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BT_TUAN5;

/**
 *
 * @author LENOVO
 */
public class SachGiaoTrinh extends Sach{
    private String MonHoc;
    private String CapDo;
    public SachGiaoTrinh (String MaSach, String TieuDe, String TacGia, int NamXuatBan, int SoLuong, String CapDo, String MonHoc){
        super(MaSach, TieuDe, TacGia, NamXuatBan, SoLuong);
        this.CapDo=CapDo;
        this.MonHoc=MonHoc;
    }
    public String getMonHoc(){
        return MonHoc;
    }
    public void SetMonHoc(){
        this.MonHoc=MonHoc;
    }
    public String getCapDo(){
        return CapDo;
    }
    public void setCapDo(){
        this.CapDo=CapDo;
    }
    @Override
    public String toString(){
        return "Ma sach: " + MaSach + " | Tieu de: " + TieuDe + " | Tacgia: " + TacGia + " | Nam xuat ban: " + NamXuatBan + " | So luong: " + " | Mon hoc: " + MonHoc + " | Cap do: " + CapDo;
    }
}
