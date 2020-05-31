import java.util.Scanner;

public class Main{
         public static void main(String [ ] args){
        int choix;
        Scanner clavier=new Scanner(System.in);
            Service s=new Service();
            Classe c= new Classe();
            int id;
            String libelle; 
            Professeur p=new Professeur();


       do{
                    
                         System.out.println("1-Ajouter classe");
                         System.out.println("2-lister classe");
                        System.out.println("3-affecter professeur a une classe");
                         System.out.println("4-lister professeur");
                         System.out.println("5-lister etudiant par classe ");
                        System.out.println("6-inscrire etudiant  ");
                        System.out.println("7-Quitter");
                         System.out.println("Faites votre choix");
                        choix=clavier.nextInt();
           

                        switch(choix){
                            case 1:
                            system.out.println("veuiller saisir l'ID de la classe");
                            id=clavier.nextInt();
                            c.setId(int id);                           
                            system.out.println("veuiller saisir le libelle de la classe");
                            libelle=clavier.next();
                            c.setLibelle(String libelle);
                            s.ajouterClasse(c);
                            
                            break;
                              
                              case 2:
                                s.listerClasse(c);

                             System.out.println("=====================================");
                        
                                     break;
                              case 3:
                          
                               break;
                              case 4:
                           s.listerProf();
                                       
                           System.out.println("=====================================");
                        
                        
                
                               break;
            
                               case 5:
                               s.listerEtudiant();
                               break;
                                default:
                                System.out.println("Choix invalide");
                        } 
          }
    while{

    }
}
}