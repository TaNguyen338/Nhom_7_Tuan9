public class Textbook extends Sach implements IKiemKe {
    private String monHoc;
    private String capDo;

    public Textbook(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong, double giaCoBan,
                    String monHoc, String capDo) {
        super(maSach, tieuDe, tacGia, namXuatBan, soLuong, giaCoBan);
        this.monHoc = monHoc;
        this.capDo = capDo;
    }

    @Override
    public double tinhGiaBan() {
        int soNam = 2025 - namXuatBan;
        return giaCoBan + (soNam * 5000);
    }

    @Override
    public String toString() {
        return super.toString() + ", Môn học: " + monHoc + ", Cấp độ: " + capDo +
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