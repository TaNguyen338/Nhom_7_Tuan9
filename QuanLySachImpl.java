import java.util.ArrayList;
import java.util.List;

public class QuanLySachImpl implements IQuanLySach {
	private List<Sach> danhSach;

	public QuanLySachImpl() {
		danhSach = new ArrayList<>();
	}

	@Override
	public void themSach(Sach s) {
		if (s != null) {
			danhSach.add(s);
		}
	}

	@Override
	public Sach timKiemSach(String maSach) {
		if (maSach == null) return null;
		for (Sach s : danhSach) {
			if (maSach.equals(s.gettersmaSach())) {
				return s;
			}
		}
		return null;
	}

	@Override
	public boolean xoaSach(String maSach) {
		Sach s = timKiemSach(maSach);
		if (s != null) {
			return danhSach.remove(s);
		}
		return false;
	}

	@Override
	public void hienThiDanhSach() {
		if (danhSach.isEmpty()) {
			System.out.println("Danh sach trong.");
			return;
		}
		for (Sach s : danhSach) {
			s.hienthithongtin();
			System.out.println("Gia ban: " + s.tinhGiaBan());
			System.out.println("-------------------------");
		}
	}

	@Override
	public boolean capNhatSach(String maSach, Sach sachMoi) {
		if (maSach == null || sachMoi == null) return false;
		for (int i = 0; i < danhSach.size(); i++) {
			if (maSach.equals(danhSach.get(i).gettersmaSach())) {
				danhSach.set(i, sachMoi);
				return true;
			}
		}
		return false;
	}
    	public List<Sach> getDanhSach() {
		return danhSach;
	}

}
