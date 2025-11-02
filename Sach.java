public abstract class Sach implements IGiaBan,IKiemKe
{
  protected double giaCoBan;
  protected String maSach;
  protected String tieuDe;
  protected String tacGia;
  protected int namXuatBan;
  protected int soLuong;
  public Sach() {
      
    }
    public Sach (String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong)
    {
    this.maSach = maSach;
    this.tieuDe = tieuDe;
    this.tacGia = tacGia;
    this.namXuatBan = namXuatBan;
    this.soLuong = soLuong;
    
    }
       public double gettersgiaCoBan()
    {
    return giaCoBan;
    }
    public void settersgiaCoBan(double giaCoBan)
    {
        this.giaCoBan=giaCoBan;
    }
    public String gettersmaSach()
    {
    return maSach;
    }
    public void settersmaSach(String maSach)
    {
        this.maSach=maSach;
        
    }
    public String getterstieuDe()
    {
        return tieuDe;
    }
    public void setterstieuDe(String tieuDe)
    {
        this.tieuDe=tieuDe;
    }
    public String getterstacGia()
    {
        return tacGia;

    }
    public void setterstacGia (String tacGia)
    {
        this.tacGia=tacGia;
    }
    public int gettersnamXuatBan()
    {
        return namXuatBan;
    }
    public void settersnamXuatBan(int namXuatBan)
    {
        this.namXuatBan=namXuatBan;

    }
    public int getterssoLuong()
    {
        return soLuong;
    }
    public void setterssoLuong(int soLuong)
    {
        this.soLuong=soLuong;
    }
    public void hienthithongtin()
    {
        System.out.println("Ma sach: "+maSach);
        System.out.println("Tieu de: "+tieuDe);
        System.out.println("Tac gia: "+tacGia);
        System.out.println("Nam xuat ban: "+namXuatBan);
        System.out.println("So luong: "+soLuong);
    }
    public abstract double tinhGiaBan();

    @Override
    public String toString() {
        return "Sach [maSach=" + maSach + ", tieuDe=" + tieuDe + ", tacGia=" + tacGia
                + ", namXuatBan=" + namXuatBan + ", soLuong=" + soLuong + "]";
    }
}



