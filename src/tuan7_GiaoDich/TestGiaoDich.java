package tuan7_GiaoDich;
import java.util.Date;
import java.util.Scanner;

public class TestGiaoDich {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        QuanLyGiaoDich quanLy = new QuanLyGiaoDich();

        // Nhập dữ liệu cho giao dịch vàng
        GiaoDichVang gdVang = new GiaoDichVang("GD001", new Date(), 5000000, 10, "24K");
        quanLy.themGiaoDich(gdVang);

        // Nhập dữ liệu cho giao dịch tiền tệ
        GiaoDichTienTe gdTienTe = new GiaoDichTienTe("GD002", new Date(), 23000, 1000, 1, "VN");
        quanLy.themGiaoDich(gdTienTe);

        // Xuất danh sách giao dịch
        System.out.println("Danh sách giao dịch:");
        quanLy.xuatDanhSachGiaoDich();

        // Tính tổng số lượng
        System.out.println("Tổng số lượng giao dịch: " + quanLy.tongSoLuong());

        // Tính trung bình thành tiền giao dịch tiền tệ
        System.out.println("Trung bình thành tiền giao dịch tiền tệ: " + quanLy.tinhTrungBinhThanhTienTe());

        // Xuất giao dịch có đơn giá > 1 tỷ
        System.out.println("Các giao dịch có đơn giá > 1 tỷ:");
        quanLy.xuatGiaoDichDonGiaLonHonMotTy();
    }
}
