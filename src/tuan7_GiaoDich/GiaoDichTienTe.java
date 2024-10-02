package tuan7_GiaoDich;
import java.util.Date;
public class GiaoDichTienTe extends GiaoDich{
	private double tiGia;
    private String loaiTienTe;

    public GiaoDichTienTe(String maGiaoDich, Date ngayGiaoDich, double donGia, int soLuong, double tiGia, String loaiTienTe) {
        super(maGiaoDich, ngayGiaoDich, donGia, soLuong);
        this.tiGia = tiGia;
        this.loaiTienTe = loaiTienTe;
    }

    @Override
    public double tinhThanhTien() {
        if (loaiTienTe.equals("VN")) {
            return soLuong * donGia;
        } else {
            return soLuong * donGia * tiGia;
        }
    }

    @Override
    public String toString() {
        return "GiaoDichTienTe{" +
                "maGiaoDich='" + maGiaoDich + '\'' +
                ", ngayGiaoDich=" + ngayGiaoDich +
                ", donGia=" + donGia +
                ", soLuong=" + soLuong +
                ", tiGia=" + tiGia +
                ", loaiTienTe='" + loaiTienTe + '\'' +
                ", thanhTien=" + tinhThanhTien() +
                '}';
    }
}
