package BT_TUAN5;
public class SachGiaoTrinh extends Sach{
    private String MonHoc;
    private String CapDo;
    public SachGiaoTrinh (String MaSach, String TieuDe, String TacGia, int NamXuatBan, int SoLuong,double giaCoBan, String CapDo, String MonHoc){
        super(MaSach, TieuDe, TacGia, NamXuatBan, SoLuong, giaCoBan);
        this.CapDo=CapDo;
        this.MonHoc=MonHoc;
    }
    public String getMonHoc(){
        return MonHoc;
    }
    public void SetMonHoc(String MonHoc){
        this.MonHoc=MonHoc;
    }
    public String getCapDo(){
        return CapDo;
    }
    public void setCapDo(String CapDo){
        this.CapDo=CapDo;
    }
    @Override
    public double GiaBan(){
        return this.giaCoBan+((2025-this.NamXuatBan)*5000);
    }
    @Override
    public String toString(){
        return super.toString()+ " | Cap do: " + CapDo+ " | Mon hoc: " + MonHoc  + " | Gia ban: " + this.GiaBan();
    }
}
