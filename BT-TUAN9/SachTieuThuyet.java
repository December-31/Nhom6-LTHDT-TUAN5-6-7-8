public class SachTieuThuyet extends Sach
{
    private String theLoai;
    private boolean laSachSeries;
    public SachTieuThuyet(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong,String vitri,double giaCoBan,String theLoai, boolean laSachSeries)
    {
        super(maSach, tieuDe, tacGia, namXuatBan, soLuong,vitri, giaCoBan);
        this.theLoai = theLoai;
        this.laSachSeries = laSachSeries;
    }
    public String getTheLoai() 
    {
        return theLoai;
    }
    public void setTheLoai(String theLoai) 
    {
        this.theLoai = theLoai;
    }
    public boolean isLaSachSeries() 
    {
        return laSachSeries;
    }
    public void setLaSachSeries(boolean laSachSeries) 
    {
        this.laSachSeries = laSachSeries;
    }
    @Override
    public double tinhGiaBan()
    {
        if (laSachSeries==true)
            return giaCoBan+15000;
        else 
            return giaCoBan;
    }
    @Override
    public String toString() 
    {
        return "Sach Tieu Thuyet: "+super.toString()+", The loai: "+theLoai+", La sach series: "+laSachSeries+", Gia ban:"+tinhGiaBan();
    }
}
