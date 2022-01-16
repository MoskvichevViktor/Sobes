package lesson_1.task_3;

public class Circle extends Figura{
    int radius;
    public Circle(int radius) {
        this.radius = radius;
    }
    public void Perimetr(){
        System.out.println(2*3.14*radius);
    }

}
