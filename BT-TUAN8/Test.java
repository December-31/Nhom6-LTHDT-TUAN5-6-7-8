/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BT_TUAN5;
/**
 *
 * @author LENOVO
 */
import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        IQuanLySach ql = new QuanLySachImpl();
        Scanner sc=new Scanner(System.in);
        SachGiaoTrinh gt1 = new SachGiaoTrinh("GT01", "Lap trinh Java", "Nguyen Van A","t5", 2022, 10, 10000, "Dai hoc", "CNTT");
        SachGiaoTrinh gt2 = new SachGiaoTrinh("GT02", "Toan cao cap", "Le Thi B","t6", 2021, 5, 14000, "Dai hoc", "Toan hoc");
        SachTieuThuyet tt1 = new SachTieuThuyet("TT01", "harry potter", "j.r. rowling","t5", 1997, 20, 20500,  "fantasy", true);
        SachTieuThuyet tt2 = new SachTieuThuyet("TT02", "doraemon", "Fujiko F. Fujio","t7", 1980, 15, 19000, "thieu nhi", true);
        ql.themSach(gt1);
        ql.themSach(gt2);
        ql.themSach(tt1);
        ql.themSach(tt2);
        System.out.println("=== Danh sach ban dau ===");
        ql.hienThiTatCa();
        int a,i=2;
        do{
        System.out.println("\n----------------------------------");
        System.out.println("1.Hien thi tat ca.\n2. Tim sach.    3. Cap nhat Sach.\n4. Xoa sach.    5. Them Sach.\n6. Kiem ke       7.Cap nhap vi tri\n0. Thoat.");
        System.out.print("Nhap tuy chon: ");
        a=sc.nextInt();
        sc.nextLine();
        switch(a)
        {
            case 1:
                    ql.hienThiTatCa();
                    break;
            case 2:
                System.out.print("Nhap ma sach can tim: ");
                String matim=sc.nextLine(); 
                System.out.print(ql.timSachTheoMa(matim));
                break;
            case 3:
                System.out.print("1.Sach giao trinh     2. Sach tieu thuyet. \nNhap loai sach: ");
                int c=sc.nextInt();     
                sc.nextLine();
                if(c==1 || c==2)
                {
                    System.out.print("Nhap ma sach can cap nhat: ");
                    String masc=sc.nextLine();
                    if(ql.timSachTheoMa(masc)==null)
                        System.out.print("Nhap sai ma sach ");
                    else{                    
                        System.out.print("Cap nhat ma sach: ");
                        String ma=sc.nextLine();
                        if(ql.timSachTheoMa(ma)!=null)
                            System.out.print("Ma sach da co.");
                        else{
                        System.out.print("Cap nhat tieu de sach: ");
                        String ts=sc.nextLine();
                        System.out.print("Cap nhat tac gia: ");
                        String tg=sc.nextLine();
                        System.out.print("Cap nhat nam xuat ban: ");
                        int nxb=sc.nextInt();
                        System.out.print("Cap nhat so luong: ");
                        int sl=sc.nextInt();
                        System.out.print("Cap nhat gia co ban: ");
                        double gcb=sc.nextDouble();
                        sc.nextLine();
                        switch(c)
                        {
                            case 1:  
                                System.out.print("Cap nhat cap do sach: ");
                                String cd=sc.nextLine();
                                System.out.print("Cap nhat mon hoc: ");
                                String mh=sc.nextLine();
                                ql.capNhatSachGiaoTrinh(masc,ma, ts,tg,nxb,sl,gcb,cd,mh);   
                                System.out.println("=== Danh sach sau cap nhat ");
                                ql.hienThiTatCa();
                                break;
                            case 2:  
                                System.out.print("Cap nhat the loai sach: ");
                                String tl=sc.nextLine();
                                System.out.print("Cap nhat Series(true/false): ");
                                Boolean sr=sc.nextBoolean();
                                ql.capNhatSachTieuThuyet(masc,ma, ts,tg,nxb,sl,gcb,tl,sr);   
                                System.out.println("=== Danh sach sau cap nhat ");
                                ql.hienThiTatCa();
                                break;
                        }
                        }
                        }
                        
                }
                else
                    System.out.println("Lua chon khong hop le!");               
                break;
            case 4:
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
            case 5:
                System.out.print("1.Sach giao trinh     2. Sach tieu thuyet. \nNhap loai sach: ");
                int d=sc.nextInt();     
                sc.nextLine();
                if(d==1 || d==2)
                {
                System.out.print("Nhap ma sach: ");
                String ma=sc.nextLine();
                if(ql.timSachTheoMa(ma)!=null)
                            System.out.print("Ma sach da co.");
                else{
                System.out.print("Nhap tieu de sach: ");
                String ts=sc.nextLine();
                System.out.print("Nhap tac gia: ");
                String tg=sc.nextLine();
                System.out.print("Nhap Vi tri: ");
                String vt=sc.nextLine();
                System.out.print("Nhap nam xuat ban: ");
                int nxb=sc.nextInt();
                System.out.print("Nhap so luong: ");
                int sl=sc.nextInt();
                System.out.print("Nhap gia co ban: ");
                double gcb=sc.nextDouble();
                sc.nextLine();
                switch(d){
                    case 1:
                       System.out.print("Nhap mon hoc: ");
                       String mh=sc.nextLine();
                       System.out.print("Nhap cap do: ");
                       String cd=sc.nextLine(); 
                       SachGiaoTrinh t1 = new SachGiaoTrinh(ma, ts, tg,vt, nxb, sl, gcb, cd,mh);
                       ql.themSach(t1); 
                       System.out.println("=== Danh sach sau khi them ");
                       ql.hienThiTatCa();
                       break;
                    case 2:
                       System.out.print("Nhap the loai: ");
                       String tl=sc.nextLine();
                       System.out.print("la sach series (true/false): ");
                       boolean sr=sc.nextBoolean();   
                       SachTieuThuyet t2 = new SachTieuThuyet(ma, ts, tg,vt, nxb, sl, gcb, tl,sr);
                       ql.themSach(t2); 
                       System.out.println("=== Danh sach sau khi them ");
                       ql.hienThiTatCa();
                       break;
                    }
                }              
                }
                else
                    System.out.println("Lua chon khong hop le!");
                break;
            case 6:
                {
                    System.out.print("Nhap vao so luong toi thieu:");
                    int soLuongToiThieu = sc.nextInt();
                    sc.nextLine();
                    for (Sach s : ql.getdanhSach())
                    {
                        if (s.kiemTraTonKho(soLuongToiThieu))
                            System.out.println("Sach voi ma " + s.getMaSach() + " con ton kho");
                        else
                            System.out.println("Sach voi ma " + s.getMaSach() + " khong con ton kho");
                    }
                }
                break;
                case 7:
                    System.out.println("Nhap vao sach can chuyen vi tri:");
                    String maSach=sc.nextLine();
                    if (ql.timSachTheoMa(maSach)==null)
                    {
                        System.out.println("Khong tim thay sach voi ma "+maSach+" de chuyen vi tri");
                    }
                    else
                    {
                        System.out.println("Nhap vao vi tri can chuyen sach:");
                        String viTriM=sc.nextLine();
                        Sach s = ql.timSachTheoMa(maSach);
                        s.capNhatViTri(viTriM);
                    }
                    break;    
        }
        if(a<0 || a>7)
                System.out.println("Tuy chon khong hop le");
        }while(a!=0);
    }
}
