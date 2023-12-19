public class Arithmetic {

    int firstNum;
    int secondNum;

    Arithmetic(int firstNum, int secondNum) {
        this.firstNum = firstNum;
        this.secondNum = secondNum;
    }

    void sum() {
        int summary = this.firstNum + this.secondNum;
        System.out.println("Сумма чисел " + this.firstNum + " и " + this.secondNum + " равна: " + summary + "." );
    }

    void sub() {
        int subtraction = this.firstNum - this.secondNum;
        System.out.println("Разница чисел " + this.firstNum + " и " + this.secondNum + " равна: " + subtraction + "." );
    }

    void mul() {
        int multiplication = this.firstNum * this.secondNum;
        System.out.println("Произведение чисел " + this.firstNum + " и " + this.secondNum + " равно: " + multiplication + "." );
    }

    void div() {
        int division = this.firstNum - this.secondNum;
        System.out.println("Деление чисел " + this.firstNum + " и " + this.secondNum + " равно: " + division + "." );
    }
    void max () {
        System.out.println("Наибольшее из двух чисел: " + (Math.max(this.firstNum, this.secondNum)) );
    }
    void min () {
        System.out.println("Наименьшее из двух чисел: " + (Math.min(this.firstNum, this.secondNum)));
    }


//TODO Создайте класс Arithmetic с двумя переменными — числами типа int.
// Создайте в этом классе конструктор, принимающий два параметра — тоже числа типа int.
// В конструкторе сохраняйте переданные параметры в переменных класса.
// В созданном классе реализуйте методы, вычисляющие различные величины (значения) на основе переменных класса, а именно:
// сумму чисел;
// произведения чисел;
// максимальное из двух чисел;
// минимальное из двух чисел.
// Имена методов придумайте самостоятельно.
}
