package filosofi;

import java.util.Arrays;

public class Forchette {
    
    private int[] forchette;
    private final int DIM = 10; 

    public Forchette() {
        
        forchette = new int[DIM];
        for (int i = 0; i < DIM; i++ ){
            forchette[i] = 0;
        }
        
    }

    public synchronized boolean utilizzaForchetta( int sinistra, int destra) throws InterruptedException {
        
        if( (forchette[sinistra] == 0) && (forchette[destra] == 0) ){
            forchette[sinistra] = sinistra;
            forchette[destra] = destra;
            System.out.println( "Filosofo mangia..." );
            output();
            this.wait(3000);
            forchette[sinistra] = sinistra;
            forchette[destra] = destra;
            System.out.println( "Filosofo pensa..." );
            return true;
        }
        else
            return false;
    }

    public void output() {
       System.out.println(Arrays.toString(forchette));
    }

    public int getDIM() {
        return DIM;
    }
    
    
}
