package morpion;

import java.util.Scanner;

class Principal {

    public static void main(String[] args) {

        System.out.println("Bienvenue dans le Jeu dy Morpion");

        Scanner entier1 = new Scanner(System.in);
        System.out.println("Entrez un entier entre 3 et 5");
        int entier = entier1.nextInt();

        if (entier < 3 || entier > 5) {
            System.out.println("Taille non valide, veuillez entrer un nombre entre 3 et 5!");
            main(args);
        } else {


            int[][] tableau = new int[entier + 2][entier + 2];

            mesMethodes.afficheMonTableau(tableau);


            Scanner PremierJoueur1 = new Scanner(System.in);
            System.out.println("Quel joueur veut commencer ? 1 ou 2 ?");
            int premierJoueur = PremierJoueur1.nextInt();
            System.out.println("Le premier joueur est le numéro " + premierJoueur);

            if (premierJoueur != 1 && premierJoueur!=2 ) {
                Principal.main(args);
            }

            int continuer=0;
            while (continuer==0) {

                if (premierJoueur==1) {

                    Scanner lignejoueur1 = new Scanner(System.in);
                    System.out.println("Dans quelle ligne le joueur 1 veut-il jouer ?");
                    int ligne1 = lignejoueur1.nextInt();

                    Scanner colonejoueur1 = new Scanner(System.in);
                    System.out.println("Dans quelle colone le joueur 1 veut-il jouer ?");
                    int colone1 = colonejoueur1.nextInt();

                    if (tableau[ligne1][colone1] == 0) {
                        tableau[ligne1][colone1] = 1;
                        premierJoueur = 2;
                        mesMethodes.afficheMonTableau(tableau);
                        System.out.println(" ");

                    } else {
                        System.out.println(" Rejouer ");
                        premierJoueur = 1;
                        mesMethodes.afficheMonTableau(tableau);
                    }

                }

                if (premierJoueur==2) {

                    Scanner lignejoueur2 = new Scanner(System.in);
                    System.out.println("Dans quelle ligne le joueur 2 veut-il jouer ?");
                    int ligne2 = lignejoueur2.nextInt();

                    Scanner colonejoueur2 = new Scanner(System.in);
                    System.out.println("Dans quelle colone le joueur 2 veut-il jouer ?");
                    int colone2 = colonejoueur2.nextInt();

                    if (tableau[ligne2][colone2] == 0) {
                        tableau[ligne2][colone2] = 2;
                        premierJoueur = 2;
                        mesMethodes.afficheMonTableau(tableau);
                        System.out.println(" ");

                    } else {
                        System.out.println(" Rejouer ");
                        premierJoueur = 2;
                        mesMethodes.afficheMonTableau(tableau);
                    }

                }





            }

        }
    }
    public static class mesMethodes {

        public static void afficheMonTableau(int[][] tableau) {

            for (int i = 0; i < tableau.length ; i++) {
                System.out.println(" ");
                for (int j = 0; j < tableau.length; j++) {

                    tableau[0][j]=99;
                    tableau[i][0]=99;
                    tableau[tableau.length-1][j]=99;
                    tableau[i][tableau.length-1]=99;


                    if (tableau[i][j]==1) {
                        System.out.print(("X"));
                    }

                    if (tableau[i][j]==2) {
                        System.out.print(("O"));
                    }

                    if (tableau[i][j]==99) {
                        System.out.print(("#"));
                    }

                    if (tableau[i][j]==0) {
                        System.out.print((" "));
                    }
                }
            }
        }
    }
}