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
    public SachGiaoTrinh(String MaSach, String TieuDe, String MonHoc, String CapDo, String TacGia, int NamXuatBan, int SoLuong)
    {
        super(MaSach, TieuDe, TacGia, NamXuatBan, SoLuong);
        this.MonHoc=MonHoc;
        this.CapDo=CapDo;
    }
    @Override
    public String toString()
    {
        return super.toString() + "| Mon hoc: " + MonHoc + "| Cap do: " + CapDo;
    }
}
