package lesson_1.task_3;

public class Square extends Figura{
    int a, b, c, d;
    public Square(int a, int b, int c, int d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    public void Perimetr(){
        System.out.println(a+b+c+d);
    }
}
