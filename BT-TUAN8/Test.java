import java.util.Scanner;

public class Test {
    public static void main(String[] args) 
    {
        IQuanLySach quanLy = new QuanLySachImpl();
        Scanner sc = new Scanner(System.in);
        System.out.println("\n");
        quanLy.hienThiDanhSach();
        System.out.println("\n--TAO DOI TUONG--");
        quanLy.themSach(new SachGiaoTrinh("S01", "Co so du lieu I", "Zoro", 2021, 10,"1", 5000, "CSDLI","Dai hoc"));
        quanLy.themSach(new SachTieuThuyet("S02", "Huong toi vi sao sang", "Nami", 2020, 9, "2", 10000, "Trinh tham", true));
        quanLy.themSach(new SachGiaoTrinh("S03", "Co so du lieu II", "Robin", 2021, 10,"3", 20000, "CSDLII", "Dai hoc"));
        quanLy.themSach(new SachTieuThuyet("S04", "Con duong cua nang", "SanJi", 2022, 9,"4", 7000, "Trinh tham",false));
        quanLy.hienThiDanhSach();
        int chon;
        do 
        {
            System.out.println("----MENU----");
            System.out.println("1. Them sach vao danh sach hien co.");
            System.out.println("2. Hien thi danh sach.");
            System.out.println("3. Tim kiem sach.");
            System.out.println("4. Cap nhat sach.");
            System.out.println("5. Xoa sach.");
            System.out.println("6. Kiem ke.");
            System.out.println("7. Cap nhat vi tri.");
            System.out.println("0. Thoat.");
            System.out.print("Nhap lua chon: ");
            chon = sc.nextInt();
            sc.nextLine();
            switch (chon) 
            {
                case 1: 
                {
                    System.out.println("1. Them Sach Giao Trinh");
                    System.out.println("2. Them Sach Tieu Thuyet");
                    System.out.print("Chon loai sach: ");
                    int loai = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Nhap ma sach: ");
                    String maSach = sc.nextLine();
                    if (quanLy.timKiemSach(maSach)!=null)
                    {
                        System.out.println("Da ton tai sach voi ma "+maSach);
                    }
                    else
                    {
                        System.out.print("Nhap tieu de: ");
                        String tieuDe = sc.nextLine();
                        System.out.print("Nhap tac gia: ");
                        String tacGia = sc.nextLine();
                        System.out.print("Nhap nam xuat ban: ");
                        int namXuatBan = sc.nextInt();
                        System.out.print("Nhap so luong: ");
                        int soLuong = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Nhap vi tri:");
                        String viTri=sc.nextLine();
                        System.out.print("Nhap gia co ban: ");
                        double giaCoBan = sc.nextDouble();
                        sc.nextLine();
                        if (loai == 1) 
                        {
                            System.out.print("Nhap mon hoc: ");
                            String monHoc = sc.nextLine();
                            System.out.print("Nhap cap do: ");
                            String capDo = sc.nextLine();
                            quanLy.themSach(new SachGiaoTrinh(maSach, tieuDe, tacGia, namXuatBan, soLuong,viTri, giaCoBan, monHoc, capDo));
                        } 
                        else 
                        {
                            System.out.print("Nhap the loai: ");
                            String theLoai = sc.nextLine();
                            System.out.print("Co phai sach series? (true/false): ");
                            boolean series = sc.nextBoolean();
                            sc.nextLine();
                            quanLy.themSach(new SachTieuThuyet(maSach, tieuDe, tacGia, namXuatBan, soLuong,viTri, giaCoBan, theLoai, series));
                        }
                        System.out.println("Da them sach voi ma "+maSach);
                    }
                }
                break;
                case 2:
                    quanLy.hienThiDanhSach();
                    break;

                case 3: 
                {
                    System.out.print("Nhap ma sach can tim: ");
                    String maTim = sc.nextLine();
                    quanLy.kquaTimKiem(maTim);
                }
                break;
                case 4: 
                {
                    System.out.print("Nhap ma sach can cap nhat: ");
                    String maCanCapNhat = sc.nextLine();
                    Sach sachCapNhat = quanLy.timKiemSach(maCanCapNhat);
                    if (sachCapNhat == null) 
                    {
                        System.out.println("Khong tim thay sach voi ma: "+maCanCapNhat+" de cap nhat!");
                    } 
                    else
                    {
                        System.out.println("Nhap vao cac du lieu can cap nhat:");
                        System.out.print("Nhap tieu de moi: ");
                        String tieuDe = sc.nextLine();
                        System.out.print("Nhap tac gia moi: ");
                        String tacGia = sc.nextLine();
                        System.out.print("Nhap nam xuat ban moi: ");
                        int namXuatBan = sc.nextInt();
                        System.out.print("Nhap so luong moi: ");
                        int soLuong = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Nhap vi tri moi:");
                        String viTri=sc.nextLine();
                        System.out.print("Nhap gia co ban moi: ");
                        double giaCoBan = sc.nextDouble();
                        sc.nextLine();
                        if (sachCapNhat instanceof SachGiaoTrinh) 
                        {
                            System.out.print("Nhap mon hoc moi: ");
                            String monHoc = sc.nextLine();
                            System.out.print("Nhap cap do moi: ");
                            String capDo = sc.nextLine();
                            Sach sachMoi = new SachGiaoTrinh(maCanCapNhat,tieuDe, tacGia, namXuatBan, soLuong,viTri, giaCoBan, monHoc, capDo);
                            quanLy.capNhat(maCanCapNhat,sachMoi);
                        } 
                        else 
                            if (sachCapNhat instanceof SachTieuThuyet) 
                            {
                                System.out.print("Nhap the loai moi: ");
                                String theLoai = sc.nextLine();
                                System.out.print("Co phai sach series? (true/false): ");
                                boolean series = sc.nextBoolean();
                                sc.nextLine();
                                Sach sachMoi = new SachTieuThuyet(maCanCapNhat,tieuDe,tacGia,namXuatBan,soLuong,viTri,giaCoBan,theLoai,series);
                                quanLy.capNhat(maCanCapNhat,sachMoi);
                            } 
                        System.out.println("Da cap nhat sach voi ma "+maCanCapNhat);
                    }
                }
                break;
                case 5: 
                {
                    System.out.print("Nhap ma sach can xoa: ");
                    String maXoa = sc.nextLine();
                    if (quanLy.xoaSach(maXoa)==null)
                    {
                        System.out.println("Khong the xoa sach voi ma "+maXoa);
                    }
                    else
                    {
                        System.out.println("Da xoa sach voi ma "+maXoa);
                    }
                }
                break;
                case 6:
                {
                    System.out.print("Nhao vao so luong toi thieu:");
                    int soLuongToiThieu = sc.nextInt();
                    sc.nextLine();
                    for (Sach s : quanLy.getdanhSach())
                    {
                        if (s.kiemTraTonKho(soLuongToiThieu))
                            System.out.println("Sach voi ma " + s.getmaSach() + " con ton kho");
                        else
                            System.out.println("Sach voi ma " + s.getmaSach() + " khong con ton kho");
                    }
                }
                break;
                case 7:
                    System.out.println("Nhap vao sach can chuyen vi tri:");
                    String maSach=sc.nextLine();
                    if (quanLy.timKiemSach(maSach)==null)
                    {
                        System.out.println("Khong tim thay sach voi ma "+maSach+" de chuyen vi tri");
                    }
                    else
                    {
                        System.out.println("Nhap vao vi tri can chuyen sach:");
                        String viTriM=sc.nextLine();
                        Sach s = quanLy.timKiemSach(maSach);
                        s.capNhatViTri(viTriM);
                    }
                    break;
                case 0:
                    System.out.println("Da thoat chuong trinh!");
                    break;
                default:
                    System.out.println("Nhap sai, vui long nhap lai!");
                    break;
            }
        } 
        while (chon != 0);
    }
}
