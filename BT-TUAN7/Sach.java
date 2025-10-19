public abstract class Sach 
{
    protected String maSach;
    protected String tieuDe;
    protected String tacGia;
    protected int namXuatBan;
    protected int soLuong;
    protected double giaCoBan;
    public Sach(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong, double giaCoBan) 
    {
        this.maSach = maSach;
        this.tieuDe = tieuDe;
        this.tacGia = tacGia;
        this.namXuatBan = namXuatBan;
        this.soLuong = soLuong;
        this.giaCoBan = giaCoBan;
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
    @Override
    public String toString() 
    {
        return "\nMa sach: " + maSach + "\nTieu de: " + tieuDe + "\nTác giả: " + tacGia + "\nNam xuat ban: " + namXuatBan + "\nSo luong: " + soLuong;
    }
    public abstract double tinhGiaBan();
    
}