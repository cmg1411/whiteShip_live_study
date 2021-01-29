package com.whiteship.white_ship_study.forthWeekHomeWork;

import org.kohsuke.github.GHRepository;

import java.io.IOException;

public class application {
    public static void main(String[] args) throws IOException {
        GitHubAPI gitHubAPI = new GitHubAPI();
        GitIssueTracker gitIssueTracker = new GitIssueTracker();
        GHRepository repository = gitHubAPI.getRepository();

        gitIssueTracker.getCommentByEachIssue(repository);
        gitIssueTracker.printTotalIssue();
    }
}
