public class Test 
{
    public static void main(String[] args)
    {
        QuanLySach qlsach = new QuanLySach(); 
        System.out.println("--TAO DOI TUONG--");
        qlsach.themSach(new SachGiaoTrinh("S01", "Co so du lieu I", "Zoro", 2021, 10, "CSDLI", "Dai hoc"));
        qlsach.themSach(new SachTieuThuyet("S02","Huong toi vi sao sang","Nami",2020,9,"Trinh tham",true));
        qlsach.themSach(new SachGiaoTrinh("S03", "Co so du lieu II", "Robin", 2021, 10, "CSDLII", "Dai hoc"));
        qlsach.xuatSach();
        System.out.println("--TIM KIEM SACH--");
        qlsach.kquaTimKiem("S02");
        qlsach.kquaTimKiem("S05");
        System.out.println("--CAP NHAT SACH--");
        Sach sachmoi=new SachTieuThuyet("S04","Once piece","Luffy",2019,4,"Phieu luu",true);
        qlsach.capNhat("S02",sachmoi); 
        Sach sachmoi1=new SachTieuThuyet("S05","Once piece","Luffy",2019,4,"Phieu luu",true);
        qlsach.capNhat("S06",sachmoi1); 
        qlsach.xuatSach();
        System.out.println("--XOA SACH--");
        qlsach.xoaSach("S03");
        qlsach.xoaSach("S05");
        qlsach.xuatSach();
    }
}