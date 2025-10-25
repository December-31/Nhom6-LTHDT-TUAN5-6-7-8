/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ACER
 */
import java.util.Scanner;
public class Test 
{
    static Scanner sc = new Scanner(System.in);
    public static void main(String args[]) 
    {
        IQuanLySach quanLy = new QuanLySachImpl();
        QuanLySachImpl ql = (QuanLySachImpl) quanLy;
        
        Sach Cuon1 = new SachTieuThuyet("B0001","Dao giau vang","Phieu luu", false, "Robert Louis Stevenson","A",1883,17000,7);
        quanLy.ThemSach(Cuon1);
        
        SachGiaoTrinh Cuon2 = new SachGiaoTrinh("B0002","Giai Tich","Chuyen nganh Toan","Dai hoc","Nguyen Dinh Huy","B", 2015,12000,3);
        quanLy.ThemSach(Cuon2);
        
        SachTieuThuyet Cuon3 = new SachTieuThuyet();
        Cuon3.setMaSach("B0003");
        Cuon3.setTieuDe("Hat bui trong mua");
        Cuon3.setTheLoai("Tinh cam lang man");
        Cuon3.setLaSachSeries(false);
        Cuon3.setTacGia("Petrichor");
        Cuon3.setViTri("A");
        Cuon3.setNamXuatBan(1773);
        Cuon3.setGiaCoBan(50000);
        Cuon3.setSoLuong(2);
        quanLy.ThemSach(Cuon3);
        
        Sach Cuon4 = new SachGiaoTrinh("B0004", "Giai Phau", "Y", "Dai Hoc", "Dai hoc Y Ha Noi","B", 2022, 12000,1);
        quanLy.ThemSach(Cuon4);
        
        Sach Cuon5 = new SachTieuThuyet("B0005", "Harry Potter", "Ky ao", true, "J. K. Rowling","A", 1997, 30000,7);
        quanLy.ThemSach(Cuon5);
        
        quanLy.HienThiDS();
        
        System.out.println("========== MENU ==========");
        System.out.println("1. Them sach.");
        System.out.println("2. Xoa sach.");
        System.out.println("3. Cap nhat sach.");
        System.out.println("4. Tim kiem sach.");
        System.out.println("5. Cap nhap vi tri.");
        System.out.println("6. Kiem ke.");
        System.out.println("7. Hien thi danh sach.");
        System.out.println("0. Thoat.");
        System.out.println("==========================");
        int lchon;
        do
        {
            System.out.print("Nhap lua chon: ");
            lchon = Integer.parseInt(sc.nextLine());
            switch (lchon) 
            {
                case 1:
                {
                    System.out.println("=== CHON LOAI SACH CAN THEM ===");
                    System.out.println("1. Sach Giao Trinh");
                    System.out.println("2. Sach Tieu Thuyet");
                    int lChonSach;
                    do {
                        System.out.print("- Lua chon: ");
                        lChonSach = Integer.parseInt(sc.nextLine());
                        if (lChonSach == 1)
                            System.out.println("\n=== NHAP THONG TIN SACH GIAO TRINH ===");
                        else if (lChonSach == 2)
                            System.out.println("\n=== NHAP THONG TIN SACH TIEU THUYET ===");
                        else
                            System.out.println("Lua chon khong hop le! Khong the them sach.");
                    } while (lChonSach != 1 && lChonSach != 2);
                    
                    String MaSach;
                    do{
                    System.out.print("Nhap ma sach: ");
                    MaSach = sc.nextLine();

                    if (quanLy.TimKiem(MaSach) != null)
                        System.out.println("Da ton tai ma sach " + MaSach);
                    }while(quanLy.TimKiem(MaSach) != null);

                    System.out.print("Tieu de: ");
                    String TieuDe = sc.nextLine();

                    System.out.print("Tac gia: ");
                    String TacGia = sc.nextLine();

                    System.out.print("Nam xuat ban: ");
                    int NamXuatBan = sc.nextInt();
                    sc.nextLine();

                    System.out.print("So luong: ");
                    int SoLuong = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Vi tri: ");
                    String ViTri = sc.nextLine();

                    System.out.print("Gia co ban: ");
                    double GiaCoBan = sc.nextDouble();
                    sc.nextLine();

                    switch (lChonSach) 
                    {
                        case 1: {
                            System.out.print("Mon hoc: ");
                            String MonHoc = sc.nextLine();
                            System.out.print("Cap do: ");
                            String CapDo = sc.nextLine();
                            quanLy.ThemSach(new SachGiaoTrinh(MaSach, TieuDe, MonHoc, CapDo, TacGia, ViTri, NamXuatBan, GiaCoBan, SoLuong));
                            SachGiaoTrinh sach = (SachGiaoTrinh) quanLy.TimKiem(MaSach);
                            sach.hienThiThongTin();
                            break;
                        }
                        case 2: {
                            System.out.print("The loai: ");
                            String TheLoai = sc.nextLine();
                            System.out.print("Co phai sach series?: ");
                            boolean LaSachSeries = sc.nextBoolean();
                            sc.nextLine();
                            quanLy.ThemSach(new SachTieuThuyet(MaSach, TieuDe, TheLoai, LaSachSeries, TacGia, ViTri, NamXuatBan, GiaCoBan, SoLuong));
                            SachTieuThuyet sach = (SachTieuThuyet) quanLy.TimKiem(MaSach);
                            sach.hienThiThongTin();
                            break;
                        }
                    }
                    quanLy.HienThiDS();
                    break;
                }
                case 2:
                    System.out.print("Nhap ma sach can xoa: ");
                    String maSachXoa = sc.nextLine();
                    quanLy.XoaSach(maSachXoa);
                    quanLy.HienThiDS();
                    break;
                case 3:
                {
                    System.out.print("Nhap ma sach can cap nhap: ");
                    String MaSach = sc.nextLine();
                    if (quanLy.TimKiem(MaSach) != null)
                    {
                        System.out.print("Tieu de: ");
                        String TieuDe = sc.nextLine();

                        System.out.print("Tac gia: ");
                        String TacGia = sc.nextLine();

                        System.out.print("Nam xuat ban: ");
                        int NamXuatBan = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Gia co ban: ");
                        double GiaCoBan = sc.nextDouble();
                        sc.nextLine();

                        System.out.print("So luong: ");
                        int SoLuong = sc.nextInt();
                        sc.nextLine();

                        quanLy.CapNhapSach(MaSach, TieuDe, TacGia, NamXuatBan, GiaCoBan, SoLuong);
                        
                        if (quanLy.TimKiem(MaSach) instanceof SachGiaoTrinh)
                        {
                            System.out.print("Mon hoc: ");
                            String MonHoc = sc.nextLine();
                            System.out.print("Cap do: ");
                            String CapDo = sc.nextLine();
                            SachGiaoTrinh BoSung = (SachGiaoTrinh) quanLy.TimKiem(MaSach);
                            BoSung.setMonHoc(MonHoc);
                            BoSung.setCapDo(CapDo);
                            BoSung.hienThiThongTin();
                        }
                        if (quanLy.TimKiem(MaSach) instanceof SachTieuThuyet)
                        {
                            System.out.print("The loai: ");
                            String TheLoai = sc.nextLine();
                            System.out.print("Co phai sach series?: ");
                            boolean LaSachSeries = sc.nextBoolean();
                            sc.nextLine();
                            SachTieuThuyet BoSung = (SachTieuThuyet) quanLy.TimKiem(MaSach);
                            BoSung.setTheLoai(TheLoai);
                            BoSung.setLaSachSeries(LaSachSeries);
                            BoSung.hienThiThongTin();
                        }
                    }
                    else
                        System.out.println("Khong tim thay ma sach: " + MaSach);
                    break;
                }
                case 4:
                {
                    System.out.print("Nhap ma sach can tim: ");
                    String STimKiem = sc.nextLine();

                    Sach x = quanLy.TimKiem(STimKiem);
                    quanLy.KQTimKiem(x);
                }
                    break;

                case 5:
                {
                    System.out.print("Nhap ma sach can cap nhap vi tri: ");
                    String MaSach = sc.nextLine();
                    if (quanLy.TimKiem(MaSach)!=null)
                    {
                        System.out.print("Nhap vi tri moi: ");
                        String ViTri = sc.nextLine();
                        quanLy.TimKiem(MaSach).capNhatViTri(ViTri);
                        ql.TimKiem(MaSach).hienThiThongTin();
                    }
                    else
                        System.out.println("Khong tim thay ma sach: " + MaSach);
                }
                
                    break;

                case 6:
                {
                    System.out.print("Nhao vao so luong toi thieu: ");
                    int soLuongToiThieu = sc.nextInt();
                    sc.nextLine();
                    for (Sach s : ql.getDS())
                    {
                        if (s.kiemTraTonKho(soLuongToiThieu))
                            System.out.println("Sach voi ma " + s.getMaSach() + " con ton kho");
                        else
                            System.out.println("Sach voi ma " + s.getMaSach() + " khong con ton kho");
                    }
                }
                    break;

                case 7:
                {
                    quanLy.HienThiDS();
                }
                    break;

                case 0:
                    System.out.println("Ket thuc...");
                    break;

                default:
                    System.out.println("Lua chon khong hop le. Vui long nhap lai!");
            }
        }while(lchon!=0);     
    }
}

