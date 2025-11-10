package BT;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;
import java.time.Year;
public class QuanLySachImpl implements IQuanLySach, IQuanLyKho, IReadWrite{
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
        int namHienTai = Year.now().getValue();
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
            while(true)
            {  
                try{                                        
                    System.out.print("Nhap Nam xuat ban : ");
                    int nxb=Integer.parseInt(sc.nextLine());                    
                    if (nxb > namHienTai) 
                            System.out.println("Nam xuat ban phai nho hon hoac bang nam hien tai. \nNhap lai du lieu. ");
                    else 
                        if(nxb<0)
                            System.out.println("Nam xuat ban phai lon hon bang 0. \nNhap lai du lieu. ");
                        else{
                            s.setNamXuatBan(nxb);
                            break;
                    }
                }catch (NumberFormatException e) {
                    System.out.println("Du lieu nhap vao khong dung kieu du lieu (int). \nNhap lai du lieu. ");
                }
            }  
            while(true)
            {  
                try{                    
                    System.out.print("Nhap So luong : ");
                    int sl=Integer.parseInt(sc.nextLine());                    
                    if (sl < 0) 
                            System.out.println("So luong phai lon hon hoac bang 0. \nNhap lai du lieu. ");
                    else{
                        s.setSoLuong(sl); 
                        break;
                    }
                }catch (NumberFormatException e) {
                    System.out.println("Du lieu nhap vao khong dung kieu du lieu (int). \nNhap lai du lieu. ");
                }
            }         
            while(true)
            {  
                try{                    
                    System.out.print("Nhap Gia co ban : ");
                    int gcb=Integer.parseInt(sc.nextLine());                
                    if (gcb < 0) 
                            System.out.println("Gia ban phai lon hon hoac bang 0. \nNhap lai du lieu. ");
                    else{
                        s.setGiaCoBan(gcb); 
                        break;
                    }
                }catch (NumberFormatException e) {
                    System.out.println("Du lieu nhap vao khong dung kieu du lieu (int). \nNhap lai du lieu. ");
                }
            }                                                           
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
                while(true)
                {  
                    try{                    
                        System.out.print("Nhap Series(true/false) : ");
                        Boolean sr=sc.nextBoolean(); 
                        sc.nextLine();
                        stt.setLaSachSeries(sr);
                        break;
                    }catch (java.util.InputMismatchException e) {
                        System.out.println("Du lieu nhap vao khong dung kieu du lieu (Boolean). \nNhap lai du lieu. ");
                        sc.nextLine();
                    }
                }             
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
            System.out.println("---------------------------------------------------");
        }
    }
    @Override
    public void Nhapkho(){
        System.out.print("Nhap ma sach duoc nhap kho: ");
        String MaSach=sc.nextLine();
        if(timSachTheoMa(MaSach)!=null)
        {
            Sach s=timSachTheoMa(MaSach);
            try{
                int slc=s.getSoLuong();
                while(true){
                    System.out.print("Nhap so luong sach duoc them ( Sach hien co "+slc+" cuon ) : ");
                    int sl=Integer.parseInt(sc.nextLine());
                    if (sl>=0){                    
                        s.setSoLuong(slc+sl);
                        System.out.println("So luong sach ma "+MaSach+" co so luong tu "+slc+" thanh "+s.getSoLuong());
                        break;
                    }
                    else
                        System.out.println("So luong nhap vao phai lon hon hoac bang 0.");
                }
            }catch (NumberFormatException e){
                    System.out.println("Du lieu nhap vao khong dung kieu du lieu (int). \nNhap lai du lieu. ");
                }           
        }
        else 
            System.out.println("Khong tim thay ma sach!");
    }
    @Override
    public void Xuatkho(){
        System.out.print("Nhap ma sach duoc xuat kho: ");
        String MaSach=sc.nextLine();
        Sach s=timSachTheoMa(MaSach);
        if(s!=null)
        {            
            int slc=s.getSoLuong();
            if (slc == 0) {
            System.out.println("Sach co Ma '" + s.getMaSach() + "' da het (so luong = 0)!");
            return; 
            }
            while (true){
            try{
            System.out.print("Nhap so luong sach duoc xuat di( Sach hien co "+slc+" cuon ) : ");
            int sl=Integer.parseInt(sc.nextLine());
            int slm=slc-sl;
            if(sl<0)
                    System.out.println("So luong sach duoc xuat di phai lon hon hoac bang 0.");
            else
                if(slm<0)
                    System.out.println("Khong du so luong de xuat!");
                else 
                {
                    s.setSoLuong(slm);
                    System.out.println("So luong sach ma "+MaSach+" co so luong tu "+slc+" thanh "+s.getSoLuong());
                    break;
                }            
            }catch (NumberFormatException e){
                    System.out.println("Du lieu nhap vao khong dung kieu du lieu (int). \nNhap lai du lieu. "); 
                }
            }
            
        }
        else 
            System.out.println("Khong tim thay ma sach!");
    }
    @Override
    public void Kiemtrasoluong(){
        for (Sach s : danhSach) {
            System.out.println("Ma sach: "+s.getMaSach()+"| So luong: "+s.getSoLuong());
            System.out.println("---------------------------------------------");
        }
    }
    @Override
    public void ReadData(){}
    @Override
    public void WriteData(){}
}
