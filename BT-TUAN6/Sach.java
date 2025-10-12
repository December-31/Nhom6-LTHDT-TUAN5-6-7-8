/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BT_TUAN5;

/**
 *
 * @author LENOVO
 */
 public class Sach
    {
        protected String MaSach, TieuDe, TacGia;
        protected int NamXuatBan, SoLuong;   
        public Sach(){}
        public Sach(String MaSach, String TieuDe, String TacGia, int NamXuatBan, int SoLuong)
        {
            this.MaSach=MaSach;
            this.TieuDe=TieuDe;
            this.TacGia=TacGia;
            this.NamXuatBan=NamXuatBan;
            this.SoLuong=SoLuong;
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
        public void hienThiThongTin() 
        {
            System.out.println("Ma sach: "+ MaSach);
            System.out.println("Tieu de: "+ TieuDe);
            System.out.println("Tac gia: "+ TacGia);
            System.out.println("Nam xuat ban: "+ NamXuatBan);
            System.out.println("So luong: "+ SoLuong);
            System.out.println("----------------------------");
        }
    }