package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

public class ImportantTweet extends Tweet {

    public ImportantTweet(String text, Date date) throws TweetTooLongException {
        super(text,date);
    }

    public ImportantTweet(String text) throws TweetTooLongException {
        super(text);
    }

    public Boolean isImportant() {
        return Boolean.TRUE;
    }
}
