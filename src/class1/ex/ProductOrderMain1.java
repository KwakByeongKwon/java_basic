package class1.ex;

public class ProductOrderMain1 {
    public static void main(String[] args) {
        ProductOrder tofu = new ProductOrder(); // 두부
        tofu.productName = "두부";
        tofu.price = 2000;
        tofu.quantity = 2;
        System.out.println("상품명: " + tofu.productName + ", 가격: " + tofu.price + ", 수량: " + tofu.quantity);

        ProductOrder kimchi = new ProductOrder(); // 김치
        kimchi.productName = "김치";
        kimchi.price = 5000;
        kimchi.quantity = 1;
        System.out.println("상품명: " + kimchi.productName + ", 가격: " + kimchi.price + ", 수량: " + kimchi.quantity);

        ProductOrder coke = new ProductOrder(); // 콜라
        coke.productName = "콜라";
        coke.price = 1500;
        coke.quantity = 2;
        System.out.println("상품명: " + coke.productName + ", 가격: " + coke.price + ", 수량: " + coke.quantity);

        int totalPrice = (tofu.price * tofu.quantity) + (kimchi.price * kimchi.quantity) + (coke.price * coke.quantity);
        System.out.println("총 결제 금액: " + totalPrice);
    }
}
