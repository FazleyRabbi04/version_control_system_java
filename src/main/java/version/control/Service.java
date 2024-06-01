package version.control;

import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;
import java.util.Timer;

public class Service{
    private final Map<Path,WatchDir> repositories;
    private final Timer timer; 
    private final String repoPathsFilePath;

    private Service(String repoPathsFilePath){
       this.timer = new Timer();
       this.repositories = new HashMap<>();
       this.repoPathsFilePath = repoPathsFilePath;
    }
   
    public static Service createServiceInstance(String repoPathsFilePath){
        Service service = new Service(repoPathsFilePath);
        WatcherGenerator watcherGenerator = new WatcherGenerator(service.getRepositories(), service.getRepoPathsFilePath());
        service.getTimer().schedule(watcherGenerator, 0,2000);
        
        return service;
    }

    public Map<Path, WatchDir> getRepositories() {
        return repositories;
    }

    public Timer getTimer() {
        return timer;
    }

    public String getRepoPathsFilePath() {
        return repoPathsFilePath;
    }
}
