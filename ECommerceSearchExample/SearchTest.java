public class SearchTest {

    public static void main(String[] args) {

        Product[] products = {

            new Product(1001, "Laptop", "Electronics"),
            new Product(1002, "Phone", "Electronics"),
            new Product(1003, "Mouse", "Accessories"),
            new Product(1004, "Keyboard", "Accessories"),
            new Product(1005, "Monitor", "Electronics")
        };

        System.out.println("Linear Search:");

        Product result1 =
                LinearSearch.search(products, 1004);

        if (result1 != null)
            result1.display();

        System.out.println();

        System.out.println("Binary Search:");

        Product result2 =
                BinarySearch.search(products, 1004);

        if (result2 != null)
            result2.display();
    }
}