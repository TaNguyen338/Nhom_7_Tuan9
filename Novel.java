public class Novel extends Sach implements IKiemKe {
    private String theLoai;
    private boolean laSachSeries;

    public Novel(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong, double giaCoBan,
                 String theLoai, boolean laSachSeries) {
        super(maSach, tieuDe, tacGia, namXuatBan, soLuong, giaCoBan);
        this.theLoai = theLoai;
        this.laSachSeries = laSachSeries;
    }

    @Override
    public double tinhGiaBan() {
        return giaCoBan + (laSachSeries ? 15000 : 0);
    }

    @Override
    public String toString() {
        return super.toString() + ", Thể loại: " + theLoai + ", Series: " + laSachSeries +
               ", Giá bán ước tính: " + tinhGiaBan() + " VNĐ";
    }

    @Override
    public boolean kiemTraTonKho(int soLuongToiThieu) {
        return soLuong >= soLuongToiThieu;
    }

    @Override
    public void capNhatViTri(String viTriMoi) {
        System.out.println("Đã chuyển sách \"" + tieuDe + "\" đến khu vực: " + viTriMoi);
    }
}