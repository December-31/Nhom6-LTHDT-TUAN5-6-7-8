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
    
    public SachGiaoTrinh (String MaSach, String TieuDe, String TacGia, String ViTri, int NamXuatBan, int SoLuong,double giaCoBan, String CapDo, String MonHoc){
        super(MaSach, TieuDe, TacGia, ViTri, NamXuatBan, SoLuong, giaCoBan);
        this.CapDo=CapDo;
        this.MonHoc=MonHoc;
    }
    public String getMonHoc(){
        return MonHoc;
    }
    public void setMonHoc(String MonHoc){
        this.MonHoc=MonHoc;
    }
    public String getCapDo(){
        return CapDo;
    }
    public void setCapDo(String CapDo){
        this.CapDo=CapDo;
    }
    @Override
    public double tinhGiaBan(){
        return this.giaCoBan+((2025-this.NamXuatBan)*5000);
    }
    @Override
    public String toString(){
        return "SachGiaoTrinh:"+ super.toString()+ " | Cap do: " + CapDo+ " | Mon hoc: " + MonHoc  + " | Gia ban: " + this.tinhGiaBan();
    }
}
