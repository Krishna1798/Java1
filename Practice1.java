import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.BasicConfigurator;

public class Practice1  {

    private static final Logger logger = LogManager.getLogger(Practice1.class);

    public static void main(String[] args) {
        BasicConfigurator.configure();
        for(int i=0;i<=10;i++)
        {
            logger.info(i + " ");
        }
    }
}
