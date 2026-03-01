package project_part1;

import java.util.Scanner;

import java.util.Locale;

import project_part2.Printer;

import project_part3.MessageHandler;

public class Person implements Printer {

    public static int numberUsers;
    public static String nameSender;
    public static String textSender;

    public static class Message {

        private String text;
        private String sender;

        public Message(String text, String sender) {

            this.text = text;
            this.sender = sender;

        }

        public void setText(String text) {

            this.text = text;

        }

        public void setSender(String sender) {

            this.sender = sender;

        }

        public String getText() {

            return text;

        }

        public String getSender() {

            return sender;

        }

    }

    @Override
    public void print(Message message) {

        String text = message.getText();
        String sender = message.getSender();

        if ((text == null || text.isEmpty()) && (sender == null || sender.isEmpty())) {

            MessageHandler handler = (msg) ->

            System.out.println("Processing the empty message from anonymous user!");

            handler.handleMessage(message);

        } else if (sender != null && !sender.isEmpty()) {

            System.out.println("User " + sender + " sends the message: " + text);

        } else {

            System.out.println("Anonymous user sends the message: " + text);

        }

    }

    public static void main(String[] args) {

        Scanner enter = new Scanner(System.in);
        enter.useLocale(Locale.US);
        System.out.println("Hello! Welcome to the program demonstrating use of the inner classes and interface!");
        System.out.println("-".repeat(83));
        System.out.print("\n");
        System.out.print("Enter the number of users: ");
        numberUsers = enter.nextInt();
        enter.nextLine();
        System.out.print("\n");

        Person person = new Person();

        for (int i = 1; i <= numberUsers; i++) {

            System.out.print("Enter the text of the message: ");
            textSender = enter.nextLine();
            System.out.print("Enter the name sender of the message: ");
            nameSender = enter.nextLine();
            Person.Message messageUser = new Person.Message(textSender, nameSender);
            person.print(messageUser);
            System.out.print("\n");
            System.out.print("The data is correct: \"Yes\" or \"No\": ");
            String lineEnter = enter.nextLine();
            System.out.print("\n");

            while (lineEnter.equals("No")) {

                System.out.print("Enter the text of the message: ");
                textSender = enter.nextLine();
                messageUser.setText(textSender);
                System.out.print("Enter the name sender of the message: ");
                nameSender = enter.nextLine();
                messageUser.setSender(nameSender);
                System.out.print("\n");
                String updatedText = messageUser.getText();
                System.out.print("Updated the text of the message: " + updatedText);
                String updatedName = messageUser.getSender();
                System.out.print("Updated the name sender of the message: " + updatedName);
                System.out.println();
                System.out.print("\n");
                System.out.print("The data is correct: \"Yes\" or \"No\": ");
                lineEnter = enter.nextLine();
                System.out.print("\n");

            }

        }

        System.out.println("-".repeat(21));
        System.out.println("Always happy to help!");

    }

}