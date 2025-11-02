import java.time.Year;
public class SachGiaoTrinh extends Sach 
{
    private String monHoc;
    private String capDo;
    public SachGiaoTrinh(String maSach, String tieuDe, String tacGia, String monHoc, String capDo, int namXuatBan, int soLuong, double giaCoBan, String viTri) 
    {
        super(maSach, tieuDe, tacGia, namXuatBan, soLuong, giaCoBan, viTri);
        this.monHoc = monHoc;
        this.capDo = capDo;
    }
    @Override
    public double tinhGiaBan()
    {
        int namHienTai=Year.now().getValue();
        return giaCoBan+(namHienTai-namXuatBan)*5000;
    }
    @Override
    public String toString() 
    {
        return super.toString() + "\nMon hoc: " + monHoc + "\nCap do: " + capDo + "\nGia ban: " + this.tinhGiaBan() + "vnd";
    }
}