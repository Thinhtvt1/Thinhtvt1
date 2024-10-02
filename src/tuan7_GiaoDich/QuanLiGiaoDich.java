package tuan7_GiaoDich;
import java.util.ArrayList;
import java.util.List;
public class QuanLiGiaoDich {
	private List<GiaoDich> danhSachGiaoDich = new ArrayList<>();

    public void themGiaoDich(GiaoDich gd) {
        danhSachGiaoDich.add(gd);
    }

    public void xuatDanhSachGiaoDich() {
        for (GiaoDich gd : danhSachGiaoDich) {
            System.out.println(gd);
        }
    }

    public int tongSoLuong() {
        int tong = 0;
        for (GiaoDich gd : danhSachGiaoDich) {
            tong += gd.getSoLuong();
        }
        return tong;
    }

    public double tinhTrungBinhThanhTienTienTe() {
        double tongTien = 0;
        int count = 0;
        for (GiaoDich gd : danhSachGiaoDich) {
            if (gd instanceof GiaoDichTienTe) {
                tongTien += gd.tinhThanhTien();
                count++;
            }
        }
        return count == 0 ? 0 : tongTien / count;
    }

    public void xuatGiaoDichDonGiaLonHonMotTy() {
        for (GiaoDich gd : danhSachGiaoDich) {
            if (gd.getDonGia() > 1_000_000_000) {
                System.out.println(gd);
            }
        }
    }
}
