import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ho ten: ");
        String hoTen = scanner.nextLine();
        System.out.println("MSSV: ");
        String mssv = scanner.nextLine();
        System.out.println("Lop hoc phan: ");
        String lopHocPhan = scanner.nextLine();
        Welcome welcome = new Welcome(hoTen, mssv, lopHocPhan);
    }
}