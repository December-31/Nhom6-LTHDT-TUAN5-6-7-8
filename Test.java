
public class Test {

    public static void main(String[] args) {
        Sach book1 = new Sach("S01", "Nhà giả kim", "Paulo Coelho", 1988, 6);
        book1.hienThiThongTin();
        Sach book2 = new Sach("Đắc nhân tâm", "Dale Carnegie", 1936);
        book2.setmaSach("S02");
        book2.setsoLuong(5);
        book2.hienThiThongTin();
        Sach book3 = new Sach();
        book3.setmaSach("S03");
        book3.settieuDe("Đọc vị bất kỳ ai");
        book3.settacGia("David J. Lieberman");
        book3.setnamXuatBan(2006);
        book3.setsoLuong(10);
        book3.hienThiThongTin();
    }
}
