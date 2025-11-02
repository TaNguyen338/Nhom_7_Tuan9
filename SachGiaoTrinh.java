public class SachGiaoTrinh extends Sach {
    private String monHoc;
    private String capDo; // Vi du: "Dai hoc", "Cao dang", "Pho thong"

    public SachGiaoTrinh(String maSach, String tieuDe, String tacGia, int namXuatBan,
                         int soLuong, double giaCoBan, String monHoc, String capDo) {
        super(maSach, tieuDe, tacGia, namXuatBan, soLuong, giaCoBan);
        this.monHoc = monHoc;
        this.capDo = capDo;
    }

    public String getMonHoc() { return monHoc; }
    public void setMonHoc(String monHoc) { this.monHoc = monHoc; }
    public String getCapDo() { return capDo; }
    public void setCapDo(String capDo) { this.capDo = capDo; }

    @Override
    public double tinhGiaBan() {
        // Gia ban tang theo thoi gian: +5000 VND cho moi nam sau nam xuat ban
        int soNam = 2025 - namXuatBan;
        return giaCoBan + Math.max(0, soNam) * 5000;
    }

    @Override
    public String toString() {
        return super.toString() +
               String.format(" | Loai: Sach Giao Trinh | Mon: %s | Cap do: %s | Gia Ban Uoc Tinh: %.0f VND",
                             monHoc, capDo, tinhGiaBan());
    }
}
