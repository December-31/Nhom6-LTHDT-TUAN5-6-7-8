
public class Test {

    public static void main(String[] args) {
        QuanLySach ql = new QuanLySach();

        ql.themSach(new SachGiaoTrinh("SGT01", "Thực hành Excel từ cơ bản đến nâng cao", "Nguyễn Ngọc Linh", "Tin học cơ bản", "Đại học", 2021, 4));

        ql.themSach(new SachTieuThuyet("STT01", "Harry Potter", "J.K. Rowling", "Phiêu lưu", true, 1997, 10));

        ql.hienThiDanhSach();

        System.out.println("\nTìm sách theo mã 'SGT01':");
        Sach s = ql.timKiemTheoMa("SGT01");
        if (s != null) {
            System.out.println(s.toString());
        } else {
            System.out.println("Không tìm thấy sách!");
        }

        System.out.println("\nCập nhật sách 'SGT01'...");
        ql.capNhatSach("SGT01", "Vật lý nâng cao 10", "Tưởng Duy Hải", 2024, 5);

        System.out.println("\nXóa sách 'SGT01'...");
        if (ql.xoaSach("SGT01")) {
            System.out.println("Đã xóa thành công!");
        } else {
            System.out.println("Không tìm thấy mã để xóa!");
        }

        ql.hienThiDanhSach();
    }
}
