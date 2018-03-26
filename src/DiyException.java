/**
 * @author
 * Created by 平凡的世界 on 2018/3/26.
 */
public class DiyException  extends RuntimeException{
    public DiyException(String message) {
        super(message);
    }

    public DiyException(String message, Throwable cause) {
        super(message, cause);
    }
}
