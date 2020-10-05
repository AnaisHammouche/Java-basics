package com.company;

public class Main {

    public static void main(String[] args) {
        //j'appelle la fonction new int avec comme paramètre 7
        //je la stock dans la valeur "scores"
        int[] scores = new int [7];
            // je stock un score dans chaques valeur de nom "scores"
            scores [0] = 2;
            scores [1] = 4;
            scores [2] = 6;
            scores [3] = 8;
            scores [4] = 10;
            scores [5] = 12;
            scores [6] = 14;
            // je déclare la boucle pour (int i = 0; si i < à la longueur du score; alors à chaques tours on ajoute i+1)
            for (int i = 0; i < scores.length; i++) {
            // j'imprime ("score =" de manière manuscrite + la valeur du score paramétré précédemment)
            System.out.println("score = " + scores[i]);
        }   // la valeur total de type int = 0
            int total = 0;
            // je déclare la boucle pour (int i = 0; si i < à la longueur du score; alors à chaques boucles on ajoute +1 à valeur int de base)
        for (int i = 0; i < scores.length; i++) {
            //je calcule la moyenne : total = total + score[sa valeur équivalente paramétrée]
            total = total + scores[i];
        }
                // j'imprime "moyenne =" + total divisé par les 7 valeurs
                System.out.println("moyenne = " + total/7);
    }
}
