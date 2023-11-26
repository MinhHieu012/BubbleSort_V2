import java.util.ArrayList;
import java.util.List;

// Khai báo đối tượng ketQua để hiển thị kết quả khi chạy xong
class ketQua {
    // Khai báo thuộc tính cho đối tượng ketQua
    // khai báo kiểu dữ liệu boolean (true-false) cho trangThai
    public boolean trangThai;

    // Khai báo kiểu dữ liệu list có lớp Integer (kiểu int) cho noiDungDaySo
    public List<Integer> noiDungDaySo;

    // Khai báo kiểu dữ liệu String cho thongBao
    public String thongBao;

    // Khai báo hàm toString để trả về dạng chuỗi các thuộc tính của đối tượng ketQua
    public String toString() {
        return "Kết quả thuật toán" + "\n" +
                "Trạng thái: " + trangThai + "\n" +
                "Nội dung dãy số: " + noiDungDaySo + "\n" +
                "Thông báo: " + thongBao + "\n";
    }
}

// Khai báo Main là đối tượng chính
public class Main {

    // Khởi tạo hàm sapXepNoiBot
    public static ketQua sapxepNoiBot(List<Integer> daySo) {

        // Khởi tạo lại đối tượng ketQua để sử dụng ở đây
        ketQua ketQua = new ketQua();

        // Kiểm tra phần tử trong dãy có tổng số phần tử = 0?
        if (daySo.size() == 0) {
            ketQua.trangThai = false;
            ketQua.thongBao = "Dãy số không có phần tử nào";
            ketQua. noiDungDaySo = new ArrayList<>();
        }

        // Kiểm tra phần tử trong dãy có tổng số phần tử = 0?
        else if (daySo.size() == 1) {
            ketQua.trangThai = false;
            ketQua.thongBao = "Dãy số có 1 phần tử và không cần sắp xếp";
            ketQua. noiDungDaySo = daySo;
        }

        // Thực hiện so sánh sắp xếp dãy số
        else {
            // Khai báo biến soLanKhongDoi và tongSoLuongPhanTu
            int tongSoLuongPhanTu = daySo.size();
            int soLanKhongDoi;

            do {
                // Reset số lần không đổi về 0 trước mỗi vòng lặp so sánh mới
                soLanKhongDoi = 0;

                // Vòng for duyệt và so sánh sắp xếp phần tử
                for (int i = 0; i <= tongSoLuongPhanTu - 2; i++) {

                    // Khai báo biến j là vị trí đang so sánh
                    int j = i + 1;

                    if (daySo.get(i) > daySo.get(j)) {
                        // Khai báo bienRong để thực hiện đổi giá trị 2 số
                        int bienTrungGian = daySo.get(i);
                        daySo.set(i, daySo.get(j));
                        daySo.set(j, bienTrungGian);
                    } else {
                        // Cộng 1 số lần không đổi
                        soLanKhongDoi++;
                    }

                }
            }
            // Điều kiện dừng vòng do
            while (soLanKhongDoi < tongSoLuongPhanTu - 1);

            // Trả ra thông báo kết quả
            ketQua.trangThai = true;
            ketQua.thongBao = "Dãy số đã được sắp xếp";
            ketQua.noiDungDaySo = daySo;
        }

        // Trả về kết quả đối tượng ketQua
        return ketQua;
    }
    //---------------------------------------------------

    // Khai báo hàm main chính để chạy
    public static void main(String[] args) {

        // Khởi tạo danh sách list chứa các phần tử int cần sắp xếp
        List<Integer> daySo = new ArrayList<Integer>();

        // Thêm các phần tử vào list
        daySo.add(21);
        daySo.add(4);
        daySo.add(6);
        daySo.add(3);
        daySo.add(-2);
        daySo.add(5);

        // Gọi hàm sắp xếp nổi bọt và in ra kết quả
        System.out.println(sapxepNoiBot(daySo));
    }
}
