abstract public class Personne implements IInscription{

protected int id;
protected String prenom;
protected String nom;

    public Personne(){
        
    }
    public Personne(){
        this.nom=nom;
        this.prenom=prenom;
    }
    public String getId(){
    
        return id;
    }
    public String getPrenom(){
    
        return prenom;
    }
    public String getNom(){
    
        return nom;
    }
    public void setId(int id){
    
        this.id=id;
    }
    public void setPrenom(String prenom){
    
        this.prenom=penom;
    }
    public void setNom(String nom){
    
        this.nom=nom;
    }
     @Override
        public String affiche(){
            return "ID: "+id+"Prenom: "+prenom+"Nom: "+nom ;
                
            }



}

