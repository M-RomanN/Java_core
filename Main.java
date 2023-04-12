package hw_lesson_3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Box<Apple> appleBox = new Box<>();
        appleBox.addFruit(new Apple(1));
        appleBox.addFruit(new Apple(1));
        appleBox.addFruit(new Apple(1));

        Box<Apple> appleBox2 = new Box<>();
        appleBox2.addFruit(new Apple(1));
        appleBox2.addFruit(new Apple(1));

        System.out.println("Apple box " + appleBox.getWeight());
        System.out.println("Next apple box " + appleBox2.getWeight());

        appleBox.pourOver(appleBox);

        Box<Orange> orangeBox = new Box<>();
        orangeBox.addFruit(new Orange(1));
        orangeBox.addFruit(new Orange(1));
        orangeBox.addFruit(new Orange(1));
        System.out.println("Orange box " + orangeBox.getWeight());
        orangeBox.pourOver(orangeBox);

    }

    public static void changeArrElements(Object[] array, int n1, int n2) {
        System.out.println(Arrays.toString(array));
        Object swap = array[n1];
        array[n1]=array[n2];
        array[n2]=swap;
        System.out.println("The result of the replacement: "+Arrays.toString(array)+"\n * * *");
    }

}