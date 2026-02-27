package data;

import init.Environment;
import support.JobHistory;

import java.sql.SQLException;
import java.util.Collection;

public class JobService {

    private JobService() {
    }

    public static JobHistory getJobHistory() {
        JobHistory jobHistory = new JobHistory();
        try {
            FileRepo fileRepo = FileRepo.getInstance();
            Collection<Job> completedJobs = fileRepo.getAllCompletedJobs();

            for (Job job : completedJobs) {
                jobHistory.addJob(job, true);
            }
        } catch (SQLException e) {
            Environment.getMessageBroker().msgInitError("Could not load Job history! SQLException! " + e.getMessage());
        }
        return jobHistory;
    }

    public static JobQueue getJobs() {
        JobQueue jobQueue = new JobQueue();
        try {
            FileRepo fileRepo = FileRepo.getInstance();
            Collection<Job> queuedJobs = fileRepo.getAllQueuedJobs();

            for (Job job : queuedJobs) {
                jobQueue.add(job);
            }
        } catch (SQLException e) {
            Environment.getMessageBroker().msgInitError("Could not load Jobs from database! SQLException! " + e.getMessage());
        }
        return jobQueue;
    }
}