package BT;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;
public class QuanLySachImpl implements IQuanLySach, IQuanLyKho{
    private ArrayList<Sach> danhSach;
    Scanner sc= new Scanner(System.in);
    public QuanLySachImpl() {
        danhSach = new ArrayList<>();
    }
    @Override
    public ArrayList<Sach> getdanhSach() 
    {
        return danhSach;
    }
    @Override
    public void themSach(Sach s) {
        danhSach.add(s);
    }
    @Override
    public void xoaSach(String maSach) {
        Iterator<Sach> iterator = danhSach.iterator();
        while (iterator.hasNext()) {
            Sach s = iterator.next();
            if (s.getMaSach().equalsIgnoreCase(maSach)) {
                iterator.remove();
                System.out.println("Da xoa Sach co Ma "+maSach+" thanh cong");
            }
        }
    }
    @Override
    public Sach timSachTheoMa(String mat) {                
        for (Sach s : danhSach) {
            if (s.getMaSach().equalsIgnoreCase(mat)) 
                return s;
        }
        return null;
    }
    @Override
    public Boolean capNhatSach(Sach s) {
        System.out.print("Nhap Ma sach : ");
        String ms=sc.nextLine();
        if (timSachTheoMa(ms)==null || (s.getMaSach() != null && s.getMaSach().equalsIgnoreCase(ms)))
        {
            s.setMaSach(ms);
            System.out.print("Nhap Tieu de : ");
            String td=sc.nextLine();
            s.setTieuDe(td);
            System.out.print("Nhap Tac gia : ");
            String tg=sc.nextLine();    
            s.setTacGia(tg);
            System.out.print("Nhap Vi tri : ");
            String vt=sc.nextLine();    
            s.setViTri(vt);
            System.out.print("Nhap Nam xuat ban : ");
            int mxb=sc.nextInt();    
            s.setNamXuatBan(mxb);
            System.out.print("Nhap So luong : ");
            int sl=sc.nextInt(); 
            s.setSoLuong(sl); 
            System.out.print("Nhap Gia co ban : ");
            int gcb=sc.nextInt();
            sc.nextLine();
            s.setGiaCoBan(gcb); 
            if ( s instanceof SachGiaoTrinh sgt) {
                System.out.print("Nhap Cap do : ");
                String cd=sc.nextLine(); 
                sgt.setCapDo(cd);
                System.out.print("Nhap Mon hoc : ");
                String mh=sc.nextLine(); 
                sgt.setMonHoc(mh); 
                return true;
            }
            else
            {
                SachTieuThuyet stt=(SachTieuThuyet) s;
                System.out.print("Nhap The loai : ");
                String tl=sc.nextLine(); 
                stt.setTheLoai(tl);
                System.out.print("Nhap Series(true/false) : ");
                Boolean sr=sc.nextBoolean();
                stt.setLaSachSeries(sr);
                sc.nextLine();
                return true;
            }
        }
        else
        {
            System.out.println("Ma sach da co.");
            return false;
        }       
    }
    @Override
    public void hienThiTatCa() {
        for (Sach s : danhSach) {
            System.out.println(s.toString());
        }
    }
    @Override
    public void Nhapkho(){
        System.out.print("Nhap ma sach duoc nhap kho: ");
        String MaSach=sc.nextLine();
        if(timSachTheoMa(MaSach)!=null)
        {
            Sach s=timSachTheoMa(MaSach);
            System.out.print("Nhap so luong sach duoc them : ");
            int sl=sc.nextInt();
            sc.nextLine();
            int slc=s.getSoLuong();
            s.setSoLuong(s.getSoLuong()+sl);
            System.out.println("So luong sach ma "+MaSach+" co so luong tu "+slc+" thanh "+s.getSoLuong());
        }
        else 
            System.out.println("Khong tim thay ma sach!");
    }
    @Override
    public void Xuatkho(){
        System.out.print("Nhap ma sach duoc xuat kho: ");
        String MaSach=sc.nextLine();
        if(timSachTheoMa(MaSach)!=null)
        {
            Sach s=timSachTheoMa(MaSach);
            System.out.print("Nhap so luong sach duoc xuat di : ");
            int sl=sc.nextInt();
            sc.nextLine();
            int slc=s.getSoLuong();
            int slm=s.getSoLuong()-sl;
            if(slm<0)
                System.out.println("Khong du so luong de xuat!");
            else 
            {
                s.setSoLuong(slm);
                System.out.println("So luong sach ma "+MaSach+" co so luong tu "+slc+" thanh "+s.getSoLuong());
            }
        }
        else 
            System.out.println("Khong tim thay ma sach!");
    }
    @Override
    public void Kiemtrasoluong(){
        for (Sach s : danhSach) {
            System.out.println("Ma sach: "+s.getMaSach()+"| So luong: "+s.getSoLuong());
        }
    }
}
