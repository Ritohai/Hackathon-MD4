package Exam_Advance_1.src.ra.run;

import Exam_Advance_1.src.ra.config.InputMethod;
import Exam_Advance_1.src.ra.model.CartItem;
import Exam_Advance_1.src.ra.model.Catalog;
import Exam_Advance_1.src.ra.model.Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BookManagement {
    static List<Catalog> catalogs = new ArrayList<>();
    static List<Product> products = new ArrayList<>();
    static List<CartItem> cartItems = new ArrayList<>();

    public static void main(String[] args) {
        while (true) {
            System.out.println("**************************BASIC-MENU**************************\n" +
                    "1. Quản lý danh mục [5 điểm]\n" +
                    "2. Quản lý sản phẩm [5 điểm]\n" +
                    "3. Dành cho người dùng (***)\n" +
                    "4. Thoát [5 điểm]");
            System.out.println("Nhập số bạn muốn chọn: ");
            int choice = InputMethod.getInteger();
            switch (choice) {
                case 1:
                    catalogManagement();
                    break;
                case 2:
                    productManagement();
                    break;
                case 3:
                    userManagement();
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Chọn số từ 1 đến 3");
            }
        }
    }

    public static void catalogManagement() {
        int choice = 0;
        while (choice != 5) {
            System.out.println("********************CATALOG-MANAGEMENT********************\n" +
                    "1. Nhập số danh mục thêm mới và nhập thông tin cho từng danh mục [5 điểm]\n" +
                    "2. Hiển thị thông tin tất cả các danh mục [5 điểm]\n" +
                    "3. Sửa tên danh mục theo mã danh mục [5 điểm]\n" +
                    "4. Xóa danh muc theo mã danh mục (lưu ý ko xóa khi có sản phẩm) [5 điểm]\n" +
                    "5. Quay lại\n");
            System.out.println("Nhập số bạn muốn chọn: ");

            choice = InputMethod.getInteger();
            switch (choice) {
                case 1:
                    addNewCatalog();
                    break;
                case 2:
                    displayCatalog();
                    break;
                case 3:
                    editCatalog();
                    break;
                case 4:
                    removeCatalog();
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Chọn số từ 1 đến 5");
                    break;
            }
        }
    }

    public static void addNewCatalog() {
        System.out.println("Nhập số lượng danh mục cần thêm mơi: ");
        int ctl = InputMethod.getInteger();
        for (int i = 0; i < ctl; i++) {
            Catalog catalog = new Catalog();
            System.out.println("Danh mục thứ: " + (i + 1));
            System.out.println("Nhập Id danh mục: ");
            catalog.setCatalogId(InputMethod.getInteger());
            System.out.println("Nhập tên danh mục:");
            catalog.setCatalogName(InputMethod.getString());
            catalogs.add(catalog);
        }
    }

    public static void displayCatalog() {
        System.out.println(catalogs);
    }

    public static void editCatalog() {
        System.out.println("Nhập mã danh mục: ");
        List<Integer> numbers = new ArrayList<>();
        for (Catalog catalog : catalogs) {
            numbers.add(catalog.getCatalogId());
        }
        int input = InputMethod.getInteger();
        for (Catalog catalog : catalogs) {
            if (catalog.getCatalogId() == input) {
                System.out.println("Nhập ten danh mục muốn thay đổi: ");
                String newName = InputMethod.getString();
                catalog.setCatalogName(newName);
                System.out.println("Sửa thành công");
                break;
            }
        }
    }

    public static void removeCatalog() {
        System.out.println("Nhập mã danh mục: ");
        List<Integer> numbers = new ArrayList<>();
        for (Catalog catalog : catalogs) {
            numbers.add(catalog.getCatalogId());
        }
        int input = InputMethod.getInteger();
        for (Catalog catalog : catalogs) {
            if (catalog.getCatalogId() == input) {
                catalogs.remove(catalog);
                System.out.println("Xoa thanh cong");
                break;
            }
        }
    }

    public static void productManagement() {
        int choice = 0;
        while (choice != 7) {
            System.out.println("********************PRODUCT-MANAGEMENT********************\n" +
                    "1. Nhập số sản sản phẩm và nhập thông tin sản phẩm [5 điểm]\n" +
                    "2. Hiển thị thông tin các sản phẩm [5 điểm]\n" +
                    "3. Sắp xếp sản phẩm theo giá giảm dần [5 điểm]\n" +
                    "4. Xóa sản phẩm theo mã [5 điểm]\n" +
                    "5. Tìm kiếm sách theo tên sách [10 điểm]\n" +
                    "6. Thay đổi thông tin của sách theo mã sách [10 điểm]\n" +
                    "7. Quay lại");
            System.out.println("Nhập số bạn muốn chọn: ");
            choice = InputMethod.getInteger();
            switch (choice) {
                case 1:
                    addNewProduct();
                    break;
                case 2:
                    displayProduct();
                    break;
                case 3:
                    Collections.sort(products);
                    break;
                case 4:
                    removeProduct();
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                default:
                    System.out.println("Chọn số từ 1 đến 7");
            }
        }
    }

    public static void addNewProduct() {
        System.out.println("Nhập số sản phẩm muốn thêm: ");
        int productNumber = InputMethod.getInteger();
        for (int i = 0; i < productNumber; i++) {
            Product product = new Product();
            System.out.println("Nhập id thứ: " + (i + 1));
            product.setProductId(InputMethod.getProductId());
            System.out.println("Nhập tên: ");
            product.setProductName(InputMethod.getString());
            System.out.println("Nhập giá: ");
            product.setProductPrice(InputMethod.getDouble());
            System.out.println("Nhập description: ");
            product.setDescription(InputMethod.getString());
            System.out.println("Nhập Stock: ");
            product.setStock(InputMethod.getProductInt());
//            products.add(product);
            while (true) {
                boolean flag = false;
                System.out.println("Nhap catalog sản phẩm");
                int id = InputMethod.getInteger();
                for (Catalog au : catalogs) {
                    if (au.getCatalogId() == id) {
                        product.setCatalog(au);
                        flag = true;
                        break;
                    }
                }
                if (flag) {
                    break;
                }
                System.err.println("Id not found");
            }
            System.out.println("Nhập trạng thái sản phẩm:");
            product.setStatus(InputMethod.getBoolean());
            products.add(product);
        }
    }

    public static void displayProduct() {
        System.out.println(products);
    }

    public static void removeProduct() {
        System.out.println("Nhập mã sản phẩm: ");
        List<String> strings = new ArrayList<>();
        for (Product product : products) {
            strings.add(product.getProductId());
        }
        String input = InputMethod.getString();
        for (Product product : products) {
            if (product.getProductId().equals(input)) {
                products.remove(product);
                System.out.println("Xoa thanh cong");
                break;
            }
        }
    }

    public static void userManagement() {
        int choice = 0;
        while (choice != 7) {
            System.out.println("**************************MENU-USER**************************\n" +
                    "1. Xem danh sách sản phẩm\n" +
                    "2. Thêm vào giỏ hàng\n" +
                    "3. Xem tất cả sản phẩm giỏ hàng\n" +
                    "4. Thay đổi số lượng sản phẩm trong giỏ hàng\n" +
                    "5. Xóa 1 sản phẩm trong giỏ hàng\n" +
                    "6. Xóa toàn bộ sản phẩm trong giỏ hàng\n" +
                    "7. Quay lại\n");
            System.out.println("Nhập lựa chọn của bạn: ");
            choice = InputMethod.getInteger();
            switch (choice) {
                case 1:
                    showProduct();
                    break;
                case 2:
                    addCarrt();
                    break;
                case 3:
                    if(cartItems.isEmpty()){
                        System.err.println("Giỏ hàng không có sản phẩm");
                    } else {
                        System.out.println(cartItems);
                    }
                    break;
                case 4:
                    addQuality();
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                default:
                    System.out.println("Nhập giá trị từ 1 đên 7");
            }
        }
    }

    public static void showProduct() {
        if (products.isEmpty()) {
            System.out.println("Không có sản phẩm nào bán");
        } else {
            for (Product product : products) {
                if (product.isStatus()) {
                    System.out.println(product);
                }
            }
        }
    }

    public static void addCarrt() {
        System.out.println("Nhập id muốn thêm giỏ hàng: ");
        String string = InputMethod.getString();
        List<String> idProduct = new ArrayList<>();
        for (Product product : products) {
            if (product.isStatus()) {
                idProduct.add(product.getProductId());
            }
        }
        List<String> idCart = new ArrayList<>();
        for (CartItem cartItem : cartItems) {
            idCart.add(cartItem.getProduct().getProductId());
        }
        if (idProduct.contains(string) && idCart.contains(string)) {
            CartItem cartItem = new CartItem();
            cartItem.setCartItemId(cartItems.size() + 1);
            for (Product product : products) {
                if (product.getProductId().equals(string) && product.getStock() > 0) {
                    cartItem.setProduct(product);
                    cartItem.setPrice(product.getProductPrice());
                    product.setStock(product.getStock() - 1);
                    break;
                } else if (product.getProductId().equals(string) && product.getStock() <= 0) {
                    System.out.println("Sản phẩm hết hàng");
                    return;
                }
            }
            cartItem.setQuantity(1);
            cartItems.add(cartItem);
            System.out.println("Thêm giỏ hàng thành công");
        } else if (idProduct.contains(string) || idCart.contains(string)) {
            for (CartItem cartItem : cartItems) {
                if (cartItem.getProduct().getProductId().equals(string) && cartItem.getProduct().getStock() > 0) {
                    cartItem.setQuantity(cartItem.getQuantity() + 1);
                    cartItem.getProduct().setStock(cartItem.getProduct().getStock() - 1);
                } else if (cartItem.getProduct().getProductId().equals(string) && cartItem.getProduct().getStock() <= 0) {
                    System.out.println("Sản phâm hết hàng");
                    return;
                }
            }
            System.out.println("thêm giỏ hàng thành công");
        } else {
            System.out.println("ID sản phẩm không tồn tại");
        }
    }

    public static void addQuality() {
        System.out.println("Nhập số lượng sản phẩm muốn mua: ");
        int number = InputMethod.getInteger();
        for (CartItem cartItem : cartItems) {

        }
    }
}


