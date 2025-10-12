
public class SachGiaoTrinh extends Sach {

    private String monHoc;
    private String capDo;

    public SachGiaoTrinh(String maSach, String tieuDe, String tacGia, String monHoc, String capDo, int namXuatBan, int soLuong) {
        super(maSach, tieuDe, tacGia, namXuatBan, soLuong);
        this.monHoc = monHoc;
        this.capDo = capDo;
    }

    @Override
    public String toString() {
        return super.toString() + "\nMôn học: " + monHoc + "\nCấp độ: " + capDo;
    }

}
