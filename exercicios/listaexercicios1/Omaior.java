// O MAIOR
// Crie um programa que exiba qual é o maior entre 3 números inteiros

package com.example;

public class Omaior 
{

    public static void main(String[] args) 
    {
        Integer n1, n2, n3;

        n1 = 10;
        n2 = 7;
        n3 = 5;

        if(n1 > n2 && n1 > n3){
            System.out.println("O número "+ n1 +" é o maior");
        }else if(n2 > n1 && n2 > n3){
            System.out.println("O número "+ n2 +" é o maior");
        }else{
            System.out.println("O número "+ n3 +" é o maior");
        }  
    }
}

