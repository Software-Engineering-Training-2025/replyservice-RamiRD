package org.example;

/**
 * Students implement this method to return the exact outputs defined in README.
 */

public class ReplyService {



    public String reply(String message, ReplyType type) {
        // TODO: Implement mapping according to README canonical expectations.
        // Requirements:
        // - null or blank -> "Please say something."
        // - For known messages, return exact string for each ReplyType.
        // - For unknown messages, return the 'any other text' mapping.


        if(message==null||message.trim().isEmpty())


            return "Please say something.";
        String in = message.trim().toLowerCase();

        if (in.equals("hi")) {
            switch (type) {
                case FORMAL:
                    return "Hello. How may I assist you today?";
                case FRIENDLY:
                    return "Hey there! \uD83D\uDE0A How can I help?";
                case CONCISE:
                    return "Hello. How can I help?";
            }


        } else if (in.equals("hello")) {

            switch (type) {
                case FORMAL:
                    return "Hello. How may I assist you today?";
                case FRIENDLY:
                    return "Hi! \uD83D\uDC4B What’s up?";
                case CONCISE:
                    return "Hello. How can I help?";

            }

        } else if (in.equals("how are you")) {
            switch (type) {
                case FORMAL:
                    return "I am functioning properly. How may I assist you?";
                case FRIENDLY:
                    return "Doing great! \uD83D\uDE04 How can I help?";
                case CONCISE:
                    return "I’m good. How can I help?";

            }

        } else if (in.equals("i need help")) {
            switch (type) {
                case FORMAL:
                    return "I can assist with that. Please provide more details.";
                case FRIENDLY:
                    return "I’ve got you! \uD83D\uDE42 Tell me a bit more.";
                case CONCISE:
                    return "Share details; I’ll help.";
            }

        } else if (in.equals("can you help me with my account")) {
            switch (type) {
                case FORMAL:
                    return "Certainly. Please describe the account issue.";
                case FRIENDLY:
                    return "Sure thing! \uD83D\uDE0A What’s wrong with the account?";
                case CONCISE:
                    return "Describe the account issue…";
            }

        } else if (in.equals("thanks")) {
            switch (type) {
                case FORMAL:
                    return "You are welcome.";
                case FRIENDLY:
                    return "Anytime! \uD83D\uDE4C";
                case CONCISE:
                    return "You’re welcome.";
            }

        } else if (in.equals("bye")) {

            switch (type) {
                case FORMAL:
                    return "Goodbye.";
                case FRIENDLY:
                    return "See you later! \uD83D\uDC4B";
                case CONCISE:
                    return "Goodbye.";
            }
        } else if (in.equals("what is your name")) {

            switch (type) {
                case FORMAL:
                    return "I am your virtual assistant.";
                case FRIENDLY:
                    return "I’m your helper bot \uD83E\uDD16";
                case CONCISE:
                    return "I’m your assistant.";
            }
        } else  {


            switch (type) {
                case FORMAL:
                    return "Could you clarify your request?";
                case FRIENDLY:
                    return "Could you tell me more?";
                case CONCISE:
                    return "Please clarify.";
            }


        }
        throw new UnsupportedOperationException("Not implemented yet"); }

    }


