package com.whiteship.white_ship_study.forthWeekHomeWork;

import org.kohsuke.github.GHIssue;
import org.kohsuke.github.GHIssueComment;
import org.kohsuke.github.GHRepository;

import java.io.IOException;
import java.util.List;

public class GitIssueTracker {
    private static final int ISSUE_NUMBER_TO_SEARCH = 5;

    private final UserSubmitMap userSubmitNumber = new UserSubmitMap();

    public void getCommentByEachIssue(GHRepository repository) throws IOException {
        for (int issueNumber = 1; issueNumber <= ISSUE_NUMBER_TO_SEARCH; issueNumber++) {
            GHIssue ghIssue = repository.getIssue(issueNumber);
            List<GHIssueComment> comments = ghIssue.getComments();
            checkComment(comments);
        }
    }

    private void checkComment(List<GHIssueComment> comments) {
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
