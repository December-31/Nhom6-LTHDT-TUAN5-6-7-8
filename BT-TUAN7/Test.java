package BT_TUAN5;
import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        QuanLySach ql = new QuanLySach();
        Scanner sc=new Scanner(System.in);
        SachGiaoTrinh gt1 = new SachGiaoTrinh("GT01", "Lap trinh Java", "Nguyen Van A", 2022, 10, 10000, "Dai hoc", "CNTT");
        SachGiaoTrinh gt2 = new SachGiaoTrinh("GT02", "Toan cao cap", "Le Thi B", 2021, 5, 14000, "Dai hoc", "Toan hoc");
        SachTieuThuyet tt1 = new SachTieuThuyet("TT01", "harry potter", "j.r. rowling", 1997, 20, 20500,  "fantasy", true);
        SachTieuThuyet tt2 = new SachTieuThuyet("TT02", "doraemon", "Fujiko F. Fujio", 1980, 15, 19000, "thieu nhi", true);
        ql.themSach(gt1);
        ql.themSach(gt2);
        ql.themSach(tt1);
        ql.themSach(tt2);
        System.out.println("=== Danh sach ban dau ===");
        ql.hienThiTatCa();
        int a,i=2;
        do{
        System.out.println("\n----------------------------------");
        System.out.println("1. Tim sach.    2. Cap nhat Sach.\n3. Xoa sach.    4.Them Sach.\n0. Thoat.");
        System.out.print("Nhap tuy chon: ");
        a=sc.nextInt();
        sc.nextLine();
        switch(a)
        {
            case 1:
                System.out.print("Nhap ma sach can tim: ");
                String matim=sc.nextLine(); 
                System.out.print(ql.timSachTheoMa(matim));
                break;
            case 2:
                System.out.print("Nhap ma sach can cap nhat: ");
                String masc=sc.nextLine();
                if(ql.timSachTheoMa(masc)==null)
                    System.out.print("Nhap sai ma sach ");
                else{
                    System.out.print("Cap nhat ma sach: ");
                    String ma=sc.nextLine();
                    System.out.print("Cap nhat tieu de sach: ");
                    String ts=sc.nextLine();
                    System.out.print("Cap nhat tac gia: ");
                    String tg=sc.nextLine();
                    System.out.print("Cap nhat so luong: ");
                    int sl=sc.nextInt();
                    System.out.print("Cap nhat gia co ban: ");
                    double gcb=sc.nextDouble();
                    sc.nextLine();
                    ql.capNhatSach(masc,ma, tg,ts,sl,gcb);   
                    System.out.println("=== Danh sach sau cap nhat ");
                    ql.hienThiTatCa();
                }
                break;
            case 3:
                System.out.print("Nhap ma sach can xoa: ");
                String max=sc.nextLine();
                if(ql.timSachTheoMa(max)==null)
                    System.out.print("Nhap sai ma sach ");
                else{
                ql.xoaSach(max);
                System.out.println("=== Danh sach sau khi xoa ");
                ql.hienThiTatCa();
                }
                break;
            case 4:
                System.out.print("1.Sach giao trinh     2. Sach tieu thuyet. \nNhap loai sach: ");
                int c=sc.nextInt();     
                sc.nextLine();
                System.out.print("Nhap ma sach: ");
                String ma=sc.nextLine();
                System.out.print("Nhap tieu de sach: ");
                String ts=sc.nextLine();
                System.out.print("Nhap tac gia: ");
                String tg=sc.nextLine();
                System.out.print("Nhap nam xuat ban: ");
                int nxb=sc.nextInt();
                System.out.print("Nhap so luong: ");
                int sl=sc.nextInt();
                System.out.print("Nhap gia co ban: ");
                double gcb=sc.nextDouble();
                sc.nextLine();
                switch(c){
                    case 1:
                       System.out.print("Nhap mon hoc: ");
                       String mh=sc.nextLine();
                       System.out.print("Nhap cap do: ");
                       String cd=sc.nextLine(); 
                       SachGiaoTrinh t1 = new SachGiaoTrinh(ma, ts, tg, nxb, sl, gcb, mh,cd);
                       ql.themSach(t1); 
                       System.out.println("=== Danh sach sau khi them ");
                       ql.hienThiTatCa();
                       break;
                    case 2:
                       System.out.print("Nhap the loai: ");
                       String tl=sc.nextLine();
                       System.out.print("la sach series (true/false): ");
                       boolean sr=sc.nextBoolean();   
                       SachTieuThuyet t2 = new SachTieuThuyet(ma, ts, tg, nxb, sl, gcb, tl,sr);
                       ql.themSach(t2); 
                       System.out.println("=== Danh sach sau khi them ");
                       ql.hienThiTatCa();
                       break;
                    default:
                        System.out.println("Lua chon khong hop le!");
                }
                default:
                        System.out.println("Lua chon khong hop le!");
        }
        }while(a!=0);
    }
}
