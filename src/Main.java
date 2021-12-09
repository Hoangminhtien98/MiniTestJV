

import java.util.Properties;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập số lượng SP: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Thông tin SP: ");
        Product[] productlist = new Product[n];
        for (int i = 0; i < productlist.length; i++) {
            System.out.println("Nhập thông tin SP thứ " + (i + 1));
            productlist[i] = products(scanner);
        }

        for (int i = 0; i < productlist.length; i++) {
            System.out.println(productlist[i].toString());
        }
//        Tìm sản phẩm theo tên
        System.out.println("Nhập tên SP cần tìm: ");
        String nameProduct = scanner.nextLine();
        int count = 0;
        for (int i = 0; i < productlist.length; i++) {
            if (productlist[i].getName().equals(nameProduct)) {
                System.out.println(productlist[i]);
                count++;
            }
        }
        if (count == 0) {
            System.out.println("SP không có trong dang mục");
        }

//        Tính tổng giá các sản phẩm
        int sumProduct = 0;
        for (int i = 0; i < productlist.length; i++) {
            sumProduct += productlist[i].getPrice();
        }
        System.out.println("Tổng giá SP = " + sumProduct);

    }


    public static Product products(Scanner scanner) {
        String id;
        String name;
        double price;
        String type;
        System.out.println("Nhập ID: ");
        id = scanner.nextLine();
        System.out.println("Nhập tên: ");
        name = scanner.nextLine();
        System.out.println("Nhập giá: ");
        price = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhập loại: ");
        type = scanner.nextLine();

        return new Product(id, name, price, type);
    }

}