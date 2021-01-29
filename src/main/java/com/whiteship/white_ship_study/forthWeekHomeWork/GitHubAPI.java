package com.whiteship.white_ship_study.forthWeekHomeWork;

import org.kohsuke.github.*;

public class GitHubAPI {
    private static final String OAUTH_TOKEN = "0703e591a5e19da09fb269e4bdf9d5877ca374c9";
    private static final String REPOSITORY_NAME = "whiteship/live-study";

    private GHRepository repository;

    public GitHubAPI() {
        try {
            GitHub gitHubInstance = new GitHubBuilder().withOAuthToken(OAUTH_TOKEN).build();
            this.repository = gitHubInstance.getRepository(REPOSITORY_NAME);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public GHRepository getRepository() {
        return repository;
    }
}
