/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BT_TUAN5;

/**
 *
 * @author LENOVO
 */
 public abstract class Sach implements IGiaBan, IKiemKe
    {
        protected String MaSach, TieuDe, TacGia, ViTri;
        protected int NamXuatBan, SoLuong;   
        protected double giaCoBan;
        public Sach(){}

        public Sach(String MaSach, String TieuDe, String TacGia, String ViTri, int NamXuatBan,int Soluong, double giaCoBan) {
            this.MaSach = MaSach;
            this.TieuDe = TieuDe;
            this.TacGia = TacGia;
            this.ViTri = ViTri;
            this.NamXuatBan = NamXuatBan;
            this.SoLuong=Soluong;
            this.giaCoBan = giaCoBan;
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

        public String getViTri() {
            return ViTri;
        }

        public void setViTri(String ViTri) {
            this.ViTri = ViTri;
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
        @Override
        public abstract double tinhGiaBan ();
        @Override
        public boolean kiemTraTonKho(int soLuongToiThieu){
            if(SoLuong>=soLuongToiThieu)
                return true;
            else
                return false;
        };
        @Override
        public void capNhatViTri(String viTriMoi){
            this.ViTri=viTriMoi;
            System.out.println("Đã chuyển sách "+TieuDe+" đến khu vực:" + viTriMoi+".");
        };
        @Override
        public String toString(){
        return "Ma sach: " + MaSach + " | Tieu de: " + TieuDe + " | Tacgia: " + TacGia + " | Nam xuat ban: " + NamXuatBan + " | So luong: " + SoLuong +" |giaCoBan: "+giaCoBan+ "|Vi tri: "+ViTri;
    }
    }