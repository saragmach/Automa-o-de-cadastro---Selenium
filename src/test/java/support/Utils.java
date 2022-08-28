package support;


import runner.RunCucumberTest;

import java.util.Random;

public class Utils extends RunCucumberTest {

    public String getRandomEmail(){
        String email_int = "sa_";
        String emaiil_final = "@hotmail.com";

        Random random = new Random();
        int minimo = 1;
        int maximo = 999999999;
        int resultado = random.nextInt(maximo-minimo) + minimo;

        return email_int + resultado + emaiil_final;
    }

    public static void pause (){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }


}
