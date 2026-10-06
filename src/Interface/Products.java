package Interface;

public class Products implements Comparable<Products>{
    int pid;
    String name;

    public Products(int pid , String name){
        this.pid = pid;
        this.name = name;
    }

    @Override
    public int compareTo(Products o) {
        return 0;
    }
}
