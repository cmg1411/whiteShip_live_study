package com.whiteship.white_ship_study.week10.gitHubIssueTrackUsingThread;

import org.kohsuke.github.GHRepository;
import org.kohsuke.github.GitHub;
import org.kohsuke.github.GitHubBuilder;

import java.io.IOException;

public class GitHubAPI {
    private static final String OAUTH_TOKEN = "2f9e9416dac614a6f41ab4723b9057100b429b48";
    private static final String REPOSITORY_NAME = "whiteship/live-study";

    private GHRepository repository;

    public GitHubAPI() {
        try {
            GitHub gitHubInstance = new GitHubBuilder().withOAuthToken(OAUTH_TOKEN).build();
            this.repository = gitHubInstance.getRepository(REPOSITORY_NAME);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public GHRepository getRepository() {
        return repository;
    }
}
