package Lesson6.homework;

abstract class Animal {
//    protected int _length;
//    protected double _height;

    protected int swimLimit;
    protected int runLimit;
    protected double jumpLimit;

    public abstract void run(int length);

    public abstract void swim(int length);

    public abstract void jump(int height);
}
