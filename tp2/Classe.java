    public class Classe implements IInscription{
        //Proprietes Classe
            //Genere automatiquement
            private int id;
            private String libelle;
            
            //Constructeur
                //Par default
            public Classe(){
                
            }
            public Classe(String libelle){
                this.libelle=libelle;
            }
            public String getLibelle(){
                return this.libelle;
            }
            public void setLibelle(String libelle){
                this.libelle=libelle;
            }
            public int getId(){
                return this.id;
            }
            public void setId(int id){
                this.id=id;
            }
            
            @Override
            public String affiche(){
                
                
            }
    }