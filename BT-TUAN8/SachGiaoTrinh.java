public class SachGiaoTrinh extends Sach
{
    private String monHoc;
    private String capDo;
    public SachGiaoTrinh(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong,String viTri,double giaCoBan,String monHoc, String capDo) 
    {
        super(maSach, tieuDe, tacGia, namXuatBan, soLuong, viTri, giaCoBan);
        this.monHoc = monHoc;
        this.capDo = capDo;
    }
    public String getMonHoc() 
    {
        return monHoc;
    }
    public void setMonHoc(String monHoc) 
    {
        this.monHoc = monHoc;
    }
    public String getCapDo() 
    {
        return capDo;
    }
    public void setCapDo(String capDo) 
    {
        this.capDo = capDo;
    }
    @Override
    public double tinhGiaBan()
    {
        return giaCoBan+(2025-namXuatBan)*5000;
    }
    @Override
    public String toString() 
    {
        return "Sach giao trinh: "+super.toString()+", Mon hoc:"+monHoc+", Cap do:"+capDo+", Gia ban:"+tinhGiaBan();
    }
}
