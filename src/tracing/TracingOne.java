package tracing;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author MikeRD
 */
public class TracingOne {

    public static void main(String[] args) {
        String[] array = {"Alpha", "Bravo", "Charlie", "Delta", "Echo", "Foxtrot", "Golf", "Hotel", "India", "Juliet"};
        printSpecial(array);
    }

    public static void printSpecial(String[] words) {
        String first="";
        for (int i = 0; i < words.length; i++) {
            String second = "";
            if (i % 2 == 0) {
                first = words[i].toUpperCase();
            } else {
                for (int j = 0; j < i; j++) {
                    second += words[j].charAt(0);
                }
            }
        System.out.println(first + "..." + second);
        }
    }
}
