import java.util.Scanner;

public class Learnjava {

    public static void main(String[] args) {
        // Khởi tạo Scanner để đọc từ bàn phím
        Scanner sc = new Scanner(System.in);

        // Nhập lựa chọn bài tập
        System.out.println("Chọn bài tập (1-4): ");
        int luaChon = sc.nextInt();

        // Gọi hàm thực hiện bài tập tương ứng
        switch (luaChon) {
            case 1 -> {
                // Bài tập 1: Tính toán các phép toán số học cơ bản
                System.out.println("Nhập số a: ");
                int a = sc.nextInt();
                System.out.println("Nhập số b: ");
                int b = sc.nextInt();

                int sum = a + b;
                int sub = a - b;
                int mul = a * b;
                float div = (float) a / b;

                System.out.println("a + b = " + sum);
                System.out.println("a - b = " + sub);
                System.out.println("a * b = " + mul);
                System.out.println("a / b = " + div);
            }
            case 2 -> {
                // Bài tập 2: Tạo tên đầy đủ từ họ và tên
                System.out.println("Nhập họ: ");
                String ho = sc.nextLine();
                System.out.println("Nhập tên: ");
                String ten = sc.nextLine();

                String tenDayDu = ho + " " + ten;

                System.out.println("Tên đầy đủ: " + tenDayDu);
            }
            case 3 -> {
                // Bài tập 3: Tính điểm học phần
                System.out.println("Nhập điểm chuyên cần: ");
                float diemCC = sc.nextFloat();
                System.out.println("Nhập điểm giữa kỳ: ");
                float diemGK = sc.nextFloat();
                System.out.println("Nhập điểm cuối kỳ: ");
                float diemCK = sc.nextFloat();

                float diemHP = (float) ((diemCC * 0.2) + (diemGK * 0.3) + (diemCK * 0.5));

                System.out.println("Điểm học phần: " + diemHP);
            }
            case 4 -> {
                // Bài tập 4: Kiểm tra họ tên có tồn tại trong danh sách hay không
                System.out.println("Nhập họ tên cần kiểm tra: ");
                String hoTenCanKiemTra = sc.nextLine();

                // Khởi tạo danh sách
                String[] danhSach = {"Nguyễn Văn A", "Trần Thị B", "Lê Hoàng C"};

                // Kiểm tra họ tên có tồn tại trong danh sách hay không
                boolean tonTai = false;
                for (String hoTen : danhSach) {
                    if (hoTen.equals(hoTenCanKiemTra)) {
                        tonTai = true;
                        break;
                    }
                }

                // In ra kết quả
                if (tonTai) {
                    System.out.println("Tên " + hoTenCanKiemTra + " có tồn tại trong danh sách.");
                } else {
                    System.out.println("Tên " + hoTenCanKiemTra + " không tồn tại trong danh sách.");
                }
            }
            default -> System.out.println("Lựa chọn không hợp lệ.");
        }
    }
}
