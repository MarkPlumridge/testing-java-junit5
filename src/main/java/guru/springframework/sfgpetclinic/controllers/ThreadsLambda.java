package guru.springframework.sfgpetclinic.controllers;

public class ThreadsLambda {

    public static void main(String[] args) {

        Runnable task1 = () -> { System.out.println("Thread started");};

        new Thread(task1).start();



    }


}
