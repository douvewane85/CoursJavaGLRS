import java.util.Scanner;

public class Main {


public static void main(String[] args) {
String choix;
     Scanner clavier=new Scanner(System.in);
     Service service =new Service();
    do {

        System.out.println("1-Creer Classe");
        System.out.println("2-Afficher Classe ");
        System.out.println("3-Quitter");
        System.out.println("Faites votre choix");
        choix=clavier.nextLine();
        switch(choix){
            case "1":
            System.out.println("Entrer le libelle de la Classe");
               String libelle =clavier.nextLine();
               Classe cl=new Classe(libelle);
               service.creerClasse(cl);
            break;

            case "2":

            service.listerClasse();
            break;

        }
        
    } while (choix!="3");

        
}
    
}