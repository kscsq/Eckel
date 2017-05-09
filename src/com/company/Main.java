package com.company;

public class Main {

    public static void main(String[] args) {

        Test t = new Test();
        System.gc();
    }

    public static class Test
    {
       public void finalize(){
           System.out.println("Finalize is running...");
       }
    }
}
