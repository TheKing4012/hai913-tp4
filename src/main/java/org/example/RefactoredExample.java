package org.example;

public class RefactoredExample {

    public static int safeDivide(int numerator, int denominator) {
        if (denominator == 0) {
            System.err.println("Erreur : Division par zéro !");
            return 0; // Valeur par défaut pour éviter l'exception
        }
        return numerator / denominator;
    }

    public static void main(String[] args) {
        // Tests
        System.out.println("Résultat de 10 / 2 : " + safeDivide(10, 2)); // Résultat attendu : 5
        System.out.println("Résultat de 10 / 0 : " + safeDivide(10, 0)); // Résultat attendu : 0 (avec erreur)
    }
}
