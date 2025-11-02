import java.util.ArrayList;

public class BookManager {
    private ArrayList<Sach> danhSachSach = new ArrayList<>();

    // Thêm sách mới
    public void themSach(Sach sach) {
        danhSachSach.add(sach);
    }

    // Xóa sách theo mã
    public void xoaSach(String maSach) {
        danhSachSach.removeIf(s -> s.getMaSach().equals(maSach));
    }

    // Cập nhật sách theo mã
    public void capNhatSach(String maSach, Sach sachMoi) {
        for (int i = 0; i < danhSachSach.size(); i++) {
            if (danhSachSach.get(i).getMaSach().equals(maSach)) {
                danhSachSach.set(i, sachMoi);
                break;
            }
        }
    }

    // Tìm kiếm sách theo mã
    public Sach timKiemSach(String maSach) {
        for (Sach s : danhSachSach) {
            if (s.getMaSach().equals(maSach)) {
                return s;
            }
        }
        return null;
    }

    // Hiển thị toàn bộ danh sách sách
    public void hienThiDanhSachSach() {
        for (Sach s : danhSachSach) {
            System.out.println(s.toString());
        }
    }
}