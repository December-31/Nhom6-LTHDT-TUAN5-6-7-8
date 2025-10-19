public class SachGiaoTrinh extends Sach 
{
    private String monHoc;
    private String capDo;
    public SachGiaoTrinh(String maSach, String tieuDe, String tacGia, String monHoc, String capDo, int namXuatBan, int soLuong, double giaCoBan) 
    {
        super(maSach, tieuDe, tacGia, namXuatBan, soLuong, giaCoBan);
        this.monHoc = monHoc;
        this.capDo = capDo;
    }
    @Override
    public double tinhGiaBan()
    {
        return giaCoBan+((2025-namXuatBan)*5000);
    }
    @Override
    public String toString() 
    {
        return super.toString() + "\nMon hoc: " + monHoc + "\nCap do: " + capDo + "\nGia ban: " + this.tinhGiaBan() + "vnd";
    }
}
