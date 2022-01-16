package lesson_1.task_3;

public class Triangle extends  Figura{
    int a, b, c;
    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public void Perimetr(){
        System.out.println(a+b+c);
    }
}
