package BT;
import java.time.Year;
public class SachGiaoTrinh extends Sach{
    private String MonHoc;
    private String CapDo;
    
    public SachGiaoTrinh (String MaSach, String TieuDe, String TacGia, String ViTri, int NamXuatBan, int SoLuong,double giaCoBan, String CapDo, String MonHoc){
        super(MaSach, TieuDe, TacGia, ViTri, NamXuatBan, SoLuong, giaCoBan);
        this.CapDo=CapDo;
        this.MonHoc=MonHoc;
    }

    public SachGiaoTrinh() {
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
        int namHienTai = Year.now().getValue();
        return this.giaCoBan+((namHienTai-this.NamXuatBan)*5000);
    }
    @Override
    public String toString(){
        return "SachGiaoTrinh:"+ super.toString()+ " | Cap do: " + CapDo+ " | Mon hoc: " + MonHoc  + " | Gia ban: " + this.tinhGiaBan();
    }
}
