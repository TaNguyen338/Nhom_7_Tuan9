public class Novel extends Sach { 
    private String theLoai;
    private boolean laSachSeries;

    public Novel(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong, double giaCoBan, String theLoai, boolean laSachSeries) {
        super(maSach, tieuDe, tacGia, namXuatBan, soLuong);
        this.giaCoBan = giaCoBan; 
        this.theLoai = theLoai;
        this.laSachSeries = laSachSeries;
    }

    public String gettersTheLoai() {
        return theLoai;
    }

    public void settersTheLoai(String theLoai) {
        this.theLoai = theLoai;
    }

    public boolean getterslaSachSeries() {
        return laSachSeries;
    }

    public void setterslaSachSeries(boolean laSachSeries) {
        this.laSachSeries = laSachSeries;
    }

    @Override
    public double tinhGiaBan() {
        return gettersgiaCoBan() + (laSachSeries ? 15000.0 : 0.0); 
    }
    @Override
    public boolean kiemTraTonKho(int soLuongToiThieu) {
        return getterssoLuong() >= soLuongToiThieu;
    }

    @Override
    public void capNhatViTri(String viTriMoi) {
        System.out.println("Da Chuyen Sach[" + getterstieuDe() + "] den khu vuc: [" + viTriMoi + "].");
    }

    @Override
    public String toString() {
    return super.toString() +
           ", The Loai: " + theLoai + 
           ", La Sach Series: " + (laSachSeries ? "Co" : "Khong") +
           ", Gia Ban: " + tinhGiaBan() + " VNĐ";
    }
    
}