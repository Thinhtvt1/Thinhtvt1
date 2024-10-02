package tuan7_GiaoDich;
import java.util.Date;
public class GiaoDichVang extends GiaoDich{
	private String loaiVang;

    public GiaoDichVang(String maGiaoDich, Date ngayGiaoDich, double donGia, int soLuong, String loaiVang) {
        super(maGiaoDich, ngayGiaoDich, donGia, soLuong);
        this.loaiVang = loaiVang;
    }

    @Override
    public double tinhThanhTien() {
        return soLuong * donGia;
    }

    @Override
    public String toString() {
        return "GiaoDichVang{" +
                "maGiaoDich='" + maGiaoDich + '\'' +
                ", ngayGiaoDich=" + ngayGiaoDich +
                ", donGia=" + donGia +
                ", soLuong=" + soLuong +
                ", loaiVang='" + loaiVang + '\'' +
                ", thanhTien=" + tinhThanhTien() +
                '}';
    }
}
