package com.whiteship.white_ship_study.week6.DoubleDispatch;

import java.util.Arrays;
import java.util.List;

public class Double {
    interface Post { void postOn(SNS sns); }
    static class Text implements Post {
        public void postOn(SNS sns) {
            if (sns instanceof Facebook) {
                System.out.println("facebook - text");
            }
            if (sns instanceof Twitter) {
                System.out.println("twitter - text");
            }
        }
    }
    static class Picture implements Post {
        public void postOn(SNS sns) {
            if (sns instanceof Facebook) {
                System.out.println("facebook - picture");
            }
            if (sns instanceof Twitter) {
                System.out.println("twitter - picture");
            }
        }
    }

    interface SNS {}
    static class Facebook implements SNS {
    }
    static class Twitter implements SNS {
    }

    public static void main(String[] args) {
        List<Post> posts = Arrays.asList(new Text(), new Picture());
        List<SNS> sns = Arrays.asList(new Twitter(), new Facebook());

        posts.forEach(post -> sns.forEach(sn -> post.postOn(sn)));
    }
}
