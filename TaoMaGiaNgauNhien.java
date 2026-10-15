import java.util.Random;
import java.util.Scanner;

public class TaoMaGiaNgauNhien {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Nhập số nguyên n từ người dùng
        System.out.print("Nhập độ dài n (1 <= n <= 1000): ");
        int n;
        try {
            n = Integer.parseInt(scanner.nextLine().trim());
        } catch (NumberFormatException e) {
            n = -1;
        }

        // 2. Kiểm tra điều kiện hợp lệ của n
        if (n < 1 || n > 1000) {
            System.out.println("Kích thước n không hợp lệ (yêu cầu 1 <= n <= 1000).");
            scanner.close();
            return;
        }

        // 3. Khởi tạo tập hợp ký tự bao gồm chữ cái in hoa, chữ cái in thường và số
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        Random random = new Random();
        StringBuilder sb = new StringBuilder();

        // 4. Sử dụng vòng lặp sinh ngẫu nhiên các ký tự cho đến khi đạt độ dài n
        for (int i = 0; i < n; i++) {
            int randomIndex = random.nextInt(chars.length());
            sb.append(chars.charAt(randomIndex));
        }

        // 5. Hiển thị kết quả mã ngẫu nhiên
        System.out.println("Mã ngẫu nhiên sinh ra: \"" + sb.toString() + "\"");

        scanner.close();
    }
}