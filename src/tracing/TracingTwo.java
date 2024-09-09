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
public class TracingTwo {
    public static void main(String[] args){
    System.out.println(mysteryCode(4169));
    }
    
    public static int mysteryCode(int n){
        
        int sum = 0;
        while (n > 0){
            int digit = n % 10;
            sum = sum + digit;
            n = n / 10;
        }
        return sum;
    }
}
