public class Sach 
{
    private String maSach;
    private String tieuDe;
    private String tacGia;
    private int namXuatBan;
    private int soLuong;
    public Sach(String maSach,String tieuDe,String tacGia,int namXuatBan,int soLuong)
    {
        this.maSach=maSach;
        this.tieuDe=tieuDe;
        this.tacGia=tacGia;
        this.namXuatBan=namXuatBan;
        this.soLuong=soLuong;
    }
    public Sach(String tieuDe,String tacGia,int namXuatBan)
    {
        this.tieuDe=tieuDe;
        this.tacGia=tacGia;
        this.namXuatBan=namXuatBan;
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
    public void hienThiThongTin()
    {
        System.out.println("-------------------");
        System.out.println("Ma sach: "+maSach);
        System.out.println("Tieu de: "+tieuDe);
        System.out.println("Tac gia: "+tacGia);
        System.out.println("Nam xuat ban: "+namXuatBan);
        System.out.println("So luong: "+soLuong);
    }
}