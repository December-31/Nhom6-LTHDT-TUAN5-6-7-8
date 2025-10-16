package BT_TUAN5;
public class SachTieuThuyet extends Sach {
    private String TheLoai;
    private Boolean LaSachSeries;
    public SachTieuThuyet (String MaSach, String TieuDe, String TacGia, int NamXuatBan, int SoLuong, double giaCoBan, String TheLoai, Boolean LaSachSeries){
        super(MaSach, TieuDe, TacGia, NamXuatBan, SoLuong, giaCoBan);
        this.TheLoai=TheLoai;
        this.LaSachSeries=LaSachSeries;
    }
    public String getTheLoai(){
        return TheLoai;
    }
    public void setTheLoai(String TheLoai){
        this.TheLoai=TheLoai;
    }
    public Boolean getLaSachSeries(){
        return LaSachSeries;
    }
    public void setLaSachSeries(Boolean LaSachSeries){
        this.LaSachSeries=LaSachSeries;
    }
    @Override
    public double GiaBan(){
        return giaCoBan + (LaSachSeries ? 15000:0);
    }
    @Override
    public String toString(){
        return super.toString()+" | The loai: " + TheLoai + " | La sach series: " + LaSachSeries + " | Gia ban: " + this.GiaBan();
    }
}
