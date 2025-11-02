import java.util.Scanner;

public class Test {
    // Ham ho tro doc String
    private static String readString(Scanner scanner, String prompt) {
        System.out.print(prompt);
        return scanner.nextLine();
    }

    // Ham ho tro doc Int
    private static int readInt(Scanner scanner, String prompt) {
        while (true) {
            try {
                System.out.print(prompt);
                String input = scanner.nextLine();
                return Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("❌ Du lieu nhap vao phai la so nguyen. Vui long thu lai.");
            }
        }
    }
    
    // Ham ho tro doc Double
    private static double readDouble(Scanner scanner, String prompt) {
        while (true) {
            try {
                System.out.print(prompt);
                String input = scanner.nextLine();
                return Double.parseDouble(input);
            } catch (NumberFormatException e) {
                System.out.println("❌ Du lieu nhap vao phai la so thuc. Vui long thu lai.");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        IQuanLySach quanLy = new QuanLySachImpl();

        // Khoi tao du lieu mau
        SachGiaoTrinh sgk1 = new SachGiaoTrinh("GT01", "Cau truc du lieu", "Pham Van C", 2022, 150, 65000, "Tin hoc", "Dai hoc");
        SachTieuThuyet stt1 = new SachTieuThuyet("TT01", "Chua te nhung chiec nhan", "J.R.R. Tolkien", 2003, 75, 95000, "Fantasy", true);
        SachGiaoTrinh sgk2 = new SachGiaoTrinh("GT02", "Giai tich 1", "Nguyen Thu D", 2019, 45, 80000, "Toan hoc", "Cao dang");
        
        quanLy.themSach(sgk1);
        quanLy.themSach(stt1);
        quanLy.themSach(sgk2);

        int choice;
        do {
            System.out.println("\n\n=============== MENU QUAN LY SACH ===============");
            System.out.println("1. Them sach moi (Giao Trinh / Tieu Thuyet)");
            System.out.println("2. Hien thi toan bo danh sach sach");
            System.out.println("3. Tim kiem sach theo Ma sach");
            System.out.println("4. Cap nhat so luong ton kho (va Kiem Ke)");
            System.out.println("5. Cap nhat vi tri trong kho (Hanh dong Kiem Ke)");
            System.out.println("6. Xoa sach theo Ma sach");
            System.out.println("0. Thoat chuong trinh");
            System.out.println("=================================================");
            
            choice = readInt(scanner, "▶️ Nhap lua chon cua ban: ");
            
            switch (choice) {
                case 1:
                    themSachMoi(scanner, quanLy);
                    break;
                case 2:
                    quanLy.hienThiDanhSach();
                    break;
                case 3:
                    timKiemSach(scanner, quanLy);
                    break;
                case 4:
                    capNhatSoLuong(scanner, quanLy);
                    break;
                case 5:
                    capNhatViTri(scanner, quanLy);
                    break;
                case 6:
                    xoaSach(scanner, quanLy);
                    break;
                case 0:
                    System.out.println("Cam on ban da su dung chuong trinh. Tam biet!");
                    break;
                default:
                    System.out.println("❌ Lua chon khong hop le. Vui long nhap so tu 0 den 6.");
            }
        } while (choice != 0);

        scanner.close();
    }
    
    // Logic them sach moi
    private static void themSachMoi(Scanner scanner, IQuanLySach quanLy) {
        System.out.println("\n--- THEM SACH MOI ---");
        String loaiSach = readString(scanner, "  Nhap loai sach (GT: Giao Trinh, TT: Tieu Thuyet): ").toUpperCase();
        
        String maSach = readString(scanner, "  Ma sach: ");
        String tieuDe = readString(scanner, "  Tieu de: ");
        String tacGia = readString(scanner, "  Tac gia: ");
        int namXuatBan = readInt(scanner, "  Nam xuat ban: ");
        int soLuong = readInt(scanner, "  So luong ton kho: ");
        double giaCoBan = readDouble(scanner, "  Gia co ban: ");
        
        Sach sachMoi = null;
        
        if (loaiSach.equals("GT")) {
            String monHoc = readString(scanner, "  Mon hoc: ");
            String capDo = readString(scanner, "  Cap do (Vi du: Dai hoc): ");
            sachMoi = new SachGiaoTrinh(maSach, tieuDe, tacGia, namXuatBan, soLuong, giaCoBan, monHoc, capDo);
        } else if (loaiSach.equals("TT")) {
            String theLoai = readString(scanner, "  The loai: ");
            String isSeries = readString(scanner, "  La sach series (Y/N)?: ").toUpperCase();
            boolean laSachSeries = isSeries.equals("Y");
            sachMoi = new SachTieuThuyet(maSach, tieuDe, tacGia, namXuatBan, soLuong, giaCoBan, theLoai, laSachSeries);
        } else {
            System.out.println("❌ Loi: Loai sach khong hop le.");
            return;
        }
        
        if (sachMoi != null) {
            quanLy.themSach(sachMoi);
        }
    }
    
    // Logic tim kiem sach
    private static void timKiemSach(Scanner scanner, IQuanLySach quanLy) {
        System.out.println("\n--- TIM KIEM SACH ---");
        String maSach = readString(scanner, "  Nhap Ma sach can tim: ");
        Sach sach = quanLy.timKiemSach(maSach);
        if (sach != null) {
            System.out.println("\n✅ Da tim thay sach:");
            System.out.println(sach.toString());
        } else {
            System.out.println("❌ Khong tim thay sach co Ma: " + maSach);
        }
    }
    
    // Logic xoa sach
    private static void xoaSach(Scanner scanner, IQuanLySach quanLy) {
        System.out.println("\n--- XOA SACH ---");
        String maSach = readString(scanner, "  Nhap Ma sach can xoa: ");
        quanLy.xoaSach(maSach);
    }
    
    // Logic cap nhat so luong
    private static void capNhatSoLuong(Scanner scanner, IQuanLySach quanLy) {
        System.out.println("\n--- CAP NHAT SO LUONG TON KHO ---");
        String maSach = readString(scanner, "  Nhap Ma sach can cap nhat: ");
        Sach sach = quanLy.timKiemSach(maSach);
        
        if (sach != null) {
            System.out.println("  Sach hien tai: " + sach.getTieuDe() + " | SL cu: " + sach.getSoLuong());
            int soLuongMoi = readInt(scanner, "  Nhap so luong ton kho MOI: ");
            quanLy.capNhatSoLuong(maSach, soLuongMoi);
        } else {
            System.out.println("❌ Khong tim thay sach co Ma: " + maSach);
        }
    }
    
    // Logic cap nhat vi tri (tu IKiemKe)
    private static void capNhatViTri(Scanner scanner, IQuanLySach quanLy) {
        System.out.println("\n--- CAP NHAT VI TRI TRONG KHO (Hanh dong Kiem Ke) ---");
        String maSach = readString(scanner, "  Nhap Ma sach can chuyen vi tri: ");
        Sach sach = quanLy.timKiemSach(maSach);
        
        if (sach != null) {
            String viTriMoi = readString(scanner, "  Nhap vi tri moi trong kho: ");
            // Ep kieu Sach sang IKiemKe de goi phuong thuc capNhatViTri
            IKiemKe kiemKe = sach;
            kiemKe.capNhatViTri(viTriMoi);
        } else {
            System.out.println("❌ Khong tim thay sach co Ma: " + maSach);
        }
    }
}
