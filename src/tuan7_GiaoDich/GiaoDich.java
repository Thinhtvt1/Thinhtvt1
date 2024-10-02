package tuan7_GiaoDich;
import java.util.Date;
public abstract class GiaoDich {
	protected String maGiaoDich;
    protected Date ngayGiaoDich;
    protected double donGia;
    protected int soLuong;

    public GiaoDich(String maGiaoDich, Date ngayGiaoDich, double donGia, int soLuong) {
        this.maGiaoDich = maGiaoDich;
        this.ngayGiaoDich = ngayGiaoDich;
        this.donGia = donGia;
        this.soLuong = soLuong;
    }

    public double tinhThanhTien();

    public double getDonGia() {
        return donGia;
    }

    public int getSoLuong() {
        return soLuong;
    }
}
