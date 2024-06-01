package vcs;


public class Constants {

    public static final String REGISTER_LOCATION = "D:\\vcs\\repos.vcs";
    public static final String VCS_FOLDER = ".vcs";
    public static final String VCS_OBJECTS = VCS_FOLDER + "\\objects";
    public static final String RELATIVE_INDEXFILE_PATH = ".vcs/tracked.vcs";
    public static final String VCS_COMMIT = VCS_FOLDER + "\\commits";
    public static final String CONFIG_FILE = VCS_FOLDER + "\\config.vcs";
    public static final String GLOBAL_USER_CONFIG = "D:\\vcs\\user.vcs";
    public static final String BRANCHES_DIR = VCS_FOLDER + "\\refs";
    public static final String MASTER_BRANCH = BRANCHES_DIR + "\\master";
    
    
    public static final int PREVIOUS_COMMIT_HASH_LINE = 6;
    public static final int BRANCH_LINE_IN_CONFIG = 0;
    public static final int INDEX_HASH_IN_COMMIT = 0;
    public static final int BLOB_FIELDS = 3;
    
}
