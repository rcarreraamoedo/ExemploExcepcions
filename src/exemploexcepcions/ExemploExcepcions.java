/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploexcepcions;

/**
 *
 * @author rcarreraamoedo
 */
public class ExemploExcepcions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Metodos obx = new Metodos();
        /*obx.dividirCapturaExcepcion(6, 0);
        obx.dividirCapturaVariasExcepcion(7, 2);*/
        
        //Primer método de LanzandoExcepcion coa ArtithmeticExcepcion
        /*try{
        obx.dividirLanzandoExcepcion(6, 0);
        }catch(ArithmeticException e4){
            System.out.println("error: "+e4.toString());
        }
        System.out.println("O programa sigue");
        
        //Segundo método coa NosaExcepcion, ofrecer unha mensaxe nunha nova clase
        try{
            obx.dividirNosaExcepcion(6, 0);
        }catch(NosaExcepcion e5){
            System.out.println("error: "+e5.toString());
        }
        System.out.println("O programa sigue");*/
        
        //Tercer método co Intervalo entre un rango de valores
        try{
            obx.dividirintervalo(2, 0);
        }catch(NosaExcepcion e6){
            System.out.println("error: "+e6.toString());
        }catch(Intervalo ex){
            System.out.println(ex.getMessage());
        }
        System.out.println("O programa sigue");
       
    }  
    
}
