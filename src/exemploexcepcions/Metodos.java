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
public class Metodos {

     public void division(float num, float deno){
        System.out.println(num/deno);
    }
    
    public void dividirCapturaExcepcion(int enume, int deno){
        try{
            System.out.println("Resultado: "+enume/deno);
                System.out.println("Rematamos o programa");
        }catch(ArithmeticException e1){
            System.out.println("Erro: "+e1.getMessage());
        }
        finally{
            System.out.println("***executase sempre***");
        }
    }
    
    public void dividirCapturaVariasExcepcion(int enume, int deno){
        try{
            System.out.println("resultado: "+enume/deno);
                System.out.println("Rematamos o programa");
        }catch(ArithmeticException e2){
            System.out.println("Erro: "+e2.getMessage());
        }catch(Exception e3){
            System.out.println("Erro xeral: "+e3.toString());
        }
        finally{
            System.out.println("***executase sempre***");
        }
    }
    
    public void dividirLanzandoExcepcion(int enume, int deno) throws ArithmeticException{
        if(deno==0)
            throw new ArithmeticException ("non se pode dividir entre 0");
        System.out.println("resultado = "+enume/deno);
        System.out.println("remato programa");
    }
    
    public void dividirNosaExcepcion(int enume, int deno) throws NosaExcepcion{
        if(deno==0)
            throw new NosaExcepcion ("***non podes dividir entre 0***");
        System.out.println("resultado = "+enume/deno);
        System.out.println("remato programa");
    }
    
    public void dividirintervalo(int enume, int deno) throws Intervalo,NosaExcepcion{
        if(deno == 0)
            throw new NosaExcepcion("***Non podes dividir entre 0***");
        if(enume<8 || enume>20)
            throw new Intervalo ("***Non pode ser maior de 20 e menor de 8***");
        System.out.println("resultado = "+enume/deno);
        System.out.println("remato programa");
    }
}
