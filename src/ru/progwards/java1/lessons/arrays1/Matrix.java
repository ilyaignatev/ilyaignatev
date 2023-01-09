package ru.progwards.java1.lessons.arrays1;

public class Matrix {
    private int[][]matrix;
    public Matrix(int[][]matrix){
        this.matrix = matrix;
    }
    public int maxInRow(int num){
        int MaxNumbers = Integer.MIN_VALUE;
        for(int i : matrix[num]){
            if(i > MaxNumbers){
                MaxNumbers = i;
            }
        }
        return MaxNumbers;
    }
    public int maxInCol(int num){

        return 0;
    }
    public int max(){
        int Number2 = Integer.MIN_VALUE;
        for(int i = 0; i < matrix.length; i++){
            if(maxInRow(i) > Number2){
                Number2 = maxInRow(i);
            }
        }
        return Number2;
    }
    public boolean isMatrix(){
        int ArrayMatrix[][] = new int[5][];
        for(int i = 0; i < ArrayMatrix.length; i++){
            for (int j = 0; j < ArrayMatrix[0].length; j++){
                if(ArrayMatrix[i] == ArrayMatrix[j]){
                        return true;
                }
            }
        }
return false;
    }
    public int[][] transposition(){
        int n = 3;
        int[][] transposition = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                transposition[i][j] = n * i + j;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                int temp = transposition[i][j];
                transposition[i][j] = transposition[j][i];
                transposition[j][i] = temp;
            }
        }
        return null;
    }

    public static void main(String[] args) {

    }
}
