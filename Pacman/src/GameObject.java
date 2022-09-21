public class GameObject {

    // ATRIBUTOS
    private int x;
    private int y;
    private int screenSize;



    // CONSTRUTORES

    public GameObject() {
    }


    public GameObject(int x, int y) {
        this.x = x;
        this.y = y;
    }

    


    public GameObject(int x, int y, int screenSize) {
        this.x = x;
        this.y = y;
        this.screenSize = screenSize;
    }

    // GETTER AND SETTER


    public int getX() {
        return x;
    }   

    public void setX(int x) {
       if (x >=0){
        this.x = x;
       }else{
        System.out.println("Valor inválido, somente valores positivos");
       }
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        if (y >=0){
        this.y = y;
        } else{
            System.out.println("Valor inválido, somente valoresvpositivos ");
        }
    }

    public int getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(int screenSize) {
        if( screenSize >=0){
        this.screenSize = screenSize;
        }else{
            System.out.println("valor inválido, somente valores positivos");
        }
    }


    



    
}