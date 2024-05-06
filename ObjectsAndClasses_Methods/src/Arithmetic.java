public class Arithmetic {

    public int firstNum;
    public int secondNum;


    Arithmetic(int firstNum, int secondNum) {
        this.firstNum = firstNum;
        this.secondNum = secondNum;
    }

    public int summary() {
        int sum = this.firstNum + this.secondNum;
        return sum;
    }

    public int multiplication() {
        int mul = this.firstNum - this.secondNum;
        return mul;
    }




    public int max () {
        int maximum = Math.max(this.firstNum, this.secondNum);
        return maximum;
    }
    public int min () {
        int minimum = Math.min(this.firstNum, this.secondNum);
        return minimum;
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
