package data;

import java.io.File;
import java.nio.file.Paths;
import java.util.Objects;

public class Job {
    private final String sourceLink;
    private final String localDirectory;
    private final String filename;
    private final String downloadLink;

    public Job(String sourceLink, String localDirectory, String filename, String downloadLink) {
        this.sourceLink = sourceLink;
        this.downloadLink = downloadLink;
        this.localDirectory = localDirectory;
        this.filename = filename;
    }

    public boolean sourceLinkEquals(Job job) {
        return job.getSourceLink().equals(sourceLink);
    }

    public boolean sourceLinkEquals(String link) {
        return this.sourceLink.equals(link);
    }

    public String getSourceLink() {
        return sourceLink;
    }

    public String getDownloadLink() {
        if (downloadLink != null) {
            return downloadLink;
        }
        if (sourceLink != null) {
            return sourceLink;
        }
        throw new IllegalStateException("Both link and downloadLink are null");
    }

    public String getLocalDirectory() {
        return localDirectory;
    }

    public String getFilename() {
        return filename;
    }

    public File getLocalFile() {
        return Paths.get(localDirectory).resolve(filename).toFile();
    }

    public boolean localFileExists() {
        return getLocalFile().exists();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Job job) {
            return Objects.equals(job.getSourceLink(), sourceLink) &&
                    Objects.equals(job.getLocalDirectory(), localDirectory) &&
                    Objects.equals(job.getFilename(), filename);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(sourceLink, localDirectory, filename);
    }

    @Override
    public String toString() {
        // This method returns only the filename, else the hashCodes will appear in the ListView
        return filename;
    }
}
