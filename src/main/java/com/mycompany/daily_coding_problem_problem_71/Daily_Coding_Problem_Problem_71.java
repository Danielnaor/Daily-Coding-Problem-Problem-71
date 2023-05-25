/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.daily_coding_problem_problem_71;

import java.util.Random;

/**
 *
 * @author Danielnaor
 */
public class Daily_Coding_Problem_Problem_71 {

    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.println("rand5() = " + rand5());
        }

    }

    public static int rand5() {
        int randNumUpTo7 = rand7();
        if (randNumUpTo7 <= 5) {
            return randNumUpTo7;
        }

        return rand5();

    }

    public static int rand7() {
        Random random = new Random();

        return random.nextInt(7) + 1;

    }

}
