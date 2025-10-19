/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ACER
 */
public class SachGiaoTrinh extends Sach
{
    private String MonHoc, CapDo;
    public SachGiaoTrinh() {super();};
    public SachGiaoTrinh(String MaSach, String TieuDe, String MonHoc, String CapDo, String TacGia, int NamXuatBan, double GiaCoBan, int SoLuong)
    {
        super(MaSach, TieuDe, TacGia, NamXuatBan, GiaCoBan, SoLuong);
        this.MonHoc=MonHoc;
        this.CapDo=CapDo;
    }
    public void setMonHoc(String MonHoc) 
    {
        this.MonHoc = MonHoc;
    }   
    public String getMonHoc() 
    {
        return MonHoc;
    }   
    public void setCapDo(String CapDo) 
    {
        this.CapDo = CapDo;
    }
    public String getCapDo() 
    {
        return CapDo;
    }
    
    @Override
    public double tinhGiaBan()
    {
        return GiaCoBan+(2025-NamXuatBan)*5000;
    }
    @Override
    public String toString()
    {
        return super.toString() + "| Mon hoc: " + MonHoc + "| Cap do: " + CapDo +"| Gia ban: "+ tinhGiaBan();
    }
}
