
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;


public class Ghost extends GameObject{

    // ATRIBUTOS
    private int direction;

    // Construtores
    public Ghost() {

    }


    public Ghost(int x, int y, int direction) {
        super(x, y);
        if(x>=0 && y >=0 && direction >0){
        this.direction=direction;
        }else{
            System.out.println("Valor inválido, valor precisa ser positivo");
        }
        

               
    }

    // metodos

    public boolean verifica(){
        
        int x = getX();
        int y = getY();
        int d = getDirection();
        int t = getScreenSize();
        
        if (x + 10 < t && d == 90) {
            return true;
        } 
        if (x - 10 > 0 && d == 270) {
            return true;
        } 
        if (y + 10 > 0 && d == 0) {
            return true;
        } 
        if (y - 10 < t && d == 180) {
            return true;
        }
        
        return false;
        
        }
    
    
        public boolean podeMover() {
            if (getDirection() == 0) {
                if (getX() > 0) {
                    return true;
                } else {
                    setDirection(2);
                    return false;
                }
            } else if (getDirection() == 1) {
                if (getY() > 0) {
                    return true;
                } else {
                    setDirection(3);
                    return false;
                }
            } else if (getDirection() == 2) {
                if (getX() < getScreenSize()) {
                    return true;
                } else {
                    setDirection(0);
                    return false;
                }
            } else if (getDirection() == 3) {
                if (getY() < getScreenSize()) {
                    return true;
                } else {
                    setDirection(1);
                    return false;
                }
            } else
                return false;
        }
    
        public void mover() {
            Timer tempo = new Timer();
            TimerTask mudarDirection = new TimerTask() {
                @Override
                public void run() {
                    Random random = new Random();
                    setDirection(random.nextInt(4));
                };
            };
            tempo.schedule(mudarDirection, 3000);
            if (podeMover()) {
                if (getDirection() == 0) {
                    setX(getX() - 10);
                }
                if (getDirection() == 1) {
                    setY(getY() - 10);
                }
                if (getDirection() == 2) {
                    setX(getX() + 10);
                }
                if (getDirection() == 3) {
                    setY(getY() + 10);
                }
            }
        };


        // getter and setter
        public int getDirection() {
            return direction;
        }
    
        public void setDirection(int direction) {
            this.direction = direction;
        }
    
    }    