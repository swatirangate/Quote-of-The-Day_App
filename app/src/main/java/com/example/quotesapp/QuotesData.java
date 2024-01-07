package com.example.quotesapp;

import java.util.ArrayList;
import java.util.List;

public class QuotesData {
    public static List<QuotesList> getLifeQuotes(){
        final List<QuotesList> lifeQuotesList = new ArrayList<>();

        QuotesList lifeQuote1 = new QuotesList("Life is a mountain. Your goal is to find your path, not to reach the top.","Maxime Lagace");
        lifeQuotesList.add(lifeQuote1);

        QuotesList lifeQuote2 = new QuotesList("Three things in life - Your health, your mission, and the people you love. That's it","Naval Ravikant");
        lifeQuotesList.add(lifeQuote2);

        QuotesList lifeQuote3 = new QuotesList("Life is from the inside out. When you shift on the inside, life shifts on the outside","kamal Ravikant");
        lifeQuotesList.add(lifeQuote3);

        QuotesList lifeQuote4 = new QuotesList("If you spend to much time thinking about a thing, you will never get it done.","Bruce Lee");
        lifeQuotesList.add(lifeQuote4);

        return lifeQuotesList;

    }

    public static List<QuotesList> getMotivationQuotes() {
        final List<QuotesList> motivationQuotesList = new ArrayList<>();

        QuotesList motivationQuote1 = new QuotesList("I was't there to compete. I was there to win.","Arnold Schwarzenegger");
        motivationQuotesList.add(motivationQuote1);

        QuotesList motivationQuote2 = new QuotesList("Someone once told me growth and comfort do not coexist.","Ginni Rometty");
        motivationQuotesList.add(motivationQuote2);

        QuotesList motivationQuote3 = new QuotesList("All the power is within you. You can do anything.","Swami Vivekananda");
        motivationQuotesList.add(motivationQuote3);

        QuotesList motivationQuote4 = new QuotesList("The place between your comfort zone and your dream is where life takes place.","Helen Keller");
        motivationQuotesList.add(motivationQuote4);

        return motivationQuotesList;
    }

    public static List<QuotesList> getLoveQuotes() {
        final List<QuotesList> loveQuotesList = new ArrayList<>();

        QuotesList loveQuote1 = new QuotesList("Nature is not a place to visit, it is home.", "Gary Snyder");
        loveQuotesList.add(loveQuote1);

        QuotesList loveQuote2 = new QuotesList("Some old-fashioned things like fresh air and sunshine are hard to beat.", "Laura Ingalls Wilder");
        loveQuotesList.add(loveQuote2);

        QuotesList loveQuote3 = new QuotesList("My wish is to stay always like this, living quietly in a corner of nature.", "Claude Monet");
        loveQuotesList.add(loveQuote3);

        QuotesList loveQuote4 = new QuotesList("Adopt the pace of nature. Her secret is patience.", "Ralph Waldo Emerson");
        loveQuotesList.add(loveQuote4);

        return loveQuotesList;
    }

    public static List<QuotesList> getEducationQuotes() {
        final List<QuotesList> educationQuotesList = new ArrayList<>();

        QuotesList educationQuote1 = new QuotesList("Education is the most powerful weapon which you can use to change the world.", "Nelson Mandela.");
        educationQuotesList.add(educationQuote1);

        QuotesList educationQuote2 = new QuotesList("Intelligence plus character-that is the goal of true education.", "-Martin Luther King Jr");
        educationQuotesList.add(educationQuote2);

        QuotesList educationQuote3 = new QuotesList("The beautiful thing about learning is that no one can take it away from you.", "B.B. King");
        educationQuotesList.add(educationQuote3);

        QuotesList educationQuote4 = new QuotesList("Education makes a people easy to lead but difficult to drive: easy to govern, but impossible to enslave.", "Peter Brougham");
        educationQuotesList.add(educationQuote4);

        return educationQuotesList;
    }

    public static List<QuotesList> getSuccessQuotes() {
        final List<QuotesList> successQuotesList = new ArrayList<>();

        QuotesList successQuote1 = new QuotesList("Success is the sum of small efforts, repeated day-in and day-out", "Robert Collier");
        successQuotesList.add(successQuote1);

        QuotesList successQuote2 = new QuotesList("Success is often achieved by those who don’t know that failure is inevitable.", "Coco Chanel");
        successQuotesList.add(successQuote2);

        QuotesList successQuote3 = new QuotesList("For our own success to be real, it must contribute to the success of others.", "Eleanor Roosevelt");
        successQuotesList.add(successQuote3);

        QuotesList successQuote4 = new QuotesList("Patience, persistence and perspiration make an unbeatable combination for success.", "Napoleon Hill");
        successQuotesList.add(successQuote4);

        return successQuotesList;
    }

    public static List<QuotesList> getFriendshipQuotes() {
        final List<QuotesList> friendshipQuotesList = new ArrayList<>();

        QuotesList friendshipQuote1 = new QuotesList("Things are never quite as scary when you've got a best friend.", "Bill Watterson");
        friendshipQuotesList.add(friendshipQuote1);

        QuotesList friendshipQuote2 = new QuotesList("Friendship is the only cement that will ever hold the world together.", "Woodrow Wilson");
        friendshipQuotesList.add(friendshipQuote2);

        QuotesList friendshipQuote3 = new QuotesList("A day without a friend is like a pot without a single drop of honey left inside.", "Winnie the Pooh");
        friendshipQuotesList.add(friendshipQuote3);

        QuotesList friendshipQuote4 = new QuotesList("The best mirror is an old friend.", "George Herbert");
        friendshipQuotesList.add(friendshipQuote4);

        return friendshipQuotesList;
    }
    }
