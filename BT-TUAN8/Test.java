import java.util.Scanner;
import java.util.List;
public class Test
{
    public static void main(String[] args)
    {
        IQuanLySach quanLy = new QuanLySachImpl();
        Sach book1=new SachGiaoTrinh("SGT01", "Thuc hanh Excel tu co ban den nang cao", "Nguyen Ngoc Linh", "Tin hoc co ban", "Dai hoc", 2021, 4, 80000);
        Sach book2=new SachTieuThuyet("STT01", "Harry Potter", "J.K. Rowling", "Phieu luu", true, 1997, 10, 90000);
        Scanner sc = new Scanner(System.in);
        quanLy.themSach(book1);
        quanLy.themSach(book2);
        int chon;
        do 
        {
            System.out.println("\n===== MENU QUAN LY SACH =====");
            System.out.println("1. Them sach giao trinh");
            System.out.println("2. Them sach tieu thuyet");
            System.out.println("3. Hien thi danh sach");
            System.out.println("4. Tim sach theo ma");
            System.out.println("5. Cap nhat sach");
            System.out.println("6. Xoa sach");
            System.out.println("7. Kiem tra ton kho");
            System.out.println("0. Thoat");
            System.out.print("Chon chuc nang: ");
            chon = sc.nextInt();
            sc.nextLine();
            switch (chon) 
            {
                case 1 -> 
                {
                    String ma;
                    do
                    {
                        System.out.print("Nhap ma sach: ");
                        ma = sc.nextLine();
                        if(quanLy.timKiemSach(ma)!=null)
                        {
                            System.out.println("Ma sach nay da co, vui long nhap lai: ");
                        }
                    }
                    while(quanLy.timKiemSach(ma)!=null);
                    System.out.print("Nhap tieu de: ");
                    String ten = sc.nextLine();
                    System.out.print("Nhap tac gia: ");
                    String tg = sc.nextLine();
                    System.out.print("Nhap mon hoc: ");
                    String mon = sc.nextLine();
                    System.out.print("Nhap cap do: ");
                    String capDo = sc.nextLine();
                    System.out.print("Nhap nam xuat ban: ");
                    int nam = sc.nextInt();
                    System.out.print("Nhap so luong: ");
                    int sl = sc.nextInt();
                    System.out.print("Nhap gia co ban: ");
                    double gia = sc.nextDouble();
                    Sach sach = new SachGiaoTrinh(ma, ten, tg, mon, capDo, nam, sl, gia);
                    quanLy.themSach(sach);
                    System.out.println("Da them sach giao trinh thanh cong!");
                }
                case 2 -> 
                {
                    String ma;
                    do
                    {
                        System.out.print("Nhap ma sach: ");
                        ma = sc.nextLine();
                        if(quanLy.timKiemSach(ma)!=null)
                        {
                            System.out.println("Ma sach nay da co, vui long nhap lai: ");
                        }
                    }
                    while(quanLy.timKiemSach(ma)!=null);
                    System.out.print("Nhap tieu de: ");
                    String ten = sc.nextLine();
                    System.out.print("Nhap tac gia: ");
                    String tg = sc.nextLine();
                    System.out.print("Nhap the loai: ");
                    String theLoai = sc.nextLine();
                    System.out.print("Sach co phai la series? (true/false): ");
                    boolean series = sc.nextBoolean();
                    System.out.print("Nhap nam xuat ban: ");
                    int nam = sc.nextInt();
                    System.out.print("Nhap so luong: ");
                    int sl = sc.nextInt();
                    System.out.print("Nhap gia co ban: ");
                    double gia = sc.nextDouble();
                    Sach sach = new SachTieuThuyet(ma, ten, tg, theLoai, series, nam, sl, gia);
                    quanLy.themSach(sach);
                    System.out.println("Da them sach tieu thuyet thanh cong!");
                }
                case 3 -> 
                {
                    List<Sach> ds = quanLy.hienThiDanhSach();
                    if (ds.isEmpty()) {
                        System.out.println("Danh sach rong!");
                    } else {
                        System.out.println("===== DANH SACH SACH =====");
                        for (Sach s : ds) {
                            System.out.println(s);
                        }
                    }
                }
                case 4 -> 
                {
                    System.out.print("Nhap ma sach can tim: ");
                    String ma = sc.nextLine();
                    Sach s = quanLy.timKiemSach(ma);
                    if (s != null) {
                        System.out.println("Tim thay sach:");
                        System.out.println(s);
                    } else {
                        System.out.println("Khong tim thay sach co ma: " + ma);
                    }
                }
                case 5 -> 
                {
                    System.out.print("Nhap ma sach can cap nhat: ");
                    String ma = sc.nextLine();
                    if(quanLy.timKiemSach(ma)==null)
                    {
                        System.out.println("Khong tim thay ma sach!");
                        break;
                    }
                    System.out.print("Nhap tieu de moi: ");
                    String tenMoi = sc.nextLine();
                    System.out.print("Nhap tac gia moi: ");
                    String tgMoi = sc.nextLine();
                    System.out.print("Nhap nam xuat ban moi: ");
                    int namMoi = sc.nextInt();
                    System.out.print("Nhap so luong moi: ");
                    int slMoi = sc.nextInt();

                    boolean kq = ((QuanLySachImpl) quanLy).capNhatSach(ma, tenMoi, tgMoi, namMoi, slMoi);
                    if (kq)
                        System.out.println("Cap nhat thanh cong!");
                    else
                        System.out.println("Khong tim thay sach can cap nhat!");
                }
                case 6 -> 
                {
                    System.out.print("Nhap ma sach can xoa: ");
                    String ma = sc.nextLine();
                    boolean kq = quanLy.xoaSach(ma);
                    if (kq)
                        System.out.println("Da xoa sach thanh cong!");
                    else
                        System.out.println("Khong tim thay sach can xoa!");
                }
                case 7 -> 
                {
                    System.out.print("Nhap so luong toi thieu can kiem tra: ");
                    int soLuongToiThieu = sc.nextInt();
                    sc.nextLine();
                    List<Sach> ds = quanLy.hienThiDanhSach();
                    for (Sach s : ds) {
                        if (s.kiemTraTonKho(soLuongToiThieu))
                            System.out.println(s.getmaSach() + " -> Đủ hàng trong kho");
                        else
                            System.out.println(s.getmaSach() + " -> Không đủ hàng");
                    }
                }
                case 0 -> System.out.println("Thoat chuong trinh!");
                default -> System.out.println("Lua chon khong hop le!");
            }
        } 
        while (chon != 0);
        sc.close();
    }
} 