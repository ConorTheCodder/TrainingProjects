public class Main {
    public static void main(String[] args) {
        Container container = new Container();
        container.addCount(5672);
        System.out.println(container.getCount());

        for (char i = 1; i <= 'ё'; i++) {

            if (i >= 'А') {
                if (i == 'ѐ') {
                    continue;
                }

                System.out.println("Номером буквы " + i + " является: " + (int) i);
            }
            if (i == 'Ё') {
                System.out.println("Номером буквы " + i + " является: " + (int) i);

            }


        }

        // TODO: ниже напишите код для выполнения задания:
        //  С помощью цикла и преобразования чисел в символы найдите все коды
        //  букв русского алфавита — заглавных и строчных, в том числе буквы Ё.

    }
}
