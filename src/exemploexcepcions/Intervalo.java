package exemploexcepcions;

public class Intervalo extends Exception{
    
    public Intervalo(){
        super();
    }
    public Intervalo(String mensaxe){
        super(mensaxe);
    }
}
