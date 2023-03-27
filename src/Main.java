import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập cạnh a: ");
        int a = scanner.nextInt();
        System.out.println("Nhập cạnh b: ");
        int b = scanner.nextInt();
        System.out.println("Nhập cạnh c: ");
        int c = scanner.nextInt();
        try {
            if (a <= 0 || b <= 0 || c <= 0)
                throw new IllegalTriangleException("Cạnh có giá trị âm");
            if ((a+b)<=c||(a+c)<=b||(b+c)<=a)
                throw new IllegalTriangleException("Cạnh ko thỏa mãn điều kiện tam giác");
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}