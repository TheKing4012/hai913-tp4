package org.example;

/**
 * Exemple de "Programming by Exception".
 * Problème : Utilisation abusive des exceptions pour contrôler le flux du programme.
 * Objectif : Refactorer le code pour utiliser une gestion explicite des erreurs.
 */
public class ProgrammingByExceptionExample {

    public static int divide(int numerator, int denominator) {
        try {
            return numerator / denominator; // Lève une exception en cas de division par zéro
        } catch (ArithmeticException e) {
            // Gère un cas prévisible en capturant une exception
            System.err.println("Erreur : Division par zéro détectée.");
            return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println("Résultat : " + divide(10, 2)); // Cas normal
        System.out.println("Résultat : " + divide(10, 0)); // Cas problématique
    }
}
