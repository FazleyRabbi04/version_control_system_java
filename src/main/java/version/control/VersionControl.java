package version.control;
import java.io.IOException;

public class VersionControl {

    private static final String REPOPATHS_LOCATION = "D:\\vcs\\repos.vcs";
    public static void main(String[] args)throws IOException {
        Service service = Service.createServiceInstance(REPOPATHS_LOCATION);
    }
}