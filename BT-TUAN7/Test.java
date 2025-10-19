import java.util.Scanner;
public abstract class Test 
{
    public static void main(String[] args) 
    {
        QuanLySach ql = new QuanLySach();
        ql.themSach(new SachGiaoTrinh("SGT01", "Thuc hanh Excel tu co ban den nang cao", "Nguyen Ngoc Linh", "Tin hoc co ban", "Dai hoc", 2021, 4, 80000));
        ql.themSach(new SachTieuThuyet("STT01", "Harry Potter", "J.K. Rowling", "Phieu luu", true, 1997, 10, 90000));
        ql.hienThiDanhSach();
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nTìm sách theo mã: ");
        String ma = scanner.nextLine();
        Sach s = ql.timKiemTheoMa(ma);
        if (s!=null) 
        {
            System.out.println(s.toString());
        } 
        else 
        {   
            System.out.println("Khong tim thay sach!");
        }
        System.out.println("\nCap nhat sach 'SGT01'...");
        ql.capNhatSach("SGT01", "Vat ly nang cao 10", "Tuong Duy Hai", 2024, 5);
        ql.hienThiDanhSach();
        System.out.println("\nXoa sach 'SGT01'...");
        if (ql.xoaSach("SGT01")) 
        {
            System.out.println("Da xoa thanh cong!");
        } 
        else 
        {
            System.out.println("Khong tim thay ma de xoa!");
        }
        ql.hienThiDanhSach();
    }
}
