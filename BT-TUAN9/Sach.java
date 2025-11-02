package BT;
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
        public String getMaSach() {
            return MaSach;
        }

        public void setMaSach(String MaSach) {
            this.MaSach = MaSach;
        }

        public String getTieuDe() {
            return TieuDe;
        }

        public void setTieuDe(String TieuDe) {
            this.TieuDe = TieuDe;
        }

        public String getTacGia() {
            return TacGia;
        }

        public void setTacGia(String TacGia) {
            this.TacGia = TacGia;
        }

        public String getViTri() {
            return ViTri;
        }

        public void setViTri(String ViTri) {
            this.ViTri = ViTri;
        }

        public int getNamXuatBan() {
            return NamXuatBan;
        }

        public void setNamXuatBan(int NamXuatBan) {
            this.NamXuatBan = NamXuatBan;
        }

        public int getSoLuong() {
            return SoLuong;
        }

        public void setSoLuong(int SoLuong) {
            this.SoLuong = SoLuong;
        }

        public double getGiaCoBan() {
            return giaCoBan;
        }

        public void setGiaCoBan(double giaCoBan) {
            this.giaCoBan = giaCoBan;
        }       
        public void hienThiThongTin() 
        {
            System.out.println("Ma sach : "+ MaSach);
            System.out.println("Tieu de : "+ TieuDe);
            System.out.println("Tac gia : "+ TacGia);
            System.out.println("Nam xuat ban : "+ NamXuatBan);
            System.out.println("So luong : "+ SoLuong);
            System.out.println("Gia co ban : "+ SoLuong);
            System.out.println("----------------------------");
        }       
        @Override
        public boolean kiemTraTonKho(int soLuongToiThieu){
            return SoLuong>=soLuongToiThieu;
        };
        @Override
        public void capNhatViTri(String viTriMoi){
            this.ViTri=viTriMoi;
            System.out.println("Da chuyen sach "+TieuDe+" den khu vuc:" + viTriMoi+".");
        };
        @Override
        public abstract double tinhGiaBan ();
        @Override
        public String toString(){
            return "Ma sach: " + MaSach + " | Tieu de: " + TieuDe + " | Tacgia: " + TacGia + " | Nam xuat ban: " + NamXuatBan + " | So luong: " + SoLuong +" |giaCoBan: "+giaCoBan+ "|Vi tri: "+ViTri;
        }
    }