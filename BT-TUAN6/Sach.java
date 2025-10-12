public class Sach 
{
    protected String maSach;
    protected String tieuDe;
    protected String tacGia;
    protected int namXuatBan;
    protected int soLuong;
    public Sach(String maSach,String tieuDe,String tacGia,int namXuatBan,int soLuong)
    {
        this.maSach=maSach;
        this.tieuDe=tieuDe;
        this.tacGia=tacGia;
        this.namXuatBan=namXuatBan;
        this.soLuong=soLuong;
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
    @Override
    public String toString() 
    {
        return "Ma sach:"+maSach+", Tieu de:"+tieuDe+", Tac gia:"+tacGia+","+" Nam xuat ban:"+namXuatBan+", So luong:"+soLuong;
    }
}
