import javax.ejb.Stateless;

@Stateless
public class EjbSample {

    public int add(int x, int y) {
        return x + y;
    }
}
