public class SachTieuThuyet extends Sach 
{
    private String theLoai;
    private boolean laSachSeries;
    public SachTieuThuyet(String maSach, String tieuDe, String tacGia, String theLoai, boolean laSachSeries, int namXuatBan, int soLuong, double giaCoBan, String viTri) 
    {
        super(maSach, tieuDe, tacGia, namXuatBan, soLuong, giaCoBan, viTri);
        this.theLoai = theLoai;
        this.laSachSeries = laSachSeries;
    }
    @Override
    public double tinhGiaBan()
    {
        if(laSachSeries=true)
            return giaCoBan+15000;
        else
            return giaCoBan;
    }
    @Override
    public String toString() 
    {
        return super.toString() + "\nThe loai: " + theLoai + "\nSach co thuoc loai series hay khong? " + laSachSeries + "\nGia ban: " + this.tinhGiaBan() + "vnd";
    }
}
