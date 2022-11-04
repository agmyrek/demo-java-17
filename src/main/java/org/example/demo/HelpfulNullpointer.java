package org.example.demo;

public class HelpfulNullpointer {



    public static void main(String[] args) {

        methodWithNullpointer(null);
    }

    private static void methodWithNullpointer(String abc){

        //provoke nullpointer
        abc.toLowerCase();
    }

}
