package ru.progwards.java1.lessons.arrays1;

public class Eratosthenes {
    private boolean[] sieve;
    int N;
    public Eratosthenes(int N) {
        this.N = N;

    }
    private void sift(){
    for (int i = 2; i <= 100; i++){
        boolean sieve = true;
        for(int j = 2; j <= 100; j++){
            if(i % j == 0){
                sieve = false;
                break;
            }
        }
        if(sieve);
        System.out.println(i);
    }
    }
    public boolean isSimple(int n){
        if (n < 2)
            return false;
        double s = Math.sqrt(n);
        for (int i = 2; i <= s; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
}
