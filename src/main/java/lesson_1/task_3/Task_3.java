package lesson_1.task_3;

public class Task_3 {
    //Написать пример кода, который реализует принцип полиморфизма,
    // на примере фигур — круг, квадрат, треугольник.

    public static void main(String[] args) {

        Figura [] f = new Figura[3];
        f[0] = new Circle(5);
        f[1] = new Square(4, 5, 4, 5);
        f[2] = new Triangle(4,5,6);

        for(int i=0; i<f.length; i++)
            f[i].Perimetr();
    }
}
