package com.whiteship.white_ship_study.week10.gitHubIssueTrackUsingThread;

import org.kohsuke.github.GHIssue;
import org.kohsuke.github.GHIssueComment;
import org.kohsuke.github.GHRepository;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class GitIssueTracker {
    private static final int ISSUE_NUMBER_TO_SEARCH = 15;

    private final UserSubmitMap userSubmitNumber = new UserSubmitMap();

    public void getCommentByEachIssue(GHRepository repository) throws IOException, InterruptedException {
        ExecutorService service = Executors.newFixedThreadPool(8);
        CountDownLatch latch = new CountDownLatch(15);

        for (int issueNumber = 1; issueNumber <= ISSUE_NUMBER_TO_SEARCH; issueNumber++) {
            int finalIssueNumber = issueNumber;
            service.execute(new Runnable() {
                @Override
                public void run() {
                    GHIssue ghIssue = null;
                    try {
                        ghIssue = repository.getIssue(finalIssueNumber);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    List<GHIssueComment> comments = null;
                    try {
                        comments = ghIssue.getComments();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    checkComment(comments);
                    latch.countDown();
                }
            });
        }

        latch.await();
        service.shutdown();
    }

    private synchronized void checkComment(List<GHIssueComment> comments) {
        for (GHIssueComment comment : comments) {
            String commenterName = comment.getUserName();
            userSubmitNumber.addSubmitNumber(commenterName);
        }
    }

    public void printTotalIssue() {
        System.out.println("==================과제 제출 현황==================");
        userSubmitNumber.printStatement();
    }
}
