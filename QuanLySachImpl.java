import java.util.ArrayList;

public class QuanLySachImpl implements IQuanLySach {
    private ArrayList<Sach> danhSach;

    public QuanLySachImpl() {
        danhSach = new ArrayList<>();
    }

    @Override
    public void themSach(Sach sach) {
        danhSach.add(sach);
    }

    @Override
    public Sach timKiemSach(String maSach) {
        for (Sach s : danhSach) {
            if (s.getMaSach().equalsIgnoreCase(maSach)) {
                return s;
            }
        }
        return null;
    }

    @Override
    public boolean xoaSach(String maSach) {
        Sach s = timKiemSach(maSach);
        if (s != null) {
            danhSach.remove(s);
            return true;
        }
        return false;
    }

    @Override
    public void hienThiDanhSach() {
        if (danhSach.isEmpty()) {
            System.out.println("Danh sach trong.");
        } else {
            for (Sach s : danhSach) {
                System.out.println(s.toString());
                System.out.println("----------------------------------");
            }
        }
    }
}
