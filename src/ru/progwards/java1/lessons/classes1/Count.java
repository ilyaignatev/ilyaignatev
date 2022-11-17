package ru.progwards.java1.lessons.classes1;

public class Count {
    int count;
    public Count(){
        count = 0;
    }
    public Count(int count){
        this.count = count;
    }
    public int getCount(){
        return count;
    }
    public void inc(){
        count++;
    }
    public boolean dec(){
        count--;
        if(count <= 0){
             return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {
        Count count1 = new Count(10);
        while (true) {
            if (count1.dec()) {
                System.out.println("count = 0");
                break;
            }
        }
    }
}
