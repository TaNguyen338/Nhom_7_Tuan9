
public class Textbook extends Sach  {
	private String monHoc;
	private String capDo;
	public Textbook(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong, double giaCoBan, String monHoc, String capDo) {
		super(maSach, tieuDe, tacGia, namXuatBan, soLuong);
        this.giaCoBan = giaCoBan; 
		this.monHoc = monHoc;
		this.capDo = capDo;
	}

	public String gettersMonHoc() {
		return monHoc;
	}

	public void settersMonHoc(String monHoc) {
		this.monHoc = monHoc;
	}

	public String gettersCapDo() {
		return capDo;
	}

	public void settersCapDo(String capDo) {
		this.capDo = capDo;
	}

	 @Override
    public double tinhGiaBan() {
        int soNam = 2025 - gettersnamXuatBan();
        if (soNam < 0) soNam = 0; 
        return gettersgiaCoBan() + soNam * 5000.0; 
    }
    
    @Override
    public boolean kiemTraTonKho(int soLuongToiThieu) {
        return getterssoLuong() >= soLuongToiThieu;
    }

    @Override
    public void capNhatViTri(String viTriMoi) {
        System.out.println("Da Chuyen Sach [" + getterstieuDe() + "] den khu vuc: [" + viTriMoi + "].");
    }

@Override
public String toString() {
	return super.toString() +
		   ", Mon Hoc: " + monHoc + 
           ", Cap Do: " + capDo +
		   ", Gia Ban: " + tinhGiaBan() + " VNĐ";
}
}