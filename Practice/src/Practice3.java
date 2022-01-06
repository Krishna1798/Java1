import java.util.logging.Logger;
import ch.qos.logback;
import org.apache.log4j;

public class Practice3 {
    static Logger log = Logger.getLogger(Practice3.class.getName());
    private static final Logger logger = LoggerFactory.getLogger(TopLevelClass.class);

    public static void main(String[] args) {

        for(int i=0;i<=10;i++) log.debug(i + " ");
    }
}
