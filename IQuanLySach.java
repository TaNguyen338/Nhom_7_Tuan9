public interface IQuanLySach {
    // Them mot cuon sach moi vao danh sach
    void themSach(Sach sach);
    
    // Hien thi toan bo danh sach sach
    void hienThiDanhSach();
    
    // Tim kiem sach theo Ma sach
    Sach timKiemSach(String maSach);
    
    // Xoa sach theo Ma sach
    void xoaSach(String maSach);
    
    // Cap nhat so luong ton kho cua sach
    void capNhatSoLuong(String maSach, int soLuongMoi);
}
