
public class SachTieuThuyet extends Sach {

    private String theLoai;
    private boolean laSachSeries;

    public SachTieuThuyet(String maSach, String tieuDe, String tacGia, String theLoai, boolean laSachSeries, int namXuatBan, int soLuong) {
        super(maSach, tieuDe, tacGia, namXuatBan, soLuong);
        this.theLoai = theLoai;
        this.laSachSeries = laSachSeries;
    }

    @Override
    public String toString() {
        return super.toString() + "\nThể loại: " + theLoai + "\nSách có thuộc loại series hay không? " + laSachSeries;
    }

}
