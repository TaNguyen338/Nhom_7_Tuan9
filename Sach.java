public abstract class Sach implements IGiaBan, IKiemKe {
    protected String maSach;
    protected String tieuDe;
    protected String tacGia;
    protected int namXuatBan;
    protected int soLuong;
    protected double giaCoBan;

    public Sach(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong, double giaCoBan) {
        this.maSach = maSach;
        this.tieuDe = tieuDe;
        this.tacGia = tacGia;
        this.namXuatBan = namXuatBan;
        this.soLuong = soLuong;
        this.giaCoBan = giaCoBan;
    }

    // Phuong thuc truu tuong tu IGiaBan
    @Override
    public abstract double tinhGiaBan();

    // Phuong thuc tu IKiemKe
    @Override
    public boolean kiemTraTonKho(int soLuongToiThieu) {
        return this.soLuong >= soLuongToiThieu;
    }

    // Phuong thuc tu IKiemKe
    @Override
    public void capNhatViTri(String viTriMoi) {
        System.out.println("[Kiem Ke] Da chuyen sach [" + tieuDe + "] den khu vuc: " + viTriMoi + ".");
    }

    // Getter & Setter
    public String getMaSach() { return maSach; }
    public void setMaSach(String maSach) { this.maSach = maSach; }
    public String getTieuDe() { return tieuDe; }
    public void setTieuDe(String tieuDe) { this.tieuDe = tieuDe; }
    public String getTacGia() { return tacGia; }
    public void setTacGia(String tacGia) { this.tacGia = tacGia; }
    public int getNamXuatBan() { return namXuatBan; }
    public void setNamXuatBan(int namXuatBan) { this.namXuatBan = namXuatBan; }
    public int getSoLuong() { return soLuong; }
    public void setSoLuong(int soLuong) { this.soLuong = soLuong; }
    public double getGiaCoBan() { return giaCoBan; }
    public void setGiaCoBan(double giaCoBan) { this.giaCoBan = giaCoBan; }

    @Override
    public String toString() {
        return String.format("Ma: %s | Tieu de: %s | Tac gia: %s | Nam XB: %d | SL Ton: %d | Gia CB: %.0f VND",
            maSach, tieuDe, tacGia, namXuatBan, soLuong, giaCoBan);
    }
}
