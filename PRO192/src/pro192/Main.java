package PRO192;

public class Main {
    public static void main(String[] args) {
        // Tạo một đối tượng Person mới
        Person person = new Person("example@gmail.com", "Nguyễn Anh Kiệt", "17/05/2003", "Nam", "Quy Nhơn", 123456789);

        // In ra thông tin của person
        person.Display();

        // Thay đổi số điện thoại của person
        person.changsdt(987654321);

        // Thay đổi địa chỉ của person
        person.changediachi("Bình Định");

        // In ra thông tin của person sau khi thay đổi
        person.Display();
    }
}
