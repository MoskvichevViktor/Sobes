package lesson_1.task_2;

public class Task_2 {

    public interface Moveable {
        void move();
    }

    public interface Stopable {
        void stop();
    }

    public interface Openable {
        void open();
    }



    public class Engine {

        public Engine engine;

        public Engine getEngine() {
            return engine;
        }

        public void setEngine(Engine engine) {
            this.engine = engine;
        }

    }


    abstract class Car {

        private String color;
        private String name;


        public void start() {
            System.out.println("Car starting");
        }


        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    class LightWeightCar extends Car implements Moveable, Openable {

        @Override
        public void start() {
            super.start();
        }

        @Override
        public void open() {
            System.out.println("Car is open");
        }

        @Override
        public void move() {
            System.out.println("Car is moving");
        }

    }

    class Lorry extends Car implements Moveable, Stopable, Openable{

        @Override
        public void move(){
            System.out.println("Car is moving");
        }

        @Override
        public void stop(){
            System.out.println("Car is stop");
        }

        @Override
        public void open() {
            System.out.println("Car is open");
        }
    }
}
