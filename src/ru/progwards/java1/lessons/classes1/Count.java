package ru.progwards.java1.lessons.classes1;

public class Count {
    int count;
    public Count(int count){
    this.count = count(0);
    }

    private int count(int i) {
        int count1 = 0;
        return count1;
    }

    public int getCount(){
        return count;
    }
    public void inc() {
        count++;
    }
    public boolean dec(){
        if(count<= 0){
            count--;
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Count count1 = new Count(10);
        for(int count = 0; count <= 0; count--){
            System.out.println("count = 0");
            break;
        }
    }
}
