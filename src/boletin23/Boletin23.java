package boletin23;

        import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author ifernandezblanco
 */
public class Boletin23 {

    
    public static void main(String[] args) {
        
        ArrayList<Persoa> cola= new ArrayList();
        generarCola(cola);
        double recaudacion;
        double recaudacionTotal=0;
        Persoa espectadorCola;
        int edadPersoa = 0;
        
        
        
        //Recorremos la cola con iterador
        Iterator<Persoa> it=cola.iterator();
        while(it.hasNext()){
             
            espectadorCola=it.next();
            edadPersoa=espectadorCola.getIdade();
            
            if(edadPersoa>=5 && edadPersoa<=10){ 
                recaudacion=1; 
            }else if(edadPersoa>=11 && edadPersoa<=17){
                recaudacion=2.5;
            }else{
                recaudacion=3.5;
            }
            recaudacionTotal+=recaudacion;
             
            System.out.println("Una persona de " + edadPersoa + " años pagará: " + recaudacion + "€");    
        }
        System.out.println("\nLa recaudación total es de: " + recaudacionTotal +"€");
         
    }
    
    // Debido a que los numeros se generan automaticamente con math.random no hay riesgo de que salgamos de rango, y por lo tanto no se ejecutara la excepcion
    public static void generarCola(ArrayList<Persoa> cola){
             
        int numeroPersonas=xeraNumeroAleatorio(1,50);
         
        for(int i=0;i<numeroPersonas;i++){
            cola.add(new Persoa(xeraNumeroAleatorio(5, 60)));
        } 
    }
     
   
    public static int xeraNumeroAleatorio(int min, int max){
         
        int num=(int)Math.floor(Math.random()*(min-(max+1))+(max+1));
        return num;
    
   
    } 
    }


    

