public class Item extends GameObject {
    // atributos
    private boolean visivel;

    
    // CONSTRUTORES
    public Item() {
        this.setX(0);
        this.setY(0);
        this.visivel = false;

    }

    public Item(int x, int y) {
        super(x, y);
    }

   
    // GETTER AND SETTER

    public boolean isVisivel() {
        return visivel;
    }

    public void setVisivel(boolean visivel) {
        this.visivel = visivel;
    }

    




}
