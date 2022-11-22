package decouverte;

import java.lang.Math;
import java.util.Scanner;

public class Decouverte {
    public static void main(String[] args) {
        /* Exo 1
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Rentrez un mot svp");
        String mot=scan1.next();
        System.out.println(mot);
        */
        
        /* Exo 2
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Veuillez rentrer la valeur de a");
        int a=scan1.nextInt();
        Scanner scan2 = new Scanner(System.in);
        System.out.println("Veuillez rentrer la valeur de b");
        int b=scan2.nextInt();
        int c;
        c=a;
        a=b;
        b=c;
        System.out.println("a="+a+" b="+b);
        */
        
        /* Exo 3
        int y=2;
        int x=y+1;
        System.out.println(x);
        System.out.println("x="+x);
        System.out.println("x="+y+"+1="+x);
        */
        
        /* Exo 4.1
        int a=1;
        String b="b";
        double c=1.5;
        System.out.println(((Object)a).getClass().getSimpleName());
        System.out.println(b.getClass().getSimpleName());
        System.out.println(((Object)c).getClass().getSimpleName());
        */
        
        /* Exo 4.2
        String a,b,c;
        a=b=c="test";
        int x,y,z;
        x=y=z=1;
        System.out.println(a+x+b+y+c+z);
        */
        
        /* Exo 5
        int nbr=10;
        String chaine="eleves";
        chaine =Integer.toString(nbr)+' '+chaine;
        System.out.println(chaine);
        */
        
        /* Exo 6
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Entrez la longueur");
        int longueur = scan1.nextInt();
        Scanner scan2 = new Scanner(System.in);
        System.out.println("Entrez la largeur");
        int largeur = scan2.nextInt();
        System.out.println("L'aire est de "+(largeur*longueur)+"cm");
        */
        
        /* Exo 7
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Entrez le premier cote adjacent:");
        int cote1 = scan1.nextInt();
        Scanner scan2 = new Scanner(System.in);
        System.out.println("Entrez la deuxième cote adjacent:");
        int cote2 = scan2.nextInt();
        System.out.println("L'hypotenuse est de "+((int)Math.sqrt(Math.pow(cote1,2)+Math.pow(cote2,2)))+"cm");
        */
        
        /* Exo 8
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Entrez le rayon:");
        int rayon = scan1.nextInt();
        Scanner scan2 = new Scanner(System.in);
        System.out.println("Entrez la hauteur:");
        int hauteur = scan2.nextInt();
        System.out.println("Le volume est de "+(int)((Math.PI*Math.pow(rayon,2)*hauteur)/3)+"cm");
        */
        
        /* Exo 9
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Entrez le Rayon interieur");
        int Rint = scan1.nextInt();
        Scanner scan2 = new Scanner(System.in);
        System.out.println("Entrez le rayon exterieur");
        int Rext = scan2.nextInt();
        System.out.println("La surface decoupe est de "+(int)((Math.PI*Math.pow(Rext,2))-(Math.pow(Rint,2)*Math.PI))+"cm");
        */
    }
    
}
