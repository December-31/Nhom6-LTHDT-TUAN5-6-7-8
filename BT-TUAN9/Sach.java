public abstract class Sach implements IGiaBan,IKiemKe
{
    protected String maSach;
    protected String tieuDe;
    protected String tacGia;
    protected int namXuatBan;
    protected int soLuong;
    protected String viTri;
    protected double giaCoBan;
    public Sach(String maSach,String tieuDe,String tacGia,int namXuatBan,int soLuong, String viTri,double giaCoBan)
    {
        this.maSach=maSach;
        this.tieuDe=tieuDe;
        this.tacGia=tacGia;
        this.namXuatBan=namXuatBan;
        this.soLuong=soLuong;
        this.viTri=viTri;
        this.giaCoBan=giaCoBan;
    }
    public Sach()
    {
    }
    public void setmaSach(String maSach)
    {
        this.maSach=maSach;
    }
    public void settieuDe(String tieuDe)
    {
        this.tieuDe=tieuDe;
    }
    public void settacGia(String tacGia)
    {
        this.tacGia=tacGia;
    }
    public void setnamXuatBan(int namXuatBan)
    {
        this.namXuatBan=namXuatBan;
    }
    public void setsoLuong(int soLuong)
    {
        this.soLuong=soLuong;
    }
    public void setviTri(String viTri)
    {
        this.viTri=viTri;
    }
    public void setgiaCoBan(double giaCoBan)
    {
        this.giaCoBan=giaCoBan;
    }
    public String getmaSach()
    {
        return this.maSach;
    }
    public String gettieuDe()
    {
        return this.tieuDe;
    }
    public String gettacGia()
    {
        return this.tacGia;
    }
    public int getnamXuatBan()
    {
        return this.namXuatBan;
    }
    public int getsoLuong()
    {
        return this.soLuong;
    }
    public String getviTri()
    {
        return this.viTri;
    }
    public double getgiaCoBan()
    {
        return this.giaCoBan;
    } 
    public void hienThiThongTin() 
    {
        System.out.println("Ma sach: "+ this.maSach);
        System.out.println("Tieu de: "+ this.tieuDe);
        System.out.println("Tac gia: "+ this.tacGia);
        System.out.println("Nam xuat ban: "+ this.namXuatBan);
        System.out.println("So luong: "+ this.soLuong);
        System.out.println("Vi tri: "+this.viTri);
        System.out.println("Gia co ban: "+ this.giaCoBan);
        System.out.println("Gia ban ra: "+tinhGiaBan());
        System.out.println("----------------------------");
    }
    @Override
    public String toString() 
    {
        return "Ma sach:"+maSach+", Tieu de:"+tieuDe+", Tac gia:"+tacGia+","+" Nam xuat ban:"+namXuatBan+", So luong:"+soLuong+", Khu vuc:"+viTri+", Gia co ban:"+giaCoBan;
    }
    @Override
    public abstract double tinhGiaBan();
    @Override
    public boolean kiemTraTonKho(int soLuongToiThieu)
    {
        return soLuong >= soLuongToiThieu;
    }
    @Override
    public void capNhatViTri(String viTriMoi)
    {   
        this.viTri=viTriMoi;
        System.out.println("Da chuyen sach '"+tieuDe+"' den khu vuc "+viTriMoi);
    }
}
