public abstract class Sach implements IGiaBan,IKiemKe
{
    protected String maSach;
    protected String tieuDe;
    protected String tacGia;
    protected int namXuatBan;
    protected int soLuong;
    protected double giaCoBan;
    protected String viTri;
    public Sach(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong, double giaCoBan, String viTri) 
    {
        this.maSach = maSach;
        this.tieuDe = tieuDe;
        this.tacGia = tacGia;
        this.namXuatBan = namXuatBan;
        this.soLuong = soLuong;
        this.giaCoBan = giaCoBan;
        this.viTri = viTri;
    }
    public Sach() 
    {
    }
    public void setmaSach(String maSach) 
    {
        this.maSach = maSach;
    }

    public void settieuDe(String tieuDe) 
    {
        this.tieuDe = tieuDe;
    }
    public void settacGia(String tacGia) 
    {
        this.tacGia = tacGia;
    }
    public void setnamXuatBan(int namXuatBan) 
    {
        this.namXuatBan = namXuatBan;
    }
    public void setsoLuong(int soLuong) 
    {
        this.soLuong = soLuong;
    }
    public void setgiaCoBan(double giaCoBan)
    {
        this.giaCoBan = giaCoBan;
    }
    public void setviTri(String viTri)
    {
        this.viTri=viTri;
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
    public double getgiaCoBan()
    {
        return this.giaCoBan;
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
    @Override
    public String toString() 
    {
        return "\nMa sach: " + maSach + "\nTieu de: " + tieuDe + "\nTac gia: " + tacGia + "\nNam xuat ban: " + namXuatBan + "\nSo luong: " + soLuong+"\nVi tri ke: " + viTri;
    }
    @Override
    public abstract double tinhGiaBan();
    @Override
    public boolean kiemTraTonKho(int soLuongToiThieu)
    {
        return soLuong>=soLuongToiThieu;
    }
    @Override
    public void capNhatViTri(String viTriMoi)
    {
        this.viTri=viTriMoi;
        System.out.println("Da chuyen sach "+tieuDe+" den khu vuc: "+viTriMoi);
    }
}