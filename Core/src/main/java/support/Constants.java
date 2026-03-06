package support;

import init.Environment;
import utils.Utility;

import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;

public class Constants {
    public static final String APPLICATION_NAME = "Drifty";
    public static final String VERSION_NUMBER = "v2.1.0";
    public static final String DRIFTY_WEBSITE_URL = "https://drifty.vercel.app/";
    public static final String INVALID_LINK = "Link is invalid! Please check the link and try again.";
    public static final String FILENAME_DETECTION_ERROR = "Failed to detect the filename! A default name will be used instead.";
    public static final String TRYING_TO_AUTO_DETECT_DOWNLOADS_FOLDER = "Trying to automatically detect default Downloads folder...";
    public static final String FAILED_TO_RETRIEVE_DEFAULT_DOWNLOAD_FOLDER_ERROR = "Failed to retrieve default download folder!";
    public static final String FOLDER_DETECTED = "Default download folder detected : ";
    public static final String FILENAME_DETECTED = "Filename detected : ";
    public static final String FAILED_TO_CREATE_LOG_ERROR = "Failed to create log : ";
    public static final String FAILED_TO_CLEAR_LOG_ERROR = "Failed to clear Log contents !";
    public static final String FILE_NOT_FOUND_ERROR = "An error occurred! Requested file does not exist, please check the url.";
    public static final String VIDEO_UNAVAILABLE_ERROR = "The requested video is unavailable, it has been deleted from the platform.";
    public static final String PERMISSION_DENIED_ERROR = "You do not have access to download the video, permission is denied.";
    public static final String DRIFTY_COMPONENT_NOT_EXECUTABLE_ERROR = "A Drifty component (yt-dlp) is not marked as executable.";
    public static final String USER_AGENT = "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/122.0.0.0 Safari/537.36 Edg/122.0.0.0";
    public static final long ONE_DAY = 86400000; // Value of one day (24 Hours) in milliseconds
    public static URL updateURL;

    static {
        try {
            updateURL = Utility.getUpdateURL();
        } catch (MalformedURLException | URISyntaxException e) {
            Environment.getMessageBroker().msgUpdateError("Drifty update URL is invalid! " + e.getMessage());
            updateURL = null;
        }
    }

    /*
    Denoting a Constant with _F indicates that it needs to be used with String.format(), where %s is replaced with the
    string provided in String.format():
        String.format(CONSTANT_F, "String replacing %s")
     */
    public static final String DOWNLOADING_F = "Downloading \"%s\" ...";
    public static final String FAILED_CONNECTION_F = "Failed to connect to %s!";
    public static final String SUCCESSFULLY_DOWNLOADED_F = "Successfully downloaded \"%s\"";
    public static final String FAILED_TO_DOWNLOAD_F = "Failed to download %s!";


    /** for CLI ***************************************************/
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String CLI_APPLICATION_STARTED = "Drifty CLI (Command Line Interface) Application Started !";
    public static final String CLI_APPLICATION_TERMINATED = "Drifty CLI (Command Line Interface) Application Terminated!";
    public static final String ADD_FLAG = "--add";
    public static final String REMOVE_FLAG = "--remove";
    public static final String LIST_FLAG = "--list";
    public static final String GET_FLAG = "--get";
    public static final String HELP_FLAG = "--help";
    public static final String NAME_FLAG = "--name";
    public static final String VERSION_FLAG = "--version";
    public static final String UPDATE_FLAG = "--update";
    public static final String EARLY_ACCESS_FLAG = "--early-access";
    public static final String LOCATION_FLAG = "--location";
    public static final String BATCH_FLAG = "--batch";
    public static final String HELP_FLAG_SHORT = "-h";
    public static final String NAME_FLAG_SHORT = "-n";
    public static final String VERSION_FLAG_SHORT = "-v";
    public static final String UPDATE_FLAG_SHORT = "-u";
    public static final String EARLY_ACCESS_FLAG_SHORT = "-ea";
    public static final String LOCATION_FLAG_SHORT = "-l";
    public static final String BATCH_FLAG_SHORT = "-b";
    public static final String REMOVE_ALL_URL_CONFIRMATION = "Are you sure you wish to delete ALL links? (Y/N): ";
    public static final String ENTER_FILE_NAME_WITH_EXTENSION = "Please enter the filename with file extension (filename.extension) : ";
    public static final String ENTER_FILE_LINK = "Enter the link to the file (in the form of https://www.example.com/filename.extension) or a YouTube/Instagram Video link : ";
    public static final String QUIT_OR_CONTINUE = "Enter Q to Quit Or any other key to Continue";

    public static final String BANNER_BORDER = "====================================================================";
    public static final String FAILED_TO_DOWNLOAD_CONTENTS = "Failed to download the contents ! ";
    public static final String FAILED_READING_STREAM = "Failed to get I/O operations channel to read from the data stream !";
    public static final String OF_SIZE = " of size ";
    public static final String DOWNLOAD_FAILED = "Download failed!";
    public static final String ENTER_Y_OR_N = "Please enter Y for yes and N for no!";

}
