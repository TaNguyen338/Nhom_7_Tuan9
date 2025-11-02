import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class QuanLySachImpl implements IQuanLySach {
    private List<Sach> danhSachSach;

    public QuanLySachImpl() {
        this.danhSachSach = new ArrayList<>();
    }

    @Override
    public void themSach(Sach sach) {
        if (timKiemSach(sach.getMaSach()) == null) {
            danhSachSach.add(sach);
            System.out.println("✅ Them sach thanh cong: " + sach.getTieuDe());
        } else {
            System.out.println("❌ Loi: Ma sach " + sach.getMaSach() + " da ton tai.");
        }
    }

    @Override
    public void hienThiDanhSach() {
        if (danhSachSach.isEmpty()) {
            System.out.println("Danh sach sach hien dang trong.");
            return;
        }
        System.out.println("\n==================================================================");
        System.out.println("                 DANH SACH TAT CA CAC LOAI SACH                 ");
        System.out.println("==================================================================");
        int index = 1;
        for (Sach s : danhSachSach) {
            System.out.print(index++ + ". ");
            System.out.println(s.toString());
        }
        System.out.println("==================================================================");
    }

    @Override
    public Sach timKiemSach(String maSach) {
        for (Sach s : danhSachSach) {
            if (s.getMaSach().equalsIgnoreCase(maSach)) {
                return s;
            }
        }
        return null;
    }

    @Override
    public void xoaSach(String maSach) {
        Iterator<Sach> iterator = danhSachSach.iterator();
        while (iterator.hasNext()) {
            Sach s = iterator.next();
            if (s.getMaSach().equalsIgnoreCase(maSach)) {
                iterator.remove();
                System.out.println("✅ Da xoa sach co ma: " + maSach + " (" + s.getTieuDe() + ")");
                return;
            }
        }
        System.out.println("❌ Loi: Khong tim thay sach co ma " + maSach + " de xoa.");
    }
    
    @Override
    public void capNhatSoLuong(String maSach, int soLuongMoi) {
        Sach sach = timKiemSach(maSach);
        if (sach != null) {
            int oldSoLuong = sach.getSoLuong();
            sach.setSoLuong(soLuongMoi);
            System.out.println("✅ Cap nhat so luong thanh cong cho sach: " + sach.getTieuDe());
            System.out.println("   So luong cu: " + oldSoLuong + " -> So luong moi: " + soLuongMoi);
            
            IKiemKe kiemKe = sach;
            int soLuongToiThieu = 50;
            
            if (kiemKe.kiemTraTonKho(soLuongToiThieu)) {
                 System.out.println("   [KIEM KE] Kho du (>= " + soLuongToiThieu + " cuon).");
            } else {
                 System.out.println("   [KIEM KE] ⚠️ Kho thieu (< " + soLuongToiThieu + " cuon) - Can nhap them.");
            }
        } else {
            System.out.println("❌ Loi: Khong tim thay sach co ma " + maSach + " de cap nhat.");
        }
    }
}
