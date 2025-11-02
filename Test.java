public class Test {
    public static void main(String[] args) {
        QuanLySach qls = new QuanLySach();

        Textbook textbook = new Textbook("GT001", "Giải tích 1", "Nguyễn Văn A", 2020, 120, 50000, "Toán", "Đại học");
        Novel novel = new Novel("TT001", "Vũ trụ song song", "Trần Văn B", 2023, 80, 70000, "Khoa học viễn tưởng", true);

        qls.themSach(textbook);
        qls.themSach(novel);

        System.out.println("📚 Danh sách sách:");
        qls.hienThiDanhSachSach();

        System.out.println("\n🔍 Kiểm tra giao diện IKiemKe:");
        IKiemKe kiemKe = textbook;
        System.out.println("Đủ tồn kho (>=100)? " + kiemKe.kiemTraTonKho(100));
        kiemKe.capNhatViTri("Kho A1-Kệ 5");
    }
}