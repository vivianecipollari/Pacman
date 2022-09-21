import java.util.Timer;
import java.util.TimerTask;

public class Booster extends Item{

    // ATTRIBUTES
    int duracao;

    
    // CONSTRUCTORS
    public Booster() {
        
    }

    public Booster(int x, int y) {
        super(x, y);
    }

    
    public Booster(int x, int y, int duracao) {
        
        setX(x);
        setY(y);
        setDuracao(duracao);
        
    }

    public void godMode(Player player){
        Timer rounds = new Timer();

        player.setInvencivel(true);
        System.out.println("Entering god mode.");
        TimerTask timed = new TimerTask() {
            @Override
            public void run() {
                player.setInvencivel(false);
                System.out.println("No longer invincible.");
            }
        };
        rounds.schedule(timed, duracao);
    }

    

    // getter and Setter
    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }


    


}
