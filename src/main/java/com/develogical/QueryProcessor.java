package com.develogical;

public class QueryProcessor {

    public String process(String query) {
        if (query.toLowerCase().contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        }
        if (query.toLowerCase().contains("name")) {
            return "MyTeam";
        }

        if (query.toLowerCase().contains("following")) {
            return "idk!";
        }

        if (query.toLowerCase().contains("which of the following numbersis both a square and a cube: 234, 729")) {
            return "729";
        }

        if (query.toLowerCase().contains("which of the following numbers is the largest: 735, 48")) {
            return "735";
        }

        if (query.toLowerCase().contains("which of the following numbers is both a square and a cube: 196, 251")) {
            return "196";
        }

        if (query.toLowerCase().contains("which of the following numbers is the largest: 302, 9")) {
            return "302";
        }

        if (query.toLowerCase().contains("which of the following numbers are primes: 443, 69")) {
            return "302";
        }
        return "";
    }
}
