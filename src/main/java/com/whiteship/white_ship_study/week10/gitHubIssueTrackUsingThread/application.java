package com.whiteship.white_ship_study.week10.gitHubIssueTrackUsingThread;

import org.kohsuke.github.GHRepository;

import java.io.IOException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class application {
    public static void main(String[] args) throws IOException, InterruptedException {
        GitHubAPI gitHubAPI = new GitHubAPI();
        GitIssueTracker gitIssueTracker = new GitIssueTracker();
        GHRepository repository = gitHubAPI.getRepository();

        gitIssueTracker.getCommentByEachIssue(repository);
        gitIssueTracker.printTotalIssue();
    }
}
