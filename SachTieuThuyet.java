public class SachTieuThuyet extends Sach {
    private String theLoai;
    private boolean laSachSeries;

    public SachTieuThuyet(String maSach, String tieuDe, String tacGia, int namXuatBan,
                          int soLuong, double giaCoBan, String theLoai, boolean laSachSeries) {
        super(maSach, tieuDe, tacGia, namXuatBan, soLuong, giaCoBan);
        this.theLoai = theLoai;
        this.laSachSeries = laSachSeries;
    }

    public String getTheLoai() { return theLoai; }
    public void setTheLoai(String theLoai) { this.theLoai = theLoai; }
    public boolean isLaSachSeries() { return laSachSeries; }
    public void setLaSachSeries(boolean laSachSeries) { this.laSachSeries = laSachSeries; }

    @Override
    public double tinhGiaBan() {
        // Sach series co gia cao hon
        return giaCoBan + (laSachSeries ? 15000 : 0);
    }

    @Override
    public String toString() {
        String seriesText = laSachSeries ? "Co" : "Khong";
        return super.toString() +
               String.format(" | Loai: Sach Tieu Thuyet | The loai: %s | Series: %s | Gia Ban Uoc Tinh: %.0f VND",
                             theLoai, seriesText, tinhGiaBan());
    }
}
