import java.util.Scanner;

public class HandlingExceptions {

    public static void main(String[] args) {
        // Xử lý exception cho trường hợp chia cho số 0
        try {
            int a = 10;
            int b = 0;

            System.out.println(a / b);
        } catch (ArithmeticException e) {
            System.out.println("Không thể chia cho số 0");
        }

        // Xử lý exception cho trường hợp muốn nhận số nhưng người dùng nhập string
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số: ");
        String input = scanner.nextLine();

        try {
            int number = Integer.parseInt(input);
            System.out.println(number);
        } catch (NumberFormatException e) {
            System.out.println("Số nhập vào không hợp lệ");
        }
    }
}