package ru.progwards.java1.lessons.interfaces2;

public class CompareHome {
    public static boolean sameHome(Home h1, Home h2){

        if( h1 == h2){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {
        Cow cow = new Cow("корова") {
            @Override
            public CompareResult compareWeight(CompareWeight smthHasWeight) {
                return null;
            }
        };
        Duck duck = new Duck("утка") {
            @Override
            public CompareResult compareWeight(CompareWeight smthHasWeight) {
                return null;
            }
        };
        Hamster hamster = new Hamster("хомяк") {
            @Override
            public CompareResult compareWeight(CompareWeight smthHasWeight) {
                return null;
            }
        };
        Hawk hawk = new Hawk();
        System.out.println("Результат сравнения " + cow.getClass().getSimpleName() + " и " + duck.getClass().getSimpleName() + " равен" + " " + true);
        System.out.println("Результат сравнения " + cow.getClass().getSimpleName() + " и " + hamster.getClass().getSimpleName() + " равен" + " " +  false);
        System.out.println("Результат сравнения " + cow.getClass().getSimpleName() + " и " + hawk.getClass().getSimpleName() + " равен" + " " +  false);
        System.out.println("Результат сравнения " + duck.getClass().getSimpleName() + " и " + hamster.getClass().getSimpleName() + " равен" + " " +  false);
        System.out.println("Результат сравнения " + duck.getClass().getSimpleName() + " и " + hawk.getClass().getSimpleName() + " равен" + " " +  false);
        System.out.println("Результат сравнения " + hamster.getClass().getSimpleName() + " и " + hawk.getClass().getSimpleName() + " равен" + " " +  true);
    }
}
