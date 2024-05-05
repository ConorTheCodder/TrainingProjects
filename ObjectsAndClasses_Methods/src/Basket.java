public class Basket {

    private static int count = 0;
    private String items = "";
    private int totalPrice = 0;
    private int limit;
    private int totalWeight = 0;

    //todo Метод, который будет возвращать значение массы всех товаров в корзине:
    //todo public double getTotalWeight()

    public Basket() {
        increaseCount(1);
        items = "Список товаров:";
        this.limit = 1000000;
    }

    public Basket(int limit) {
        this();
        this.limit = limit;
    }

    public Basket(String items, int totalPrice) {
        this();
        this.items = this.items + items;
        this.totalPrice = totalPrice;
    }

    public static int getCount() {
        return count;
    }

    public static void increaseCount(int count) {
        Basket.count = Basket.count + count;
    }

    public void add(String name, int price) {
        this.add(name, price);
    }

    public void add(String name, int price, int count, double weight) {
        boolean error = false;
        if (contains(name)) {
            error = true;
        }

        if (totalPrice + count * price >= limit) {
            error = true;
        }

        if (error) {
            System.out.println("Error occured :(");
            return;
        }

        items = items + "\n" + name + " - " +
                count + " шт. - " + price;
        totalPrice = totalPrice + count * price;
    }

    public void clear() {
        items = "";
        totalPrice = 0;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public boolean contains(String name) {
        return items.contains(name);
    }

    public void print(String title) {
        System.out.println(title);
        if (items.isEmpty()) {
            System.out.println("Корзина пуста");
        } else {
            System.out.println(items);
        }
    }

    public double getTotalWeight() {

        return totalWeight;

    }

}

//        Допишите в класс Basket :
//
//        1) Переменную “totalWeight”, которая будет содержать общую массу всех товаров, добавленных в корзину:
//         - Начальное значение переменной должно быть равно 0.
//         - При добавлении в корзину товара методом add() с параметром веса  добавляйте переданный в метод вес к этой переменной.
//         - Если вызывается уже существующий в классе метод add(), не содержащий параметр веса (weight), эта переменная не должна изменяться.
//        2) Метод add с дополнительным параметром веса (weight):
//        public void add(String name, int price, int count, double weight)
//        Метод должен переиспользовать существующие методы добавления и добавлять указанный в их параметрах вес товаров к общему весу корзины.
//        3) Метод, который будет возвращать значение массы всех товаров в корзине:
//        public double getTotalWeight()