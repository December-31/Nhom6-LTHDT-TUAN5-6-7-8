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
    public SachGiaoTrinh(String MaSach, String TieuDe, String MonHoc, String CapDo, String TacGia, String ViTri, int NamXuatBan, double GiaCoBan, int SoLuong)
    {
        super(MaSach, TieuDe, TacGia, ViTri, NamXuatBan, GiaCoBan, SoLuong);
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
    public boolean kiemTraTonKho(int soLuongToiThieu)
    {
        if (SoLuong>=soLuongToiThieu)
            return true;
        else
            return false;
    }
    @Override
    public void capNhatViTri(String viTriMoi)
    {
        this.ViTri=viTriMoi;
        System.out.println("Da chuyen sach "+ TieuDe +" den khu vuc: "+ viTriMoi);
    }
    @Override
    public void hienThiThongTin() 
    {
        System.out.println("----------------------------");
        System.out.println("Ma sach: "+ MaSach);
        System.out.println("Tieu de: "+ TieuDe);
        System.out.println("Mon hoc: "+ MonHoc);
        System.out.println("Cap do: "+ CapDo);
        System.out.println("Tac gia: "+ TacGia);
        System.out.println("Vi tri: "+ ViTri);
        System.out.println("Nam xuat ban: "+ NamXuatBan);
        System.out.println("So luong: "+ SoLuong);
        System.out.println("Gia co ban: "+ GiaCoBan);
        System.out.println("Gia ban ra: "+tinhGiaBan());
        System.out.println("----------------------------");
    }
    @Override
    public String toString()
    {
        return super.toString() + "| Mon hoc: " + MonHoc + "| Cap do: " + CapDo +"| Gia ban: "+ tinhGiaBan();
    }
}
