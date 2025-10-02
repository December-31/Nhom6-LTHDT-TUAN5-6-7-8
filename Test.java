public class Test 
{
    public static void main(String[] args)
    {
        Sach book1 = new Sach("A01","Hat giong tam hon","Abram",2022,3);
        book1.hienThiThongTin();
        Sach book2 = new Sach("Cuoc song huu han","Jack Phitton",2023);
        book2.hienThiThongTin();
        Sach book3 = new Sach();
        book3.setmaSach("A02");
        book3.settieuDe("Ghi chep phap y");
        book3.settacGia("Luu Hieu Huy");
        book3.setnamXuatBan(2020);
        book3.setsoLuong(12);
        book3.hienThiThongTin();
    }
}
