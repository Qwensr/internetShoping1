public class Main {
    public static void main(String[] args) {
        ElectronicProduct electronicProduct1 = new ElectronicProduct("Smartphone", 500, 0.45);
        ElectronicProduct electronicProduct2 = new ElectronicProduct("Laptop", 1200, 1.5);
        ElectronicProduct electronicProduct3 = new ElectronicProduct("Tablet", 300, 0.8);
        ElectronicProduct electronicProduct4 = new ElectronicProduct("Headphones", 80, 0.1);
        ElectronicProduct electronicProduct5 = new ElectronicProduct("Smartwatch", 150, 0.2);


        System.out.println("ЭЛЕКТРОННЫЕ ПРОДУКТЫ: ");
        electronicProduct1.displayInfo();
        System.out.println("Цена со скидкой: " + electronicProduct1.discountPrice(5) + "$");
        System.out.println("Стоимость доставки смартфона: " + electronicProduct1.CalculateShippingCost(100) + "$");
        System.out.println("Итог: " + (electronicProduct1.discountPrice(5) +
                electronicProduct1.CalculateShippingCost(100)) + "$");

        electronicProduct2.displayInfo();
        System.out.println("Цена со скидкой: " + electronicProduct2.discountPrice(10) + "$");
        System.out.println("Стоимость доставки ноутбука: " + electronicProduct2.CalculateShippingCost(100) + "$");
        System.out.println("Итого " + (electronicProduct2.discountPrice(5) +
                electronicProduct2.CalculateShippingCost(100)) + "$");



        electronicProduct3.displayInfo();
        System.out.println("Цена со скидкой: " + electronicProduct3.discountPrice(2) + "$");
        System.out.println("Стоимость доставки планшета: $" + electronicProduct3.CalculateShippingCost(100));
        System.out.println("Итого: " + (electronicProduct3.discountPrice(2) +
                electronicProduct3.CalculateShippingCost(100)) + "$");

        electronicProduct4.displayInfo();
        System.out.println("Цена со скидкой: " + electronicProduct4.discountPrice(0) + "$");
        System.out.println("Стоимость доставки наушника: $" + electronicProduct4.CalculateShippingCost(100));
        System.out.println("Итого: " + (electronicProduct4.discountPrice(0) +
                electronicProduct4.CalculateShippingCost(100)) + "$");

        electronicProduct5.displayInfo();
        System.out.println("Цена со скидкой: " + electronicProduct5.discountPrice(5) + "$");
        System.out.println("Стоимость доставки Смарт часов: $" + electronicProduct5.CalculateShippingCost(100));
        System.out.println("Total: " + (electronicProduct5.discountPrice(5) +
                electronicProduct5.CalculateShippingCost(100)) + "$");


        ClothingProduct clothingProduct1 = new ClothingProduct("Nike T-Shirt", "M", "Blue", 50.6);
        ClothingProduct clothingProduct2 = new ClothingProduct("Adidas shoes", "L", "Red", 78.3);
        ClothingProduct clothingProduct3 = new ClothingProduct("Puma trousers", "S", "Black", 25.2);
        ClothingProduct clothingProduct4 = new ClothingProduct("Levi's jeans", "XL", "Green", 45.1);
        ClothingProduct clothingProduct5 = new ClothingProduct("Tommy Hilfiger T-Shirt", "M", "White", 90.9);


        System.out.println("\n\n\n\nОТДЕЛ ВЕЩЕЙ: ");
        clothingProduct1.displayInfo();
        System.out.println("Цена со скидкой: " + clothingProduct1.discountPrice(6) + "$");
        System.out.println("Стоимость доставки: " + clothingProduct1.CalculateShippingCost(260) + "$");
        System.out.println("Итого: " + (clothingProduct1.discountPrice(6) +
                clothingProduct2.CalculateShippingCost(260)) + "$");


        clothingProduct2.displayInfo();
        System.out.println("Цена со скидкой: " + clothingProduct2.discountPrice(0) + "$");
        System.out.println("Стоимость доставки: " + clothingProduct2.CalculateShippingCost(260) + "$");
        System.out.println("Итого: " + (clothingProduct2.discountPrice(0) +
                clothingProduct2.CalculateShippingCost(260)) + "$");

        clothingProduct3.displayInfo();
        System.out.println("Цена со скидкой: " + clothingProduct3.discountPrice(50) + "$");
        System.out.println("Стоимость доставки: " + clothingProduct3.CalculateShippingCost(260) + "$");
        System.out.println("Итого: " + (clothingProduct3.discountPrice(50) +
                clothingProduct1.CalculateShippingCost(260)) + "$");

        clothingProduct4.displayInfo();
        System.out.println("Цена со скидкой: " + clothingProduct4.discountPrice(10) + "$");
        System.out.println("Доставки нет: " + clothingProduct4.isFreeShipping());
        System.out.println("Итого: " + (clothingProduct4.discountPrice(10) + "$"));

        clothingProduct5.displayInfo();
        System.out.println("Цена со скидкой: " + clothingProduct5.discountPrice(10) + "$");
        System.out.println("Стоимость доставки: " + clothingProduct5.CalculateShippingCost(260) + "$");
        System.out.println("Итого: " + (clothingProduct5.discountPrice(10) +
                clothingProduct5.CalculateShippingCost(260)) + "$\n");
        System.out.println("Если вы приобретете его до декабря, вы заплатите полную стоимость.: " +
                clothingProduct5.applyAdditionalDiscount(15) + clothingProduct5.CalculateShippingCost(260) + "$");
    }
}
