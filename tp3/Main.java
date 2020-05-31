import java.util.Scanner;
public class Main {
     
         public static void  main(String args[]){
               Carre carre=null;
               int choix;
		Scanner clavier=new Scanner(System.in); 
		Rectangle rectangle=null;
		int nbrCar=0;
		int nbrRec=0;
		System.out.println("Donner le nombre de carre que vous voulez inserer");
		nbrCar=clavier.nextInt();
		System.out.println("Donner le nombre de rectangle que vous voulez inserer");
		nbrRec=clavier.nextInt();
		double longueur;
		double[] carTab;
		double[][] recTab;
		carTab=new double[nbrCar];
		recTab=new double[nbrRec][nbrRec]; 
		
    do{
                    
                        System.out.println("1-Ajout d'un Carre");
                        System.out.println("2-Afficher les Carres");
                        System.out.println("3-Ajout d'un Rectangle");
                        System.out.println("4-Afficher les Rectangles");
                        System.out.println("5-Quitter");
                        System.out.println("Faites votre choix");
                       choix =clavier.nextInt();
                switch(choix){
                case 1:
			   for(int i=0;i<carTab.length;i++){
                           System.out.println("Entrer la longueur");
                             longueur=clavier.nextDouble();
			     carTab[i]=longueur;
                            carre=new Carre(longueur);
			    
				}
			    
                  break;
                  case 2:
			 for(double val : carTab){
			  carre.setLongueur(val);
                          if(carre!=null){
                            System.out.println("La longueur est " + carre.getLongueur());
                             System.out.println("Le Demi perimetre est " + carre.demiPerimetre());
 			     System.out.println("Le Perimetre est " + carre.perimetre());
                             System.out.println("La Surface est " + carre.surface());
                            System.out.println("La Diagonale est " + carre.diagonale()); 
                           }else{
                             System.out.println("Veuillez la longueur du carre");
                           }
			System.out.println("************************************");
			}
                         break;
                  case 3:
			   for(int j=0;j<recTab.length;j++){
    			   System.out.println("Entrer la longueur");
                             longueur=clavier.nextDouble();
			   System.out.println("Entrer la largeur");
                             double largeur=clavier.nextDouble();
			     recTab[j][0]=longueur;
			     recTab[j][1]=largeur;
                           rectangle=new Rectangle(longueur,largeur);
				}
                   break;
                  case 4:
			   for(int k=0;k<recTab.length;k++){
				
			  	rectangle.setLongueur(recTab[k][0]);
				rectangle.setLargeur(recTab[k][1]);
			  if(rectangle!=null){
                            System.out.println("La longueur est " + rectangle.getLongueur());
			    System.out.println("La largeur est " + rectangle.getLargeur());
                             System.out.println("Le Demi perimetre est " + rectangle.demiPerimetre());
 			     System.out.println("Le Perimetre est " + rectangle.perimetre());
                             System.out.println("La Surface est " + rectangle.surface());
                            System.out.println("La Diagonale est " + rectangle.diagonale()); 
                           }else{
                             System.out.println("Veuillez la longueur du carre");
                           }
			   System.out.println("************************************");
			
			}
    
                   break;

                   case 5:
                   break;
                  default:
                    System.out.println("Choix invalide");

               }

}while(choix!=5);




           
          }
}