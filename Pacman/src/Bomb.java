public class Bomb extends Item {
    // ATTRIBUTOS
    private int removeLife;

   

    // CONSTRUTORES
    public Bomb(int x, int y) {
        super(x, y);
    }

    public Bomb() {
    }

    // get and Set
    public int getRemoveLife() {
        return removeLife;
    }

    public void setRemoveLife(int removeLife) {
        this.removeLife = removeLife;
    }

}
