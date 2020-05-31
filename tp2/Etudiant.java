public class Etudiant extends Personne{

private String tuteur;
private classe classeEtu;

 public Etudiant(String prenom,String nom,String tuteur){

    super(prenom,nom)
    this.tuteur=tuteur;

 }
 public Etudiant(){
}

public String getTuteur(){

return tuteur;
}

public String setTuteur(String tuteur){
this.tuteur=tuteur;
}
@Override
public String affiche(){
    return super.affiche() +"Tuteur: "+tuteur;
}

    

}

