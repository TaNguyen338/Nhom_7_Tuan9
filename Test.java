import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        IQuanLySach quanLy = new QuanLySachImpl();
        Scanner sc = new Scanner(System.in);
        int chon;

        do {
            System.out.println("\n===== MENU QUAN LY SACH =====");
            System.out.println("1. Them sach giao trinh");
            System.out.println("2. Them sach tieu thuyet");
            System.out.println("3. Hien thi danh sach sach");
            System.out.println("4. Tim sach theo ma");
            System.out.println("5. Xoa sach theo ma");
            System.out.println("0. Thoat");
            System.out.print("Chon: ");
            chon = sc.nextInt();
            sc.nextLine();

            switch (chon) {
                case 1:
                    System.out.print("Nhap ma sach: ");
                    String maGT = sc.nextLine();
                    System.out.print("Nhap tieu de: ");
                    String tdGT = sc.nextLine();
                    System.out.print("Nhap tac gia: ");
                    String tgGT = sc.nextLine();
                    System.out.print("Nhap nam xuat ban: ");
                    int namGT = sc.nextInt();
                    System.out.print("Nhap so luong: ");
                    int slGT = sc.nextInt();
                    System.out.print("Nhap gia co ban: ");
                    double gcbGT = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Nhap mon hoc: ");
                    String mh = sc.nextLine();
                    System.out.print("Nhap cap do: ");
                    String cd = sc.nextLine();
                    quanLy.themSach(new SachGiaoTrinh(maGT, tdGT, tgGT, namGT, slGT, gcbGT, mh, cd));
                    System.out.println("Da them sach giao trinh!");
                    break;

                case 2:
                    System.out.print("Nhap ma sach: ");
                    String maTT = sc.nextLine();
                    System.out.print("Nhap tieu de: ");
                    String tdTT = sc.nextLine();
                    System.out.print("Nhap tac gia: ");
                    String tgTT = sc.nextLine();
                    System.out.print("Nhap nam xuat ban: ");
                    int namTT = sc.nextInt();
                    System.out.print("Nhap so luong: ");
                    int slTT = sc.nextInt();
                    System.out.print("Nhap gia co ban: ");
                    double gcbTT = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Nhap the loai: ");
                    String tl = sc.nextLine();
                    System.out.print("La sach series (true/false): ");
                    boolean ls = sc.nextBoolean();
                    quanLy.themSach(new SachTieuThuyet(maTT, tdTT, tgTT, namTT, slTT, gcbTT, tl, ls));
                    System.out.println("Da them sach tieu thuyet!");
                    break;

                case 3:
                    quanLy.hienThiDanhSach();
                    break;

                case 4:
                    System.out.print("Nhap ma sach can tim: ");
                    String maTim = sc.nextLine();
                    Sach s = quanLy.timKiemSach(maTim);
                    if (s != null)
                        System.out.println("Tim thay: " + s.toString());
                    else
                        System.out.println("Khong tim thay sach co ma: " + maTim);
                    break;

                case 5:
                    System.out.print("Nhap ma sach can xoa: ");
                    String maXoa = sc.nextLine();
                    if (quanLy.xoaSach(maXoa))
                        System.out.println("Da xoa thanh cong!");
                    else
                        System.out.println("Khong tim thay ma sach de xoa!");
                    break;

                case 0:
                    System.out.println("Thoat chuong trinh.");
                    break;

                default:
                    System.out.println("Lua chon khong hop le!");
            }
        } while (chon != 0);
        sc.close();
    }
}
