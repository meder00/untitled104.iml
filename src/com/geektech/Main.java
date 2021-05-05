package com.geektech;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(Apple(generateRandomAge(),21));
        System.out.println(Apple(generateRandomAge(),9));
        System.out.println(Apple(generateRandomAge(),15));

    }
    public static String Apple(int are,int temperature) {
        if (are >= 20 && are <= 45 && temperature > -20 && temperature < 30) {
            return " вызрослым можно идти гулять";

        } else if (are < 20 && temperature >= 0 && temperature < 28) {
            return " подросткам можно идти гулять";

        } else if (are > 45 && temperature >= -10 && temperature < 25) {
            return " дедушкам можно идти гулять";

        } else {
            return "оставайтесь дома";
        }

    }public static int generateRandomAge(){
    Random random = new Random();
    return random.nextInt(70);

    }
}





