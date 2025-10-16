package BT_TUAN5;
 public abstract class Sach
    {
        protected String MaSach, TieuDe, TacGia;
        protected int NamXuatBan, SoLuong;   
        protected double giaCoBan;
        public Sach(){}
        public Sach(String MaSach, String TieuDe, String TacGia, int NamXuatBan, int SoLuong, double giaCoBan)
        {
            this.MaSach=MaSach;
            this.TieuDe=TieuDe;
            this.TacGia=TacGia;
            this.NamXuatBan=NamXuatBan;
            this.SoLuong=SoLuong;
            this.giaCoBan=giaCoBan;
        }
        public Sach(String MaSach, String TieuDe, String TacGia)
        {
            this.MaSach=MaSach;
            this.TieuDe=TieuDe;
            this.TacGia=TacGia;
        }
        public Sach(Sach book)
        {
            this.MaSach=book.MaSach;
            this.TieuDe=book.TieuDe;
        }
        public void setMaSach(String MaSach)
        {
            this.MaSach=MaSach;
        }
        public String getMaSach() 
        {
            return MaSach;
        }
        public void setTieuDe(String TieuDe) 
        {
            this.TieuDe=TieuDe;
        }
        public String getTieuDe() 
        {
            return TieuDe;
        }
        public void setTacGia(String TacGia) 
        {
            this.TacGia=TacGia;
        }
        public String getTacGia() 
        {
            return TacGia;
        }
        public void setNamXuatBan(int NamXuatBan) 
        {
            this.NamXuatBan=NamXuatBan;
        }
        public int getNamXuatBan() 
        {
            return NamXuatBan;
        }
        public void setSoLuong(int SoLuong) 
        {
            this.SoLuong=SoLuong;
        }
        public int getSoLuong() 
        {
            return SoLuong;
        }
        public void  setgiaCoBan(double giaCoBan){
            this.giaCoBan=giaCoBan;
        }
        public double getgiaCoBan(){
            return giaCoBan;
        }
        public void hienThiThongTin() 
        {
            System.out.println("Ma sach: "+ MaSach);
            System.out.println("Tieu de: "+ TieuDe);
            System.out.println("Tac gia: "+ TacGia);
            System.out.println("Nam xuat ban: "+ NamXuatBan);
            System.out.println("So luong: "+ SoLuong);
            System.out.println("----------------------------");
        }
        public abstract double GiaBan ();
            @Override
    public String toString(){
        return "Ma sach: " + MaSach + " | Tieu de: " + TieuDe + " | Tacgia: " + TacGia + " | Nam xuat ban: " + NamXuatBan + " | So luong: " + SoLuong +" |giaCoBan: "+giaCoBan;
    }
    }