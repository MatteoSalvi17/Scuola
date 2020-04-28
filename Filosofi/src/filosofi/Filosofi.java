package filosofi;

public class Filosofi extends Thread{

    private final int filosofo;
    private Forchette ForchetteDisp;

    public Filosofi(int filosofo, Forchette forchetteDisponibili) {
        
        this.filosofo = filosofo;
        this.ForchetteDisp = forchetteDisponibili;
        
    }


    public int getFilosofo() {
        
        return this.filosofo;
        
    }
    
    public int left(){
        
        return this.filosofo;
        
    }
    
    public int right(){
        
        if( this.filosofo == (ForchetteDisp.getDIM() - 1) )
            return 0;
        else
            return (this.filosofo + 1);
        
    }
    
    
    @Override
    public void run(){
        
        try{
            while(true){
                if( this.ForchetteDisp.utilizzaForchetta(left(), right()) == true ){
                    Thread.sleep(3000);
                }
                else
                    Thread.sleep(500);
            }
        }catch( InterruptedException e ){}
    
    }
}