package BT;
import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        IQuanLySach quanly = new QuanLySachImpl();
        IQuanLyKho QLKho = (IQuanLyKho) quanly;
        Scanner sc=new Scanner(System.in);
        SachGiaoTrinh gt1 = new SachGiaoTrinh("GT01", "Lap trinh Java", "Nguyen Van A","t5", 2022, 10, 10000, "Dai hoc", "CNTT");
        SachGiaoTrinh gt2 = new SachGiaoTrinh("GT02", "Toan cao cap", "Le Thi B","t6", 2021, 5, 14000, "Dai hoc", "Toan hoc");
        SachTieuThuyet tt1 = new SachTieuThuyet("TT01", "harry potter", "j.r. rowling","t5", 1997, 20, 20500,  "fantasy", true);
        SachTieuThuyet tt2 = new SachTieuThuyet("TT02", "doraemon", "Fujiko F. Fujio","t7", 1980, 15, 19000, "thieu nhi", true);
        quanly.themSach(gt1);
        quanly.themSach(gt2);
        quanly.themSach(tt1);
        quanly.themSach(tt2);
        System.out.println("=== Danh sach ban dau ===");
        quanly.hienThiTatCa();
        int a;
        do{
        System.out.println("\n---------------MENU-------------------");
        System.out.println("1. Hien thi tat ca.\n2. Tim sach.    3. Cap nhat Sach.\n4. Xoa sach.    5. Them Sach.\n6. Kiem ke      7. Cap nhap vi tri\n8. Quan ly kho\n0. Thoat.");
        System.out.print("Nhap tuy chon: ");
        a=sc.nextInt();
        sc.nextLine();
        switch(a)
        {
            case 1:
                    quanly.hienThiTatCa();
                    break;
            case 2:    
                System.out.print("Nhap ma sach can tim: "); 
                String matim=sc.nextLine();               
                if (quanly.timSachTheoMa(matim)!=null){
                    System.out.println("Da tim thay Sach:");
                    System.out.print(quanly.timSachTheoMa(matim));
                }
                else
                    System.out.println("Khong tim thay Sach.");
                break;
            case 3:
                System.out.print("Nhap ma sach can cap nhat: "); 
                String mascn=sc.nextLine();
                if (quanly.timSachTheoMa(mascn)!= null){
                    Sach s=quanly.timSachTheoMa(mascn);
                    System.out.println("Cap nhat lai thong tin cua Sach :");
                    if(quanly.capNhatSach(s)==false)
                        System.out.println("Cap nhat sach that bai!");
                    else
                    {
                        System.out.println("=== Danh sach sau khi cap nhat ===");
                        quanly.hienThiTatCa();
                    }
                }
                else 
                    System.out.println("Nhap Ma sach sai!");                   
                break;
            case 4:
                System.out.print("Nhap ma sach can xoa: ");
                String max=sc.nextLine();
                if(quanly.timSachTheoMa(max)==null)
                    System.out.print("Nhap sai ma sach ");
                else{
                quanly.xoaSach(max);
                System.out.println("=== Danh sach sau khi xoa ===");
                quanly.hienThiTatCa();
                }
                break;
            case 5:
                System.out.print("1.Sach giao trinh     2. Sach tieu thuyet. \nNhap loai sach can them : ");
                int st=sc.nextInt();
                sc.nextLine();
                switch(st){
                    case 1:
                        System.out.println("Nhap cac thong tin cua Sach giao trinh moi:");
                        SachGiaoTrinh sgt=new SachGiaoTrinh();
                        if(quanly.capNhatSach(sgt)==false)
                             System.out.println("Them sach that bai!");                       
                        else
                        {
                            quanly.themSach(sgt);
                            System.out.println("=== Danh sach sau khi them === ");
                            quanly.hienThiTatCa();
                        }
                        break;
                    case 2:
                        System.out.println("Nhap cac thong tin cua Sach tieu thuyet moi:");
                        SachTieuThuyet stt=new SachTieuThuyet();
                        if(quanly.capNhatSach(stt)==false)
                             System.out.println("Them sach that bai!");                       
                        else
                        {
                            quanly.themSach(stt);
                            System.out.println("=== Danh sach sau khi them === ");
                            quanly.hienThiTatCa();
                        };
                        break;
                    default:
                        System.out.println("Lua chon khong hop le!");
                }       
                break;
            case 6:
                {                                      
                    int soLuongToiThieu;
                    while(true)
                    {  
                        try{                    
                            System.out.print("Nhap vao so luong toi thieu:");
                            soLuongToiThieu = Integer.parseInt(sc.nextLine());                  
                            if (soLuongToiThieu < 0) 
                                    System.out.println("So luong toi thieu phai lon hon hoac bang 0. \nNhap lai du lieu. ");
                            else{                            
                                break;
                            }
                        }catch (java.util.InputMismatchException e) {
                            System.out.println("Du lieu nhap vao khong dung kieu du lieu (int). \nNhap lai du lieu. ");
                            sc.nextLine();
                        }
                    }
                    for (Sach s : quanly.getdanhSach())
                    {
                        if (s.kiemTraTonKho(soLuongToiThieu))
                            System.out.println("Sach voi ma " + s.getMaSach() + " con ton kho");
                        else
                            System.out.println("Sach voi ma " + s.getMaSach() + " khong con ton kho");
                    }
                }
                break;
                case 7:
                    System.out.print("Nhap vao ma sach can chuyen vi tri:");
                    String maSach=sc.nextLine();
                    if (quanly.timSachTheoMa(maSach)==null)
                    {
                        System.out.println("Khong tim thay sach voi ma "+maSach+" de chuyen vi tri");
                    }
                    else
                    {
                        System.out.print("Nhap vao vi tri can chuyen sach:");
                        String viTriM=sc.nextLine();
                        Sach s = quanly.timSachTheoMa(maSach);
                        s.capNhatViTri(viTriM);
                    }
                    break;  
                case 8:
                    System.out.print("1. Nhap kho     2. xuat kho     3. Kiem tra so luong \nNhap tuy chon: ");
                    int b=sc.nextInt();
                    switch (b) {
                        case 1:
                            QLKho.Nhapkho();
                            break;
                        case 2:
                            QLKho.Xuatkho();
                            break;
                        case 3:
                            QLKho.Kiemtrasoluong();
                            break;
                        default:
                            System.out.println("Tuy chon khong hop le!");
                    }
                    break;
            default:
                System.out.println("Tuy chon khong hop le!");
        }
        }while(a!=0);
    }
}
