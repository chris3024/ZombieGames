import java.awt.*;

public class Player extends GameObject{
    public Player(float x, float y, ID id) {
        super(x, y, id);
    }

    @Override
    public void tick() {

    }

    @Override
    public void render(Graphics g) {
        g.setColor(Color.black);
        g.fillRect(x, y, 32, 32);

    }
}
