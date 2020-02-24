package Lesson6.homework;

public class Cat extends Animal{
    private static String Name = "Мурзик";

    @Override
    public String toString() {
        return Name;
    }

    public Cat() {
        this.swimLimit = 0;
        this.runLimit = 200;
        this.jumpLimit = 2;
    }

    @Override
        public void run(int length) {
        if (length <= runLimit) {
            System.out.println(this + " бежит " + length + " метра(ов)");
        } else {
            System.out.println(this + " не может пробежать столько");
        }
    }
    @Override
    public void swim(int length) {
        System.out.println(this + " не умеет плавать");
    }

    @Override
    public void jump(int height) {
        if (height <= jumpLimit) {
            System.out.println(this + " прыгает на высоту " + height + " метра(ов)");
        } else {
            System.out.println(this + " не может запрыгнуть на эту высоту");
        }
    }
}
