public class Professeur extends Personne{


private String grade;
private classe classeProf;

    public Professeur(){

    }
    public Professeur(String prenom,String nom,String grade){

        super(prenom,nom)
        this.grade=grade;

    }

    public String getGrade(){
    
        return grade;
    }
    
    public void setGrade(String grade){
    
        this.grade=grade;
    }
    @Override
    public String affiche(){
    return super.affiche() +"Grade: "+tuteur;
    }
}






