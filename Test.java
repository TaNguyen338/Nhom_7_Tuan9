import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        IQuanLySach quanLy = new QuanLySachImpl();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n--- CHUONG TRINH QUAN LY SACH ---");
            System.out.println("1. Them sach (Textbook)");
            System.out.println("2. Them sach (Novel)");
            System.out.println("3. Hien thi danh sach");
            System.out.println("4. Tim sach theo ma");
            System.out.println("5. Cap nhat sach theo ma");
            System.out.println("6. Xoa sach theo ma");
            System.out.println("0. Thoat");
            System.out.print("Lua chon: ");
            String choice = sc.nextLine();

            switch (choice) {
                case "1": {
                    System.out.print("Ma sach: ");
                    String ma = sc.nextLine();
                    System.out.print("Tieu de: ");
                    String td = sc.nextLine();
                    System.out.print("Tac gia: ");
                    String tg = sc.nextLine();
                    System.out.print("Nam xuat ban: ");
                    int nam = Integer.parseInt(sc.nextLine());
                    System.out.print("So luong: ");
                    int sl = Integer.parseInt(sc.nextLine());
                    System.out.print("Gia co ban: ");
                    double gia = Double.parseDouble(sc.nextLine());
                    System.out.print("Mon hoc: ");
                    String mon = sc.nextLine();
                    System.out.print("Cap do: ");
                    String cap = sc.nextLine();
                    Textbook tb = new Textbook(ma, td, tg, nam, sl, gia, mon, cap);
                    quanLy.themSach(tb);
                    System.out.println("Da them Textbook.");
                    break;
                }
                case "2": {
                    System.out.print("Ma sach: ");
                    String ma = sc.nextLine();
                    System.out.print("Tieu de: ");
                    String td = sc.nextLine();
                    System.out.print("Tac gia: ");
                    String tg = sc.nextLine();
                    System.out.print("Nam xuat ban: ");
                    int nam = Integer.parseInt(sc.nextLine());
                    System.out.print("So luong: ");
                    int sl = Integer.parseInt(sc.nextLine());
                    System.out.print("Gia co ban: ");
                    double gia = Double.parseDouble(sc.nextLine());
                    System.out.print("The loai: ");
                    String theLoai = sc.nextLine();
                    System.out.print("La sach series (true/false): ");
                    boolean series = Boolean.parseBoolean(sc.nextLine());
                    Novel nv = new Novel(ma, td, tg, nam, sl, gia, theLoai, series);
                    quanLy.themSach(nv);
                    System.out.println("Da them Novel.");
                    break;
                }
                case "3": {
                    quanLy.hienThiDanhSach();
                    break;
                }
                case "4": {
                    System.out.print("Nhap ma sach can tim: ");
                    String ma = sc.nextLine();
                    Sach found = quanLy.timKiemSach(ma);
                    if (found != null) {
                        System.out.println(found.toString());
                    } else {
                        System.out.println("Khong tim thay sach.");
                    }
                    break;
                }
                case "5": {
                    System.out.print("Nhap ma sach can cap nhat: ");
                    String ma = sc.nextLine();
                    Sach existing = quanLy.timKiemSach(ma);
                    if (existing == null) {
                        System.out.println("Khong tim thay sach de cap nhat.");
                        break;
                    }
                    System.out.println("Loai sach hien tai: " + existing.getClass().getSimpleName());
                    System.out.print("Muon thay the bang Textbook hay Novel? (T/N): ");
                    String type = sc.nextLine();
                    if (type.equalsIgnoreCase("T")) {
                        System.out.print("Tieu de: ");
                        String td = sc.nextLine();
                        System.out.print("Tac gia: ");
                        String tg = sc.nextLine();
                        System.out.print("Nam xuat ban: ");
                        int nam = Integer.parseInt(sc.nextLine());
                        System.out.print("So luong: ");
                        int sl = Integer.parseInt(sc.nextLine());
                        System.out.print("Gia co ban: ");
                        double gia = Double.parseDouble(sc.nextLine());
                        System.out.print("Mon hoc: ");
                        String mon = sc.nextLine();
                        System.out.print("Cap do: ");
                        String cap = sc.nextLine();
                        Textbook tb = new Textbook(ma, td, tg, nam, sl, gia, mon, cap);
                        if (quanLy.capNhatSach(ma, tb)) System.out.println("Cap nhat thanh cong."); else System.out.println("Cap nhat that bai.");
                    } else {
                        System.out.print("Tieu de: ");
                        String td = sc.nextLine();
                        System.out.print("Tac gia: ");
                        String tg = sc.nextLine();
                        System.out.print("Nam xuat ban: ");
                        int nam = Integer.parseInt(sc.nextLine());
                        System.out.print("So luong: ");
                        int sl = Integer.parseInt(sc.nextLine());
                        System.out.print("Gia co ban: ");
                        double gia = Double.parseDouble(sc.nextLine());
                        System.out.print("The loai: ");
                        String theLoai = sc.nextLine();
                        System.out.print("La sach series (true/false): ");
                        boolean series = Boolean.parseBoolean(sc.nextLine());
                        Novel nv = new Novel(ma, td, tg, nam, sl, gia, theLoai, series);
                        if (quanLy.capNhatSach(ma, nv)) System.out.println("Cap nhat thanh cong."); else System.out.println("Cap nhat that bai.");
                    }
                    break;
                }
                case "6": {
                    System.out.print("Nhap ma sach can xoa: ");
                    String ma = sc.nextLine();
                    if (quanLy.xoaSach(ma)) System.out.println("Da xoa."); else System.out.println("Khong tim thay de xoa.");
                    break;
                }
                case "0": {
                    System.out.println("Thoat chuong trinh.");
                    sc.close();
                    return;
                }
                default:
                    System.out.println("Lua chon khong hop le.");
            }
        }
    }
}